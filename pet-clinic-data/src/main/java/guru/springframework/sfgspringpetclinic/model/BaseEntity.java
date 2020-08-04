package guru.springframework.sfgspringpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    //use box type: 1. recommended for Hibernate.   2. value can be null.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
