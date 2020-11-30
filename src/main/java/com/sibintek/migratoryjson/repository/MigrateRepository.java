package com.sibintek.migratoryjson.repository;

import com.sibintek.migratoryjson.model.Migrate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MigrateRepository extends JpaRepository<Migrate, Integer> {

    @Query(nativeQuery = true, value = "select * from migrate_table join " +
            "jsonb_each_text(migrate_table.json_column) e on true where e.value = ?")
    List<Migrate> searchByValue(String searchValue);


}
