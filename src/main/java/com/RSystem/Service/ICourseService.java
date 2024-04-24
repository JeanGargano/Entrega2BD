package com.RSystem.Service;
import com.RSystem.Model.CourseModel;

import java.util.List;
import java.util.Optional;

public interface ICourseService {

    String crearCurso(CourseModel course);

    List<CourseModel> listarCourse();

    Optional<CourseModel> obtenerCoursePorId(Integer idCourse);

    String eliminarCursoPorId(Integer idCourse);

    String actualizarCursoPorId(CourseModel course, Integer idCourse);

    List<CourseModel> cursosConRatings();
}
