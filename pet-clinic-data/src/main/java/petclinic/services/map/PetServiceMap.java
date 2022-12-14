package petclinic.services.map;

import petclinic.model.Pet;
import petclinic.services.CrudService;
import petclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
    @Override
    public Pet save(Pet object) {
        return super.save(0l, object);
    }
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
