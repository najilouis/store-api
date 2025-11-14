package com.najilouis.store_api.repositories;

import com.najilouis.store_api.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}