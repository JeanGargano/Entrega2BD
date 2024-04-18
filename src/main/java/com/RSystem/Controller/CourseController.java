package com.RSystem.Controller;

import com.RSystem.Model.CourseModel;
import com.RSystem.Service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import  java.util.List;
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    ICourseService courseService;
    @PostMapping("/save")
    public ResponseEntity<String> crearCurso(@RequestBody CourseModel course){
       String resultadoHttp = courseService.crearCurso(course);
       return  new ResponseEntity<String>(resultadoHttp, HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<CourseModel>> listarCourse(){
        List<CourseModel> cursos = courseService.listarCourse();
        return  new ResponseEntity<>(cursos,HttpStatus.OK);
    }

}
