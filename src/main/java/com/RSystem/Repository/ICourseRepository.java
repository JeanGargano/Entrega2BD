package com.RSystem.Repository;
import com.RSystem.Model.CourseModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICourseRepository extends MongoRepository<CourseModel, Integer>{

}
