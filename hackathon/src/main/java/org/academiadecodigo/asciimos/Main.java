package org.academiadecodigo.asciimos;

import org.academiadecodigo.asciimos.dao.jpa.HouseDao;
import org.academiadecodigo.asciimos.model.House;
import org.academiadecodigo.asciimos.model.Model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/spring/spring-config.xml");

        HouseDao houseDao = context.getBean("houseDao", HouseDao.class);;
        Model house = new House();
        System.out.println(houseDao.saveOrUpdate(house).toString());

    }

}
