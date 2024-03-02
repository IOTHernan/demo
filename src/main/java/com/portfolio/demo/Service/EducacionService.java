package com.portfolio.demo.Service;


import com.portfolio.demo.Entity.Educacion;
import com.portfolio.demo.Repositories.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

//@Transactional
@Service
public class EducacionService {
	@Autowired
	public EducacionRepository educacionRepository;

	public List<Educacion> verEducacion() {
		return educacionRepository.findAll();
	}
	public void crearEducacion(Educacion educacion) {
		educacionRepository.save(educacion);
	}
	public void borrarEducacion(Integer id) {
		educacionRepository.deleteById(Long.valueOf(id));
	}
	public Educacion buscarEducacion(Long id) {
		return educacionRepository.findById(id).orElse(null);
	}
}
