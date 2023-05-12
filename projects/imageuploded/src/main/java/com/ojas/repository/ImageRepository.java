package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
