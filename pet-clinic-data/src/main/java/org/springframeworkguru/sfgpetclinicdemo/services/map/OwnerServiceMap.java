package org.springframeworkguru.sfgpetclinicdemo.services.map;

import org.springframeworkguru.sfgpetclinicdemo.model.Owner;
import org.springframeworkguru.sfgpetclinicdemo.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
//
//    @Override
//    public Owner Save(Long id,Owner owner) {
//        return super.save(id,owner);
//    }

    @Override
    public Owner Save(Long id,Owner owner) {
        return super.save(id,owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);

    }
}
