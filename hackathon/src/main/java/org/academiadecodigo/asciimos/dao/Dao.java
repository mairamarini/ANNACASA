package org.academiadecodigo.asciimos.dao;

import org.academiadecodigo.asciimos.model.Model;

import java.util.List;

public interface Dao<T extends Model> {

    List<T> findAll();

    T saveOrUpdate(T modelObject);

    T findById(Integer id);

    void delete(Integer id);
}
