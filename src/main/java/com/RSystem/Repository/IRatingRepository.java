package com.RSystem.Repository;
import com.RSystem.Model.RatingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRatingRepository extends JpaRepository<RatingModel, Integer> {
}
