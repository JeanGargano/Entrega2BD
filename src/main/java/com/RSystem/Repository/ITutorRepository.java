package com.RSystem.Repository;
import com.RSystem.Model.TutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITutorRepository extends JpaRepository<TutorModel, Integer> {
}
