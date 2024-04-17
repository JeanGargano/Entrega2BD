package com.RSystem.Model;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("Tutor")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TutorModel {

    @Id
    private Integer idTutor;
    private String nombre;
    private String sexo;
    private String carrera;
    private String semestre;

}
