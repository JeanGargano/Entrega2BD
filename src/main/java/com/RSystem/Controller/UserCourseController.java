package com.RSystem.Controller;

import com.RSystem.Model.UserCourseModel;
import com.RSystem.Service.IUserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/userCourse")
public class UserCourseController {

        @Autowired
        IUserCourseService userCourseService;
        @PostMapping("/save")
        public ResponseEntity<String> crearUserCourse(@RequestBody UserCourseModel userCourse){
            String resultadoHttp = userCourseService.crearUserCourse(userCourse);
            return  new ResponseEntity<String>(resultadoHttp, HttpStatus.OK);
        }

        @GetMapping("/get/all")
        public ResponseEntity<List<UserCourseModel>> listarUserCourse(){
            List<UserCourseModel> usersCursos = userCourseService.listarUserCourse();
            return  new ResponseEntity<>(usersCursos,HttpStatus.OK);
        }

        @DeleteMapping("/delete/{idUserCourse}")
        public ResponseEntity<String> elimiarUserCoursePorId(@RequestBody @PathVariable Integer idUserCourse) {
            String resultado = this.userCourseService.eliminarUserCoursePorId(idUserCourse);
            return ResponseEntity.ok(resultado);
    }
        @PutMapping("/put/{idUserCourse}")
        public ResponseEntity<String> actualizarUserCoursePorId(@RequestBody UserCourseModel userCourse, @PathVariable Integer idUserCourse){
            String resultado = this.userCourseService.actualizarUserCoursePorId(userCourse, idUserCourse);
            return ResponseEntity.ok(resultado);
    }
    }
