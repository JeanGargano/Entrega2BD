package com.RSystem.Service;
import com.RSystem.Model.UserModel;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    String crearUser(UserModel user);

    List<UserModel> listarUser();

    Optional<UserModel> obtenerUserPorId(Integer idUser);

    String eliminarUserPorId(Integer idUser);

    String actualizarUserPorId(UserModel user, Integer idUser);
}