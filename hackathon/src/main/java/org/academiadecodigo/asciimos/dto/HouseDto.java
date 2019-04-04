package org.academiadecodigo.asciimos.dto;

import org.academiadecodigo.asciimos.model.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HouseDto {

    private Integer id;
    private User user;

    @NotNull(message = "Address is mandatory")
    @NotBlank(message = "Address is mandatory")
    @Size(min = 3, max = 255)
    private String address;

    @NotNull(message = "Please, tell us how many rooms has your house")
    @NotBlank(message = "Please, tell us how many rooms has your house")
    @Size(min = 3, max = 255)
    private String rooms;

    @NotNull(message = "House Type is mandatory")
    @NotBlank(message = "House Type is mandatory")
    @Size(min = 3, max = 255)
    private String houseType;

    private Integer budget;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }
}
