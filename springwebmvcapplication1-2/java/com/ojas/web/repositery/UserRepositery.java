package com.ojas.web.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.web.model.User;

@Repository
public interface UserRepositery extends JpaRepository<User, Integer> {

}
