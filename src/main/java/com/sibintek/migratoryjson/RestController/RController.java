package com.sibintek.migratoryjson.RestController;
import com.sibintek.migratoryjson.service.MigrateService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;
import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
@AllArgsConstructor
@Log
public class RController {
    private final MigrateService migrateService;

    @PostMapping("/save")
    public Object saveJson (@RequestBody Object jsonObject) throws ValidationException {
        log.info("Обработка сохранения JSON: " + jsonObject);
        System.out.println("jsonObject");
        return migrateService.saveJson(jsonObject);
    }

    @GetMapping("/getAll")
    public  List<Map<String, Object>> getAllJsons(){
        log.info("Поиск всех JSON");
        System.out.println(migrateService.getAll());
        return  migrateService.getAll();
    }


    @GetMapping(value = "/getJson/{id}", produces = { "application/json" })
    public  Map<String, Object> getById(@PathVariable int id){
        log.info("Поиск JSON по ID " + id);
        return  migrateService.getJsonById(id);
    }
    @GetMapping("/findValue/{searchValue}")
    public List<Map<String,Object>> findValue(@PathVariable String searchValue){
        log.info("Поиск по значению "+ searchValue);
        return migrateService.searchByValue(searchValue);
    }


}
