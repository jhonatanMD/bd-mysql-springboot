package com.ws.app;

import com.ws.entity.Brand;
import com.ws.entity.Products;
import com.ws.repository.BrandRepository;
import com.ws.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/brand")
public class BrandController {


    private final BrandRepository brandRepository;

    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return  brandRepository.findAll();
    }



}

