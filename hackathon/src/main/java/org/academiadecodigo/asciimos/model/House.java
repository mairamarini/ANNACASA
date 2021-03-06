package org.academiadecodigo.asciimos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "house")
public class House extends AbstractModel {

    private String address;
    private String rooms;
    private String houseType;
    private Integer budget;

    @ManyToOne
    private User user;

    @ManyToMany(mappedBy = "houses", fetch = FetchType.EAGER)
    private Set<Work> work;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Work> getWork() {
        return work;
    }

    public void setWork(Set<Work> work) {
        this.work = work;
    }
}
