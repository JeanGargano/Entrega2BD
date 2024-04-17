package com.RSystem.Service;

import com.RSystem.Model.CourseModel;
import com.RSystem.Model.UserCourseModel;
import com.RSystem.Repository.IUserCourseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary

public class IUserCourseServiceImp implements  IUserCourseService {

    @Autowired
    IUserCourseRepository userCourseRepository;


    public String crearUserCourse(UserCourseModel userCourse) {
        this.userCourseRepository.save(userCourse);
        return "El usuario curso fue creado exitosamente";
    }

    @Override
    public List<UserCourseModel> listarUserCourse() {
        return this.userCourseRepository.findAll();
    }

    @Override
    public Optional<UserCourseModel> obtenerUserCoursePorId(Integer idUserCourse) {
        return this.userCourseRepository.findById(idUserCourse);
    }

    @Override
    public String eliminarUserCursoPorId(Integer idUserCourse) {
        this.userCourseRepository.deleteById(idUserCourse);
        return "El usuario curso con id " + idUserCourse + "fue eliminado eliminado";
    }

    @Override
    public String actualizarCursoPorId(UserCourseModel userCourse, Integer idUserCourse) {
        String res = "";

        Optional<UserCourseModel> userCourseEncontrado = this.userCourseRepository.findById(idUserCourse);
        if (userCourseEncontrado.isPresent()) {

            UserCourseModel userCourseActualizar = userCourseEncontrado.get();
            BeanUtils.copyProperties(userCourse, userCourseActualizar);
            this.userCourseRepository.save(userCourseActualizar);
            return "El usuario que estaba tomando el curso con id " + idUserCourse + " fue actualizado correctamente";
        }else{

            res = "No existe";
        }
        return res;
    }
}
