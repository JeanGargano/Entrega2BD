package com.RSystem.Controller;


import com.RSystem.Model.TutorCourseModel;
import com.RSystem.Service.ITutorCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/tutorCourse")
public class TutorCourseController {
    @Autowired
    ITutorCourseService tutorCourseService;
    @PostMapping("/save")
    public ResponseEntity<String> crearTutorCourse(@RequestBody TutorCourseModel tutorCourse){
        String resultadoHttp = tutorCourseService.crearTutorCourse(tutorCourse);
        return  new ResponseEntity<String>(resultadoHttp, HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<TutorCourseModel>> listarTutorCourse(){
        List<TutorCourseModel> tutoresCursos = tutorCourseService.listarTutorCourse();
        return  new ResponseEntity<>(tutoresCursos,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idTutorCourse}")
    public ResponseEntity<String> eliminarTutorCoursePorId(@RequestBody @PathVariable Integer idTutorCourse) {
        String resultado = this.tutorCourseService.eliminarTutorCoursePorId(idTutorCourse);
        return ResponseEntity.ok(resultado);
    }
    @PutMapping("/put/{idTutorCourse}")
    public ResponseEntity<String> actualizarTutorCousePorId(@RequestBody TutorCourseModel tutorCourse, @PathVariable Integer idTutorCourse){
        String resultado = this.tutorCourseService.actualizarTutorCoursePorId(tutorCourse, idTutorCourse);
        return ResponseEntity.ok(resultado);
    }
}