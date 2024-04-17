package com.RSystem.Service;
import com.RSystem.Model.TutorCourseModel;

import java.util.List;
import java.util.Optional;

public interface ITutorCourseService {

    String crearTutorCourse(TutorCourseModel tutorCourse);

    List<TutorCourseModel> listarTutorCourse();

    Optional<TutorCourseModel> obtenerTutorCoursePorId(Integer idTutorCourse);

    String eliminarTutorCoursePorId(Integer idTutorCourse);

    String actualizarTutorCoursePorId(TutorCourseModel tutorCourse, Integer idTutorCourse);
}