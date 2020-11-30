package com.sibintek.migratoryjson.model;


import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@Entity
@Table(name="migrate_table")
@TypeDefs({
        @TypeDef( name = "json",typeClass = JsonStringType.class),
        @TypeDef( name = "jsonb",typeClass = JsonBinaryType.class)
})
@Data
@NoArgsConstructor
public class Migrate {
    @Id
    private Integer id;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
       private String json_column;

}
