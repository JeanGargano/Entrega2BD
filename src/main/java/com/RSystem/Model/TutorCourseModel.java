package com.RSystem.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("TutorCourse")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TutorCourseModel {

    @Id
    private Integer idTutorCourse;

    @ManyToOne
    @Column (name = "idCourse")
    private CourseModel idCourse;

    @ManyToOne
    @Column (name = "idTutor")
    private TutorModel idTutor;

    //private Double calificacion;
}
