package org.academiadecodigo.asciimos.controller;

import org.academiadecodigo.asciimos.assembler.HouseAssembler;
import org.academiadecodigo.asciimos.dto.HouseDto;
import org.academiadecodigo.asciimos.model.House;
import org.academiadecodigo.asciimos.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/house")
public class RestHouseController {

    private HouseAssembler houseAssembler;
    private HouseService houseService;

    @Autowired
    public void setHouseAssembler(HouseAssembler houseAssembler) {
        this.houseAssembler = houseAssembler;
    }

    @Autowired
    public void setHouseService(HouseService houseService) {
        this.houseService = houseService;
    }


    @PostMapping(path = "/")
    public ResponseEntity<?> addHouse(@Valid @RequestBody HouseDto houseDto, BindingResult binding, UriComponentsBuilder builder) {

        if (binding.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        House house = houseAssembler.convertToRealHouse(houseDto);
        houseService.addHouse(house);
/*
        UriComponents component = builder.path("/api/rrr/" + house.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(component.toUri());
*/
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
