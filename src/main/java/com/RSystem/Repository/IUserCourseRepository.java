package com.RSystem.Repository;

import com.RSystem.Model.UserCourseModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserCourseRepository extends MongoRepository<UserCourseModel, Integer> {
}
