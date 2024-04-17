package com.RSystem.Repository;
import com.RSystem.Model.UserModel;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<UserModel, Integer> {
}
