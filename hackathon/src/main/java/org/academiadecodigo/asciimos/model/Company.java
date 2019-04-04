package org.academiadecodigo.asciimos.model;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company extends AbstractModel {

    private String name;
    private String email;
    private String phone;

    @ManyToOne
    private Work work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
