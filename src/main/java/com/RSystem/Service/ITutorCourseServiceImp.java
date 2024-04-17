package com.RSystem.Service;

import com.RSystem.Model.TutorCourseModel;
import com.RSystem.Repository.ITutorCourseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary

public class ITutorCourseServiceImp implements ITutorCourseService {

    @Autowired
    ITutorCourseRepository tutorCourseRepository;



    public String crearTutorCourse(TutorCourseModel tutorCourse) {
        this.tutorCourseRepository.save(tutorCourse);
        return "El documento tutor curso fue creado correctamente";
    }


    public List<TutorCourseModel> listarTutorCourse() {
        return this.tutorCourseRepository.findAll();
    }


    public Optional<TutorCourseModel> obtenerTutorCoursePorId(Integer idTutorCourse) {
        return this.tutorCourseRepository.findById(idTutorCourse);
    }


    public String eliminarTutorCoursePorId(Integer idTutorCourse) {
        this.tutorCourseRepository.deleteById(idTutorCourse);
        return "El documento tutor curso fue eliminado";
    }


    public String actualizarTutorCoursePorId(TutorCourseModel tutorCourse, Integer idTutorCourse) {

        String res = "";

        Optional<TutorCourseModel> tutorCourseEncontrado = this.tutorCourseRepository.findById(idTutorCourse);
        if (tutorCourseEncontrado.isPresent()) {

            TutorCourseModel tutorCourseActualizar = tutorCourseEncontrado.get();
            BeanUtils.copyProperties(tutorCourse, tutorCourseActualizar);
            this.tutorCourseRepository.save(tutorCourse);
            return "El documento tutor curso con id " + idTutorCourse + " fue actualizado correctamente";
        }else{

            res = "El documento tutor curso con id " + idTutorCourse + " no existe";
        }
        return res;
    }
}
