package com.ws.app;

import com.ws.entity.Brand;
import com.ws.entity.Products;
import com.ws.entity.dto.BrandResponse;
import com.ws.entity.dto.ProductResponse;
import com.ws.repository.BrandRepository;
import com.ws.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/brand")
public class BrandController {


    private final BrandRepository brandRepository;

    @GetMapping("/getAll")
    public List<BrandResponse> getAll(){

        return  brandRepository.findAll().stream().parallel().map(r ->
             BrandResponse.builder()
                    .id(r.getId())
                    .name(r.getName())
                    .product(r.getProduct().stream().map(p ->
                         ProductResponse.builder()
                                .id(p.getId())
                                .name(p.getName())
                                .status(p.getStatus())
                                .create_date(p.getCreate_date())
                                .build()
        ).collect(Collectors.toList()))
                    .build()
        ).collect(Collectors.toList());
    }



}

