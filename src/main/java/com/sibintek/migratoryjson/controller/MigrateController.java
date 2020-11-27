package com.sibintek.migratoryjson.controller;
import com.sibintek.migratoryjson.dto.MigrateDto;
import com.sibintek.migratoryjson.service.MigrateService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;

@RestController
@RequestMapping("/json")
@AllArgsConstructor
@Log
public class MigrateController {
    private final MigrateService migrateService;

    @PostMapping("/save")
    public Object saveJson (@RequestBody Object migrateDto) throws ValidationException {
        log.info("Обработка сохранения JSON: " + migrateDto);

        return migrateService.saveJson(migrateDto);
    }
 /*   @GetMapping("/findAll")
    public List<MigrateDto> findAllJson(){
    log.info("Поиск всех JSON...");
    return migrateService.findAll();
    }
    @GetMapping("/findById")
    public MigrateDto findAllById(@RequestParam Integer id){
    log.info("Обработка поиска по ID" + id);
    return migrateService.findAllById(id);
    }*/


}
