package com.example.demo.repositeroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modeal.Image;

public interface ImageRepositry extends JpaRepository<Image, String> {

}
