package com.portfolio.demo;

import com.portfolio.demo.Entity.Educacion;
import com.portfolio.demo.Repositories.EducacionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

/*	@Bean
	public CommandLineRunner initData(EducacionRepository educacionRepository) {
		return (args) -> {
			Educacion educacion = new Educacion( "H","dd","periodo","estado","detalles");
			educacionRepository.save(educacion);
			Educacion educacion1 = new Educacion( "Fernando","Sertalín","periodo2","estado2","detalles2");
			educacionRepository.save(educacion1);
		};
	}*/
}
