package com.najilouis.store_api.mappers;

import com.najilouis.store_api.dtos.ProductDto;
import com.najilouis.store_api.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);
}
