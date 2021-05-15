package org.springframeworkguru.sfgpetclinicdemo.services.map;

import org.springframeworkguru.sfgpetclinicdemo.model.Pet;
import org.springframeworkguru.sfgpetclinicdemo.model.Vet;
import org.springframeworkguru.sfgpetclinicdemo.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
//
//    @Override
//    public Owner Save(Long id,Owner owner) {
//        return super.save(id,owner);
//    }

    @Override
    public Pet Save(Long id,Pet vet) {
        return super.save(id,vet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet owner) {
        super.delete(owner);

    }
}



