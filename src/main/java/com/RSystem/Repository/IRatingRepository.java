package com.RSystem.Repository;
import com.RSystem.Model.RatingModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRatingRepository extends MongoRepository<RatingModel, Integer> {
}
