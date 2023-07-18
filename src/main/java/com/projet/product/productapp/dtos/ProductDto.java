package com.projet.product.productapp.dtos;

import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductDto {

    private Long id;


    private String name;

    private Double price;

    private int quantity;

    private boolean selected;
    private boolean available;

}
