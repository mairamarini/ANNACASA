package org.academiadecodigo.asciimos.service;

import org.academiadecodigo.asciimos.dao.jpa.UserDao;
import org.academiadecodigo.asciimos.model.House;
import org.academiadecodigo.asciimos.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public User getUser(Integer id) {
        return userDao.findById(id);
    }

    @Transactional
    public List<House> listHouses(Integer id) {
        User user = getUser(id);

        return user.getHouses();
    }



    @Transactional
    public User addUser(User user) {
        return userDao.saveOrUpdate(user);
    }

    @Transactional
    public Boolean auth(String phone, String password) {
        List<User> users = userDao.findAll();

        for (User user : users) {
            if (user.getPassword().equals(password) && user.getPhone().equals(phone)) {
                return true;
            }
        }

        return false;
    }
}
