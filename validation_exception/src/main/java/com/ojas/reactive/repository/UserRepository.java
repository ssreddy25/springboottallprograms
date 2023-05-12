package com.ojas.reactive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.reactive.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
