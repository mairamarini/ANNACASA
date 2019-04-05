package org.academiadecodigo.asciimos.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends AbstractModel {

    private String name;
    private String phone;
    private String email;
    private String password;
    //password

    @OneToMany(
            // propagate changes on customer entity to account entities
            cascade = {CascadeType.ALL},

            // make sure to remove accounts if unlinked from customer
            orphanRemoval = true,

            // user customer foreign key on account table to establish
            // the many-to-one relationship instead of a join table
            mappedBy = "user",

            // fetch accounts from database together with user
            fetch = FetchType.EAGER
    )
    private List<House> houses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", houses=" + houses +
                '}';
    }
}
