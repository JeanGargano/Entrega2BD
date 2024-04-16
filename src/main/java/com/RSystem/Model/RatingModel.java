package com.RSystem.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("Rating")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RatingModel {

    @Id
    private Integer idRating;

    @ManyToOne
    @Column (name = "idUser")
    private UserModel idUser;

    @ManyToOne
    @Column(name = "idTutorCourse")
    private TutorCourseModel idTutorCourse;


    private Double calificacon;
}
