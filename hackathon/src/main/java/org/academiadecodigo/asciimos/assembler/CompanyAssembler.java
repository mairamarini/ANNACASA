package org.academiadecodigo.asciimos.assembler;

import org.academiadecodigo.asciimos.dto.CompanyDto;
import org.academiadecodigo.asciimos.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyAssembler {

    public CompanyDto convertToCompanyDto(Company company) {
        CompanyDto companyDto = new CompanyDto();

        companyDto.setName(company.getName());
        companyDto.setEmail(company.getEmail());
        companyDto.setPhone(company.getPhone());

        return companyDto;
    }
}
