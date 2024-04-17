package com.RSystem.Service;
import com.RSystem.Model.RatingModel;

import java.util.List;
import java.util.Optional;

public interface IRatingService {

    String crearRating(RatingModel rating);

    List<RatingModel> listarRating();

    Optional<RatingModel> obtenerRatingPorId(Integer idRating);

    String eliminarRatingPorId(Integer idRating);

    String actualizarRatingPorId(RatingModel ratingModel, Integer idRating);
}