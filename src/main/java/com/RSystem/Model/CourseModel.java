package com.RSystem.Model;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("Course")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseModel {

    @Id
    private String idCourse;
    private String nombre;
    private String categoria;
    private Double precio;
    private Integer totalHoras;

}
