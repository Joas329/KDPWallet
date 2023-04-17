package com.kdpwallet.kdpwallet.repos;

import com.kdpwallet.kdpwallet.controller.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String > {
}
