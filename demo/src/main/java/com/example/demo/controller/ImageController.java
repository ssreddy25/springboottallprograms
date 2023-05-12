package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.modeal.Image;
import com.example.demo.services.ImageServices;

@RestController
@RequestMapping("/fileupload")
public class ImageController {

	@Autowired
	private ImageServices imageServices;

	@PostMapping("/img")
	public Image uploadImage(@RequestParam  MultipartFile file) throws IOException {
		
		
        System.out.println("hiii"+file);
		return imageServices.uploadImage(file);

	}

	@GetMapping("/{id}")
	public Image getfileByID(
			String id) {

		return imageServices.getfileByID(id);

	}

	@GetMapping("/list")
	public List<Image> getImagesList() {

		return imageServices.getImagesList();

	}

}
