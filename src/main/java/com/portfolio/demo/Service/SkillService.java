package com.portfolio.demo.Service;

import com.portfolio.demo.Entity.Skill;
import com.portfolio.demo.Repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
	@Autowired
	public SkillRepository skillRepo;


	public List<Skill> verSkills (){
		return skillRepo.findAll();
	}


	public void crearSkill (Skill sk){
		skillRepo.save(sk);
	}


	public void borrarSkill (Long id){
		skillRepo.deleteById(id);
	}


}
