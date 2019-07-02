package com.springboot.dockerimage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerImageService {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Docker";
	}
	
	
}
