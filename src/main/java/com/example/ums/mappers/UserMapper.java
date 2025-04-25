package com.example.ums.mappers;

import com.example.ums.dto.UserRegisterDTO;
import com.example.ums.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserRegisterDTO toDto(User user);

    @Mapping(target = "id", ignore = true)
    User toEntity(UserRegisterDTO dto);
}
