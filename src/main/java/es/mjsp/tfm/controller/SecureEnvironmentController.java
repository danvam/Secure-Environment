package es.mjsp.tfm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecureEnvironmentController {
	
	@RequestMapping("/home")
	public String home() {
		return "Hello Docker World";
	}
}
