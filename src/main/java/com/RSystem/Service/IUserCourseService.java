package com.RSystem.Service;

import com.RSystem.Model.UserCourseModel;
import java.util.List;
import java.util.Optional;

public interface IUserCourseService {

    String crearUserCourse(UserCourseModel userCourse);

    List<UserCourseModel> listarUserCourse();

    Optional<UserCourseModel> obtenerUserCoursePorId(Integer idUserCourse);

    String eliminarUserCoursePorId(Integer idUserCourse);

    String actualizarUserCoursePorId(UserCourseModel userCourse, Integer idUserCourse);
}
