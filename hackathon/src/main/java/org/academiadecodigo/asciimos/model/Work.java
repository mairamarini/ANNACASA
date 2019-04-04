package org.academiadecodigo.asciimos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "work")
public class Work extends AbstractModel {

    @OneToMany(mappedBy = "work")
    private Set<Company> work = new HashSet<>();
    private String workType;

    public Set<Company> getWork() {
        return work;
    }

    public void setWork(Set<Company> work) {
        this.work = work;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }
}
