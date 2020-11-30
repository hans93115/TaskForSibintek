package com.sibintek.migratoryjson.service;

import com.sibintek.migratoryjson.model.Migrate;

import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.Map;

public interface MigrateService {
    Migrate saveJson (Object migrateDto) throws ValidationException;
    List<Map<String, Object>> getAll();
    Map<String, Object> getJsonById(int id);
    List<Map<String, Object>> searchByValue(String findValue);




}
