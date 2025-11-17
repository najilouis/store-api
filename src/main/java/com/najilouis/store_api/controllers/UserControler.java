package com.najilouis.store_api.controllers;

import com.najilouis.store_api.dtos.UserDto;
import com.najilouis.store_api.entities.User;
import com.najilouis.store_api.mappers.UserMapper;
import com.najilouis.store_api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserControler {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

//    public UserControler(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }

    @GetMapping
    public Iterable<UserDto> getAllUsers(
            @RequestHeader(name = "x-auth-token", required = false) String authToken,
            // /users?sort=email
            @RequestParam(required = false, defaultValue = "", name = "sort") String sortBy
    ) {

        System.out.println("authToken: "+ authToken);
        if(!Set.of("name", "email").contains(sortBy)){
            sortBy = "name";
        }
        return userRepository.findAll(Sort.by(sortBy))
                .stream()
//                .map(user -> userMapper.toDto(user))
                .map(userMapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
        var user = userRepository.findById(id).orElse(null);
        if(user == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            return ResponseEntity.notFound().build();
        }
//        return new ResponseEntity<>(user, HttpStatus.OK);

        return ResponseEntity.ok(userMapper.toDto(user));
    }
}
