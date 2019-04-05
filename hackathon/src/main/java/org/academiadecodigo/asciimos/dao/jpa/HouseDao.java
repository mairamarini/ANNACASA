package org.academiadecodigo.asciimos.dao.jpa;

import org.academiadecodigo.asciimos.dao.jpa.AbstractJpaDao;
import org.academiadecodigo.asciimos.model.House;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class HouseDao extends AbstractJpaDao<House> {

    public HouseDao() {
        super(House.class);
    }
}
