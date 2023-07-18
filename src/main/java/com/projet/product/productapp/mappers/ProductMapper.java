package com.projet.product.productapp.mappers;

import com.projet.product.productapp.dtos.ProductDto;
import com.projet.product.productapp.entities.Product;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "selected", target = "selected")
    @Mapping(source = "available", target = "available")
    ProductDto productToProductDto(Product product);


    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "selected", target = "selected")
    @Mapping(source = "available", target = "available")
    Product producDtoToProduct(ProductDto productDto);


}
