package com.RSystem.Service;
import com.RSystem.Model.UserModel;
import com.RSystem.Repository.IUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary

public class IUserServiceImp implements IUserService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public String crearUser(UserModel user) {
        this.userRepository.save(user);
        return "El usuario con id " + user.getIdUser() + " se ha registrado con exito";
    }

    @Override
    public List<UserModel> listarUser() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<UserModel> obtenerUserPorId(Integer idUser) {
        return this.userRepository.findById(idUser);
    }

    @Override
    public String eliminarUserPorId(Integer idUser) {
        this.userRepository.deleteById(idUser);
        return "el usuario con id " + idUser + " se ha eliminado con exito";
    }

    @Override
    public String actualizarUserPorId(UserModel user, Integer idUser) {

        String res = "";

        Optional<UserModel> userEncontrado = this.userRepository.findById(idUser);
        if (userEncontrado.isPresent()) {

            UserModel userActualizar = userEncontrado.get();
            BeanUtils.copyProperties(user, userActualizar);
            this.userRepository.save(userActualizar);
            return "El usuario con id " + idUser + " fue actualizado correctamente";
        }else{

            res = "No existe";
        }
        return res;
    }
}
