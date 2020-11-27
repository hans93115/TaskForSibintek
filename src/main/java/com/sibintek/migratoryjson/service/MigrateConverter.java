package com.sibintek.migratoryjson.service;

import com.google.gson.Gson;
import com.sibintek.migratoryjson.dto.MigrateDto;
import com.sibintek.migratoryjson.entity.Migrate;
import org.springframework.stereotype.Component;

@Component
public class MigrateConverter {

    public Migrate fromMigrateDtoToDto (Object migrateDto){
    Migrate migrate = new Migrate();
    Gson gson = new Gson();
    migrate.setJson_columns(gson.toJson(migrateDto));
    return migrate;
    }


   /* public MigrateDto fromMigrateToMigrateDto(Migrate migrate){
        return MigrateDto.builder()
                .id(migrate.getId())
                .name(migrate.getName())
                .sex(migrate.getSex())
                .city(migrate.getCity())
                .build();
    }*/
}
