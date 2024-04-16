package com.RSystem.Repository;
import com.RSystem.Model.TutorCourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITutorCourseRepository extends JpaRepository<TutorCourseModel, Integer> {
}
