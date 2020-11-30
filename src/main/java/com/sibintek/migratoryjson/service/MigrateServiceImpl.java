package com.sibintek.migratoryjson.service;

import com.sibintek.migratoryjson.JsonHelper.JsonConverter;
import com.sibintek.migratoryjson.model.Migrate;
import com.sibintek.migratoryjson.repository.MigrateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
@AllArgsConstructor

public class MigrateServiceImpl implements MigrateService {
    private final MigrateRepository migrateRepository;


    @Override
    public Migrate saveJson(Object jsonObject) {
        JsonConverter jsonConverter = new JsonConverter();
        Migrate migrate = new Migrate();
        migrate.setId(jsonConverter.getIDByKey(jsonObject));
        migrate.setJson_column(jsonConverter.getJsonString(jsonObject));
        return migrateRepository.save(migrate);
    }

    @Override
    public List<Map<String, Object>> getAll() {
        JsonConverter jsonConverter = new JsonConverter();
        List<Migrate> migrateList = migrateRepository.findAll();
        List<Map<String, Object>> resultList = new ArrayList<>();
        for (Migrate migrate :
                migrateList) {
            resultList.add(jsonConverter.getJsonObject(migrate.getJson_column()));
        }
        return resultList;
    }

    @Override
    public Map<String, Object> getJsonById(int id) {
        JsonConverter jsonConverter = new JsonConverter();
        Migrate migrate = migrateRepository.findById(id).get();
        return jsonConverter.getJsonObject(migrate.getJson_column());
    }

    @Override
    public List<Map<String, Object>> searchByValue(String findValue) {
        JsonConverter jsonConverter = new JsonConverter();
        List<Migrate> migrateList = migrateRepository.searchByValue(findValue);
        List<Map<String, Object>> resultList = new ArrayList<>();
        for (Migrate migrate : migrateList) {
            resultList.add(jsonConverter.getJsonObject(migrate.getJson_column()));
        }
        return resultList;
    }


}
