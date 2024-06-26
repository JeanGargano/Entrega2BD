package com.RSystem.Service;
import com.RSystem.Model.CourseModel;
import com.RSystem.Repository.ICourseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary

public class ICourseServiceImp implements ICourseService {

    @Autowired
    ICourseRepository courseRepository;


    public String crearCurso(CourseModel course) {
        this.courseRepository.save(course);
        return "El curso con id " + course.getIdCourse() + " fue creado exitosamente";
    }


    public List<CourseModel> listarCourse() {
        return  this.courseRepository.findAll();
    }



    public String eliminarCursoPorId(Integer idCourse) {
        this.courseRepository.deleteById(idCourse);
        return "El curso con id " + idCourse + " fue eliminado exitosamente";
    }


    public String actualizarCursoPorId(CourseModel course, Integer idCourse) {

        String res = "";

        Optional<CourseModel> courseEncontrado = this.courseRepository.findById(idCourse);
        if (courseEncontrado.isPresent()) {

            CourseModel courseActualizar = courseEncontrado.get();
            BeanUtils.copyProperties(course, courseActualizar);
            this.courseRepository.save(courseActualizar);
            return "El curso con id " + idCourse + " fue actualizado correctamente";
        }else{

            res = "El curso con id " + idCourse + " no existe";
        }
        return res;
    }

    @Override
    public List<String> cursosConRatings() {
        return this.courseRepository.cursosConRatings();
    }



    @Override
    public Optional<CourseModel> obtenerCoursePorId(Integer idCourse) {
      return this.courseRepository.findById(idCourse);
    }

    @Override
    public List<String> consulta2() {
        return this.courseRepository.consulta2();
    }
}
