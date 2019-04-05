package org.academiadecodigo.asciimos.controller;

import org.academiadecodigo.asciimos.assembler.CompanyAssembler;
import org.academiadecodigo.asciimos.assembler.HouseAssembler;
import org.academiadecodigo.asciimos.dto.CompanyDto;
import org.academiadecodigo.asciimos.dto.HouseDto;
import org.academiadecodigo.asciimos.model.Company;
import org.academiadecodigo.asciimos.model.House;
import org.academiadecodigo.asciimos.service.CompanyService;
import org.academiadecodigo.asciimos.service.HouseService;
import org.academiadecodigo.asciimos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/house")
public class RestHouseController {

    private HouseAssembler houseAssembler;
    private HouseService houseService;
    private UserService userService;
    private CompanyService companyService;
    private CompanyAssembler companyAssembler;

    @Autowired
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }

    @Autowired
    public void setCompanyAssembler(CompanyAssembler companyAssembler) {
        this.companyAssembler = companyAssembler;
    }

    @Autowired
    public void setHouseAssembler(HouseAssembler houseAssembler) {
        this.houseAssembler = houseAssembler;
    }

    @Autowired
    public void setHouseService(HouseService houseService) {
        this.houseService = houseService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/")
    public ResponseEntity<?> addHouse(/*@PathVariable("id") Integer id, */@Valid @RequestBody HouseDto houseDto, BindingResult binding, UriComponentsBuilder builder) {

        /*if (binding.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }*/

        House house = houseAssembler.convertToRealHouse(houseDto);
        //house.setUser(userService.getUser(id));
        houseService.addHouse(house);
/*
        UriComponents component = builder.path("/api/rrr/" + house.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(component.toUri());
*/
        return new ResponseEntity<>(houseDto, HttpStatus.CREATED);
    }

    @GetMapping(path = "/filtered")
    public ResponseEntity<?> filteredCompanies(@RequestParam(name = "id") List<Integer> workIds) {
        List<Company> companies = companyService.listCompanies();

        List<CompanyDto> toReturn = new LinkedList<>();

        for (Company company : companies) {
            if (workIds.contains(company.getWork().getId())) {
                toReturn.add(companyAssembler.convertToCompanyDto(company));
            }
        }

        return new ResponseEntity<>(toReturn, HttpStatus.OK);
    }

}
