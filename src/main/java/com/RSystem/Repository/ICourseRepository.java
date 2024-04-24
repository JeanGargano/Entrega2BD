package com.RSystem.Repository;
import com.RSystem.Model.CourseModel;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ICourseRepository extends MongoRepository<CourseModel, Integer>{

    @Aggregation("{ $match: { rating: { $exists: true } } }")
    List<CourseModel> cursosConRatings();


}
