package guru.springframework.sfgspringpetclinic.services;

import guru.springframework.sfgspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String LastName);

    Owner findById(Long id);

    Owner Save(Owner owner);

    Set<Owner> findAll();
}
