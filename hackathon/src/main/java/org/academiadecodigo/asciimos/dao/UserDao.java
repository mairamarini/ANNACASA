package org.academiadecodigo.asciimos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserDao {

    @PersistenceContext
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
