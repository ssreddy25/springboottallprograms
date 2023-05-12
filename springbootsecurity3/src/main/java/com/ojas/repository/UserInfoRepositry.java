package com.ojas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.UserInfo;

@Repository
public interface UserInfoRepositry extends JpaRepository<UserInfo, Integer> {

	Optional<UserInfo> findByName(String username);

}
