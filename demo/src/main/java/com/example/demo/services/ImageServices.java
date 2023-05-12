package com.example.demo.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.modeal.Image;
import com.example.demo.repositeroy.ImageRepositry;

@Service
public class ImageServices {
	
	@Autowired
	private ImageRepositry imageRepositry;
	
	public Image uploadImage(MultipartFile file) throws IOException {
		
		String filedb=file.getOriginalFilename();
		
		
		Image image=new Image(UUID.randomUUID().toString(),filedb, file.getContentType(),file.getBytes());
		
	 return imageRepositry.save(image);
		
		
	}
	
	public Image getfileByID(String id) {
		Optional<Image> images=imageRepositry.findById(id);
		
		if(images.isPresent()) {
		return images.get();
		
		}
		return null;
		
	}
	
	public List<Image> getImagesList(){
		
		return imageRepositry.findAll();
	}

}
