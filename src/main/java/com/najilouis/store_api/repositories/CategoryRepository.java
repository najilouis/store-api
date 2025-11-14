package com.najilouis.store_api.repositories;

import com.najilouis.store_api.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}