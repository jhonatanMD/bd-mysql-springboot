package com.ws.entity.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class ProductResponse {

    private Long id;
    private String name;
    private String status;
    private LocalDate create_date;
}
