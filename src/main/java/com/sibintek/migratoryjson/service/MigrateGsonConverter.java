package com.sibintek.migratoryjson.service;

import com.google.gson.Gson;
import com.sibintek.migratoryjson.dto.MigrateDto;
import com.sibintek.migratoryjson.entity.Migrate;
import com.sibintek.migratoryjson.entity.MigrateGson;
import org.springframework.stereotype.Component;


@Component
public class MigrateGsonConverter {


    Gson g = new Gson();
    public String jsonString;
    MigrateGson migrateGson = g.fromJson(jsonString, MigrateGson.class);
}
