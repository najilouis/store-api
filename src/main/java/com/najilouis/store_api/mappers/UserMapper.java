package com.najilouis.store_api.mappers;

import com.najilouis.store_api.dtos.RegisterUserRequest;
import com.najilouis.store_api.dtos.UpdateUserRequest;
import com.najilouis.store_api.dtos.UserDto;
import com.najilouis.store_api.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(target =  "createdAt", expression = "java(java.time.LocalDateTime.now())")
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
