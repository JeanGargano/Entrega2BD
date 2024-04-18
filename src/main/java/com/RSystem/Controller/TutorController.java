package com.RSystem.Controller;

import com.RSystem.Model.CourseModel;
import com.RSystem.Model.TutorModel;
import com.RSystem.Service.ITutorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/tutor")

public class TutorController {
    @Autowired
    ITutorServiceImp tutorService;
    @PostMapping("/save")
    public ResponseEntity<String> crearTutor(@RequestBody TutorModel tutor){
        String resultadoHttp = tutorService.crearTutor(tutor);
        return  new ResponseEntity<String>(resultadoHttp, HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<TutorModel>> listarTutor(){
        List<TutorModel> tutores = tutorService.listarTutor();
        return  new ResponseEntity<>(tutores,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> elimiarTutorPorId(@RequestBody @PathVariable Integer idTutor) {
        String resultado = this.tutorService.eliminarTutorPorId(idTutor);
        return ResponseEntity.ok(resultado);
    }
    @PutMapping("/put/idCourse")
    public ResponseEntity<String> actualizarTutotPorId(@RequestBody TutorModel tutor, @PathVariable Integer idTutor){
        String resultado = this.tutorService.actualizarTutorPorId(tutor, idTutor);
        return ResponseEntity.ok(resultado);
    }

}

