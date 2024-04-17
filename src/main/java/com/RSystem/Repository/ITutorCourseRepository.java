package com.RSystem.Repository;
import com.RSystem.Model.TutorCourseModel;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITutorCourseRepository extends MongoRepository<TutorCourseModel, Integer> {
}
