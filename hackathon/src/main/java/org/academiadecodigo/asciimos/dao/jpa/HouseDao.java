package org.academiadecodigo.asciimos.dao.jpa;

import org.academiadecodigo.asciimos.dao.jpa.AbstractJpaDao;
import org.academiadecodigo.asciimos.model.House;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class HouseDao extends AbstractJpaDao {

 public HouseDao(){
     super(House.class);

    }
}
