package com.sibintek.migratoryjson.service;

import com.sibintek.migratoryjson.dto.MigrateDto;
import com.sibintek.migratoryjson.entity.Migrate;
import com.sibintek.migratoryjson.repository.MigrateRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationException;


@Service
@AllArgsConstructor

public class DefaultMigrateService implements MigrateService {
    private final MigrateRepository migrateRepository;
    private final MigrateConverter migrateConverter;


    @Override
    public Object saveJson(Object migrateDto) throws ValidationException {
        //validateMigrateDto(migrateDto);
        Migrate savedJson = migrateRepository.save(migrateConverter.fromMigrateDtoToDto(migrateDto));
        return savedJson;
    }

   /* @Override
    public List<MigrateDto> findAll() {
        return migrateRepository.findAll()
                .stream()
                .map(migrateConverter::fromMigrateToMigrateDto)
                .collect(Collectors.toList());
        return new ArrayList<>()
    }

    @Override
    public MigrateDto findAllById(Integer id) {
        Migrate migrate = migrateRepository.findAllById(id);
        if (migrate != null){
            return migrateConverter.fromMigrateToMigrateDto(migrate);
        }
        return null;
        return new MigrateDto();
    }*/

}
