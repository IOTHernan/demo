package com.portfolio.demo.Controller;

import com.portfolio.demo.Entity.Skill;
import com.portfolio.demo.Service.SkillService;
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
public class SkillController {
	@Autowired
	private SkillService skServ;

	@GetMapping("/skills")
	public ResponseEntity<List<Skill>> list(){
		List<Skill> list = skServ.verSkills();
		return new ResponseEntity(list, HttpStatus.OK);
	}

}
