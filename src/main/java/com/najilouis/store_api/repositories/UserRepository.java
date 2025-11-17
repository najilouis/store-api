package com.najilouis.store_api.repositories;

import com.najilouis.store_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}