package org.academiadecodigo.asciimos.dao.jpa;

import org.academiadecodigo.asciimos.dao.jpa.AbstractJpaDao;
import org.academiadecodigo.asciimos.model.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class UserDao extends AbstractJpaDao<User> {


    public UserDao() {
        super(User.class);
    }
}
