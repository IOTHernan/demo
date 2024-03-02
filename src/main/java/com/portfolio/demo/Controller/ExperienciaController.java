package com.portfolio.demo.Controller;


import com.portfolio.demo.Entity.Experiencia;
import com.portfolio.demo.Service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "*")
public class ExperienciaController {
	@Autowired
	private ExperienciaService expeServ;

	@RequestMapping("/experiencias")
	public ResponseEntity<List<Experiencia>> list(){
		List<Experiencia> list = expeServ.verExperiencias();
		return new ResponseEntity(list, HttpStatus.OK);
	}




}
