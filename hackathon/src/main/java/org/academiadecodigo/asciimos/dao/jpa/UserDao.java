package org.academiadecodigo.asciimos.dao.jpa;

import org.academiadecodigo.asciimos.dao.jpa.AbstractJpaDao;
import org.academiadecodigo.asciimos.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserDao extends AbstractJpaDao {


    public UserDao() {
        super(User.class);
    }
}
