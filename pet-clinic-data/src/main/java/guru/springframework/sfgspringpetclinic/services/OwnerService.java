package guru.springframework.sfgspringpetclinic.services;

import guru.springframework.sfgspringpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String LastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
