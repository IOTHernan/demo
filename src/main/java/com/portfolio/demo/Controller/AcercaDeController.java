package com.portfolio.demo.Controller;

import com.portfolio.demo.Entity.AcercaDe;
import com.portfolio.demo.Service.AcercaDeService;
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
public class AcercaDeController {
		//-------------------------- ACERCA DE CONTROLLER ----------------------------------
		@Autowired
		private AcercaDeService acercadeServ;

	@GetMapping("/acerca_de")
	public ResponseEntity<List<AcercaDe>> list(){
		List<AcercaDe> list = acercadeServ.verAcercaDe();
		return new ResponseEntity(list, HttpStatus.OK);
	}

}
