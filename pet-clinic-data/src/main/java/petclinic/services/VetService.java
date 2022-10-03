package petclinic.services;

import petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet finbyID(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
