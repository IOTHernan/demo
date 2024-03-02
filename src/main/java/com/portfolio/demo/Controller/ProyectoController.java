package com.portfolio.demo.Controller;

import com.portfolio.demo.Entity.Proyecto;
import com.portfolio.demo.Service.ProyectoService;
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
@CrossOrigin(origins = "*")
public class ProyectoController {
	@Autowired
	private ProyectoService proServ;
	@GetMapping("/proyectos")
	public ResponseEntity<List<Proyecto>> list(){
		List<Proyecto> list = proServ.verProyectos();
		return new ResponseEntity(list, HttpStatus.OK);
	}


}
