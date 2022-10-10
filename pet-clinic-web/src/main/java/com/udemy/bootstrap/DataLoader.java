package com.udemy.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import petclinic.model.Owner;
import petclinic.model.Vet;
import petclinic.services.OwnerService;
import petclinic.services.VetService;
import petclinic.services.map.OwnerServiceMap;
import petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner=new Owner();
        owner.setId(1L);
        owner.setFirstName("Isuri");
        owner.setLastName("Pannala");

        ownerService.save(owner);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Kalana");
        owner2.setLastName("Dissanayake");

        ownerService.save(owner2);

        System.out.println("Loading Owners ....");

        Vet vet=new Vet();
        vet.setId(1L);
        vet.setFirstName("Vet 1");
        vet.setLastName("Vet 11");

        vetService.save(vet);

        Vet vet2=new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Vet 2");
        vet2.setLastName("Vet 222");

        vetService.save(vet2);

        System.out.println("Loading Vets ....");

    }
}
