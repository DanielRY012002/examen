package com.edu.EXAROJASDBACK.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edu.EXAROJASDBACK.entity.Libro;
import com.edu.EXAROJASDBACK.service.LibroService;
@RestController
public class HomeController {
	@Autowired
	private LibroService libroservice;
	@GetMapping("/libro")
	public List<Libro> mensaje(){
		return libroservice.readAll();
	}
}
