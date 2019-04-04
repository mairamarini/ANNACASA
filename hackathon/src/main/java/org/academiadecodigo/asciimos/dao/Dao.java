package org.academiadecodigo.asciimos.dao;

import org.academiadecodigo.asciimos.model.Model;

public interface Dao<T extends Model> {

    T saveOrUpdate(T modelObject);
}
