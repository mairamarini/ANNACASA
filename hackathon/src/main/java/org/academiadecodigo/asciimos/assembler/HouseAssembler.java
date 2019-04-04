package org.academiadecodigo.asciimos.assembler;

import org.academiadecodigo.asciimos.dto.HouseDto;
import org.academiadecodigo.asciimos.model.House;
import org.academiadecodigo.asciimos.model.User;
import org.springframework.stereotype.Component;

@Component
public class HouseAssembler {

    public House convertToRealHouse(HouseDto houseDto) {
        House house = new House();

        house.setAddress(houseDto.getAddress());
        house.setBudget(houseDto.getBudget());
        house.setRooms(houseDto.getRooms());
        house.setHouseType(houseDto.getHouseType());

        return house;
    }


}
