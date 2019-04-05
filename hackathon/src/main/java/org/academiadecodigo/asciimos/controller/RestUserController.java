package org.academiadecodigo.asciimos.controller;

import org.academiadecodigo.asciimos.assembler.UserAssembler;
import org.academiadecodigo.asciimos.dto.HouseDto;
import org.academiadecodigo.asciimos.dto.UserDto;
import org.academiadecodigo.asciimos.model.House;
import org.academiadecodigo.asciimos.model.User;
import org.academiadecodigo.asciimos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@CrossOrigin("*")
@RequestMapping(value = "/api/user")
@RestController
public class RestUserController {

    private UserAssembler userAssembler;
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserAssembler(UserAssembler userAssembler) {
        this.userAssembler = userAssembler;
    }

    @PostMapping(path = "/")
    public ResponseEntity<?> addUser(@Valid @RequestBody UserDto userDto, BindingResult binding, UriComponentsBuilder builder) {

        if (binding.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        User user = userAssembler.convertToRealUser(userDto);
        userService.addUser(user);
/*
        UriComponents component = builder.path("/api/rrr/" + house.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(component.toUri());
*/
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
