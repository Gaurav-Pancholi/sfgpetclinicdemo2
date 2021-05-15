package org.springframeworkguru.sfgpetclinicdemo.services;

import org.springframeworkguru.sfgpetclinicdemo.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {


    Owner findbyLastName(String LastName);

}
