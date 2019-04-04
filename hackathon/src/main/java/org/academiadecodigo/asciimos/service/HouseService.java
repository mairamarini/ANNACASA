package org.academiadecodigo.asciimos.service;

import org.academiadecodigo.asciimos.dao.jpa.HouseDao;
import org.academiadecodigo.asciimos.model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseService {

    private HouseDao houseDao;


    @Autowired
    public void setHouseDao(HouseDao houseDao) {
        this.houseDao = houseDao;
    }

    @Transactional
    public House getHouse(Integer id) {
        return houseDao.findById(id);
    }

    @Transactional
    public List<House> listHouses() {
        return houseDao.findAll();
    }

    @Transactional
    public House addHouse(House house) {
        return houseDao.saveOrUpdate(house);
    }

    @Transactional
    public void deleteHouse(Integer id) {
        houseDao.delete(id);
    }

}
