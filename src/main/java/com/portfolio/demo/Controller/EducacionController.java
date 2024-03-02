package com.portfolio.demo.Controller;

import com.portfolio.demo.Entity.Educacion;
import com.portfolio.demo.Service.EducacionService;
import com.portfolio.demo.Dto.EducacionDto;
import com.portfolio.demo.Dto.Mensaje;
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
public class EducacionController {
	@Autowired
	private EducacionService eduServ;

	@RequestMapping("/educacion")
	/*public List<Educacion> getEducacions() {
		//List<Educacion> listaExpe = IEducacionService.getEducacion();
		return educacionRepository.findAll();
	}*/
	public ResponseEntity<List<Educacion>> list() {
		List<Educacion> list = eduServ.verEducacion();
		return new ResponseEntity(list, HttpStatus.OK);
	}
}
