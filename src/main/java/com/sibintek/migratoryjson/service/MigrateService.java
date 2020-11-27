package com.sibintek.migratoryjson.service;

import com.sibintek.migratoryjson.dto.MigrateDto;

import javax.xml.bind.ValidationException;
import java.util.List;

public interface MigrateService {
    Object saveJson (Object migrateDto) throws ValidationException;
   /* List<MigrateDto> findAll();
    MigrateDto findAllById(Integer id);*/


}
