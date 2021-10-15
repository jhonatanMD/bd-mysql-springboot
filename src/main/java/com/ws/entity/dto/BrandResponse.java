package com.ws.entity.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class BrandResponse {

    private Long id;
    private String name;
    private List<ProductResponse> product;

}
