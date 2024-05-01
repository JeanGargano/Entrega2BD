package com.RSystem.Repository;
import com.RSystem.Model.CourseModel;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ICourseRepository extends MongoRepository<CourseModel, Integer>{

    @Aggregation("{ $match: { rating: { $exists: true } } }")
    List<CourseModel> cursosConRatings();


    //Consulta para listar tutores con cursos con ratings
    @Aggregation({
            "{ $match: { rating: { $exists: true } } }",
            "{ $unwind: \"$tutores\" }",
            "{ $lookup: { from: \"Tutor\", localField: \"tutores.idTutor\", foreignField: \"idTutor\", as: \"tutor_info\" } }",
            "{ $unwind: \"$tutor_info\" }",
            "{ $project: { _id: 0, nombre: \"$tutor_info.nombre\" } }"
    })
    List<String> consulta2();
}




