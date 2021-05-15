package org.springframeworkguru.sfgpetclinicdemo.services.map;

import org.springframeworkguru.sfgpetclinicdemo.model.Owner;
import org.springframeworkguru.sfgpetclinicdemo.model.Vet;
import org.springframeworkguru.sfgpetclinicdemo.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
        @Override
        public Vet findById(Long id) {
            return super.findById(id);
        }
//
//    @Override
//    public Owner Save(Long id,Owner owner) {
//        return super.save(id,owner);
//    }

        @Override
        public Vet Save(Long id,Vet vet) {
            return super.save(id,vet);
        }

        @Override
        public Set<Vet> findAll() {
            return super.findAll();
        }

        @Override
        public void deleteById(Long id) {
            super.deleteById(id);
        }

        @Override
        public void delete(Vet owner) {
            super.delete(owner);

        }
    }


