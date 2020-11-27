package com.sibintek.migratoryjson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MigrateDto {

    private Integer id;

    private String name;

    private String sex;

    private String city;


}
