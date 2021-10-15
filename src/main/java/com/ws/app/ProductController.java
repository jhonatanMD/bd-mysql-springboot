package com.ws.app;

import com.ws.entity.Products;
import com.ws.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ws")
public class ProductController {


    private final ProductRepository productRepository;

    @GetMapping("/getAll")
    public List<Products> getAll(){
        return productRepository.findAll();
    }

    @PostMapping("/save")
    public Products create(@RequestBody Products product){

        return productRepository.save(product);
    }

}

