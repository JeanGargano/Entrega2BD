package com.RSystem.Service;

import com.RSystem.Model.TutorModel;
import com.RSystem.Repository.ITutorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary

public class ITutorServiceImp implements ITutorService {

    @Autowired
    ITutorRepository tutorRepository;

    public String crearTutor(TutorModel tutor) {
        this.tutorRepository.save(tutor);
        return "El tutor co id " + tutor.getIdTutor() + " fue creado correctamente";
    }


    public List<TutorModel> listarTutor() {
        return this.tutorRepository.findAll();
    }



    public String eliminarTutorPorId(Integer idTutor) {
        this.tutorRepository.deleteById(idTutor);
        return "El tutor con id " + idTutor + " fue eliminado correctamente";
    }

    @Override
    public String actualizarTutorPorId(TutorModel tutor, Integer idTutor) {
        String res = "";

        Optional<TutorModel> tutorEncontrado = this.tutorRepository.findById(idTutor);
        if (tutorEncontrado.isPresent()) {

            TutorModel tutorActualizar = tutorEncontrado.get();
            BeanUtils.copyProperties(tutor, tutorActualizar);
            this.tutorRepository.save(tutorActualizar);
            return "El tutor que con id " + idTutor + " fue actualizado correctamente";
        }else{

            res = "No existe";
        }
        return res;
    }

    public Optional<TutorModel> obtenerTutorPorId(Integer idTutor) {
        return this.tutorRepository.findById(idTutor);
    }

}

