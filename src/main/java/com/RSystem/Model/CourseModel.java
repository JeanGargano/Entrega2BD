package com.RSystem.Model;
import com.mongodb.DBObject;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;

@Document ("Course")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseModel {

    @Id
    private Integer idCourse;
    private String nombre;
    private String categoria;
    private Double precio;
    private Integer totalHoras;
    private Double rating;
    private List<TutorModel> tutores= new ArrayList<>();
    private List<UserModel> usuarios= new ArrayList<>();

}
