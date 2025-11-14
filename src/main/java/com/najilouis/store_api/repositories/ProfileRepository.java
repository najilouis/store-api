package com.najilouis.store_api.repositories;

import com.najilouis.store_api.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}