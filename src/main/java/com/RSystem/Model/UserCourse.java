package com.RSystem.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("UserCourse")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class UserCourse {

    @Id
    private Integer idUserCourse;

    @ManyToOne
    @Column (name = "idUser")
    private UserModel idUser;

    @ManyToOne
    @Column (name = "idCourse")
    private CourseModel idCourse;
}
