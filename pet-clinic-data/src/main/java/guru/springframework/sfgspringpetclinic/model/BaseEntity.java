package guru.springframework.sfgspringpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;    //use box type: 1. recommended for Hibernate.   2. value can be null.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
