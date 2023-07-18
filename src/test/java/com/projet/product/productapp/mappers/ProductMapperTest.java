package com.projet.product.productapp.mappers;

import com.projet.product.productapp.dtos.ProductDto;
import com.projet.product.productapp.entities.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductMapperTest {

    @Test
    void given_product_id_map_productDto_id() {
        //Given
        Product product = Product.builder().id(1L).build();

        //WHEN
        final ProductDto productDto = ProductMapper.INSTANCE.productToProductDto(product);

        //THEN
        Assertions.assertEquals(product.getId(), productDto.getId());
    }

    @Test
    void given_productDto_id_map_product_id() {
        //Given
        ProductDto productDto = ProductDto.builder().id(1L).build();

        //WHEN
        final Product product = ProductMapper.INSTANCE.producDtoToProduct(productDto);

        //THEN
        Assertions.assertEquals(product.getId(), productDto.getId());
    }


    @Test
    void given_product_name_map_productDto_name() {
        //Given
        Product product = Product.builder().name("String").build();

        //WHEN
        final ProductDto productDto = ProductMapper.INSTANCE.productToProductDto(product);

        //THEN
        Assertions.assertEquals(product.getName(), productDto.getName());
    }

    @Test
    void given_productDto_name_map_product_name() {
        //Given
        ProductDto productDto = ProductDto.builder().name("String").build();

        //WHEN
        final Product product = ProductMapper.INSTANCE.producDtoToProduct(productDto);

        //THEN
        Assertions.assertEquals(product.getName(), productDto.getName());
    }


    @Test
    void given_product_price_map_productDto_price() {
        //Given
        Product product = Product.builder().price(1d).build();

        //WHEN
        final ProductDto productDto = ProductMapper.INSTANCE.productToProductDto(product);

        //THEN
        Assertions.assertEquals(product.getPrice(), productDto.getPrice());
    }

    @Test
    void given_productDto_price_map_product_price() {
        //Given
        ProductDto productDto = ProductDto.builder().price(1d).build();

        //WHEN
        final Product product = ProductMapper.INSTANCE.producDtoToProduct(productDto);

        //THEN
        Assertions.assertEquals(product.getPrice(), productDto.getPrice());
    }

    @Test
    void given_product_quantity_map_productDto_quantity() {
        //Given
        Product product = Product.builder().quantity(1).build();

        //WHEN
        final ProductDto productDto = ProductMapper.INSTANCE.productToProductDto(product);

        //THEN
        Assertions.assertEquals(product.getQuantity(), productDto.getQuantity());
    }

    @Test
    void given_productDto_quantity_map_product_quantity() {
        //Given
        ProductDto productDto = ProductDto.builder().quantity(1).build();

        //WHEN
        final Product product = ProductMapper.INSTANCE.producDtoToProduct(productDto);

        //THEN
        Assertions.assertEquals(product.getQuantity(), productDto.getQuantity());
    }

    @Test
    void given_product_selected_map_productDto_selected() {
        //Given
        Product product = Product.builder().selected(true).build();

        //WHEN
        final ProductDto productDto = ProductMapper.INSTANCE.productToProductDto(product);

        //THEN
        Assertions.assertEquals(product.isSelected(), product.isSelected());

    }

    @Test
    void given_productDto_selected_map_product_selected() {
        //Given
        ProductDto productDto = ProductDto.builder().selected(true).build();

        //WHEN
        final Product product = ProductMapper.INSTANCE.producDtoToProduct(productDto);

        //THEN
        Assertions.assertEquals(product.isSelected(), productDto.isSelected());
    }


    @Test
    void given_product_available_map_productDto_available() {
        //Given
        Product product = Product.builder().available(true).build();

        //WHEN
        final ProductDto productDto = ProductMapper.INSTANCE.productToProductDto(product);

        //THEN
        Assertions.assertEquals(product.isAvailable(), product.isAvailable());

    }

    @Test
    void given_productDto_available_map_product_available() {
        //Given
        ProductDto productDto = ProductDto.builder().available(true).build();

        //WHEN
        final Product product = ProductMapper.INSTANCE.producDtoToProduct(productDto);

        //THEN
        Assertions.assertEquals(product.isAvailable(), productDto.isAvailable());
    }
}
