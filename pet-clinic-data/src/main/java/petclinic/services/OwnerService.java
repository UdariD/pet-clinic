package petclinic.services;

import petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner finbyID(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
