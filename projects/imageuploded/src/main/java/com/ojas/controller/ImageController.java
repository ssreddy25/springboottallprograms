package com.ojas.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ojas.entity.Image;
import com.ojas.repository.ImageRepository;

@RestController
@RequestMapping("/image")
public class ImageController {
	
	@Autowired
	private ImageRepository imageRepository;
	
	@PostMapping
	public ResponseEntity<?> updlodedImage(@RequestParam("data") MultipartFile file) throws IOException{
		
		System.out.println(file.getOriginalFilename());
		
		Image data = new Image();
		data.setName(file.getOriginalFilename());
		data.setData(file.getBytes());
		
		imageRepository.save(data);
		
		return ResponseEntity.ok().build();
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<byte[]> getImage(@PathVariable Long id){
		
		Optional<Image> image = imageRepository.findById(id);
		
		if(image.isPresent()) {
			
			Image   ima=image.get();
			byte[] imagedata =ima.getData();
			
			HttpHeaders headers =new HttpHeaders();
			
			headers.setContentType(MediaType.IMAGE_PNG);
			return new ResponseEntity<>(imagedata ,headers ,HttpStatus.OK);
		}else {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
		
		@GetMapping("/all")
		public List<Image> getImageall(){
			
			List<Image> findAll = imageRepository.findAll();
			
			return findAll;
			
			
			
		}
		
		
	}



