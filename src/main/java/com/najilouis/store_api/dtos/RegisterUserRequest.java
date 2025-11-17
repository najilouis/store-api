package com.najilouis.store_api.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Setter
//@Getter
@Data
public class RegisterUserRequest {
    private String name;
    private String email;
    private String password;
}
