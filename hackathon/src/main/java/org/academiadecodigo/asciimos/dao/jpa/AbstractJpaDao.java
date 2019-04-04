package org.academiadecodigo.asciimos.dao.jpa;

import org.academiadecodigo.asciimos.dao.Dao;
import org.academiadecodigo.asciimos.model.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

public abstract class AbstractJpaDao<T extends Model> implements Dao<T> {

    protected Class<T> modelType;
    @PersistenceContext
    protected EntityManager em;


    public AbstractJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Transactional
    @Override
    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }
}
