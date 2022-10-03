package petclinic.services;

import petclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet finbyID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
