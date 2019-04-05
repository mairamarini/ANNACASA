package org.academiadecodigo.asciimos.service;

import org.academiadecodigo.asciimos.dao.jpa.CompanyDao;
import org.academiadecodigo.asciimos.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyService {

    private CompanyDao companyDao;

    @Autowired
    public void setCompanyDao(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Transactional
    public List<Company> listCompanies() {
        return companyDao.findAll();
    }
}
