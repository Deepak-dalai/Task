package com.example.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.restapi.model.Images;
import com.example.restapi.repository.uploadRepository;

@Controller
public class HomeController {
	
	@Autowired
	private uploadRepository uploadRepo; 
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("imageUpload")
	public String imageUpload(@RequestParam MultipartFile img) {
		
		Images im=new Images();
		im.setImageName(img.getOriginalFilename());
		
		
		
		return "redirect:/";
	}

}
