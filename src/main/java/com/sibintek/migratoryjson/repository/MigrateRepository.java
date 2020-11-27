package com.sibintek.migratoryjson.repository;

import com.sibintek.migratoryjson.entity.Migrate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MigrateRepository extends JpaRepository<Migrate, Integer> {
    Migrate findAllById(Integer id);
}
