package com.RSystem.Service;
import com.RSystem.Model.TutorModel;

import java.util.List;
import java.util.Optional;

public interface ITutorService {

    String crearTutor(TutorModel tutor);

    List<TutorModel> listarTutor();

    String eliminarTutorPorId(Integer idTutor);

    String actualizarTutorPorId(TutorModel tutor, Integer idTutor);

    Optional<TutorModel> obtenerTutorPorId(Integer idTutor);

}