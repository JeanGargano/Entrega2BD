package com.RSystem.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("User")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserModel {

    @Id
    private Integer idUser;
    private String nombre;
    private String sexo;
    private String carrera;
    private String semestre;

}
