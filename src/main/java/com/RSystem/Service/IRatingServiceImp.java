package com.RSystem.Service;


import com.RSystem.Model.RatingModel;
import com.RSystem.Repository.IRatingRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary

public class IRatingServiceImp implements IRatingService{

    @Autowired
    IRatingRepository ratingRepository;

    public String crearRating(RatingModel rating) {
        this.ratingRepository.save(rating);
        return "El rating con id" + rating.getIdRating() + "Fue creadp ecistosamente";
    }

    public List<RatingModel> listarRating() {
        return this.ratingRepository.findAll();
    }

    public Optional<RatingModel> obtenerRatingPorId(Integer idRating) {
        return this.ratingRepository.findById(idRating);
    }

    public String eliminarRatingPorId(Integer idRating) {
        this.ratingRepository.deleteById(idRating);
        return "El rating con id " + idRating + " fue eliminado exitosamente";

    }

    public String actualizarRatingPorId(RatingModel rating, Integer idRating) {

        String res = "";

        Optional<RatingModel> ratingEcontrado = this.ratingRepository.findById(idRating);
        if (ratingEcontrado.isPresent()) {

            RatingModel ratingActaulizar = ratingEcontrado.get();
            BeanUtils.copyProperties(rating, ratingActaulizar);
            this.ratingRepository.save(ratingActaulizar);
            return "El rating con id " + idRating + " fue actualizado correctamente";
        }else{

            res = "El rating con id " + idRating + " no existe";
        }
        return res;
    }
}
