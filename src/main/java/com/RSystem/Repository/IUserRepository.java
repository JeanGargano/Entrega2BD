package com.RSystem.Repository;
import com.RSystem.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Integer> {
}
