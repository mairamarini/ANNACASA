package org.academiadecodigo.asciimos.controller;

import org.academiadecodigo.asciimos.assembler.CompanyAssembler;
import org.academiadecodigo.asciimos.dto.CompanyDto;
import org.academiadecodigo.asciimos.model.Company;
import org.academiadecodigo.asciimos.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RequestMapping("/api/companies")
@RestController
public class RestCompanyController {

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

    @GetMapping(path = "/")
    public ResponseEntity<?> listCompanies() {
        List<Company> companies = companyService.listCompanies();
        List<CompanyDto> companyDtos = new ArrayList<>();

        for (Company comp : companies) {
            companyDtos.add(companyAssembler.convertToCompanyDto(comp));
        }

        return new ResponseEntity<>(companyDtos, HttpStatus.OK);
    }
}
