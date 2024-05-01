package com.RSystem.Repository;
import com.RSystem.Model.TutorModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITutorRepository extends MongoRepository<TutorModel, Integer> {



}