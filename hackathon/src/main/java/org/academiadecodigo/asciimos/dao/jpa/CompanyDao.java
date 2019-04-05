package org.academiadecodigo.asciimos.dao.jpa;

import org.academiadecodigo.asciimos.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyDao extends AbstractJpaDao<Company> {

    public CompanyDao() {
        super(Company.class);
    }
}
