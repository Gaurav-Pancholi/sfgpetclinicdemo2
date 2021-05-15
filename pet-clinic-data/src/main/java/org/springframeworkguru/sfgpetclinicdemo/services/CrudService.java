package org.springframeworkguru.sfgpetclinicdemo.services;

import org.springframeworkguru.sfgpetclinicdemo.model.Owner;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById(ID id);
    T Save(ID id,T t);
    Set<T> findAll();
    void delete(T t );
    void deleteById(ID id);

}
