package com.RSystem.Repository;
import com.RSystem.Model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<CourseModel, Integer>{

}
