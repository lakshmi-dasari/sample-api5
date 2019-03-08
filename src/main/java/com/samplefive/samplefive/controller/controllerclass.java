package com.samplefive.samplefive.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samplefive.samplefive.ResourceNotFoundException.ResourceNotFoundException;
import com.samplefive.samplefive.model.modelclass;
import com.samplefive.samplefive.repo.repoclass;
import com.samplefive.samplefive.repo.repotwo;

@RestController
@RequestMapping("/api/v7")
public class controllerclass {
	@Autowired
	private repoclass repo;
	@Autowired
	private repotwo Repotwo;
	
	@GetMapping("/getmethod")
	public List<modelclass> getAllNames(){
		return repo.findAll();
	}
	
	@PostMapping("/postmethod")
	public modelclass modelmethod(@Valid @RequestBody modelclass modelobj) {
		return repo.save(modelobj);
	}
	
	@GetMapping("/firstname/{lastname}")
	 public List<modelclass> modelmethod(@PathVariable (value="lastname") String lastname){
		 return Repotwo.getfirstnameBylastname(lastname);
	}
	 
	@PutMapping("/putmethod/{id}")
	public modelclass updatenameById( @PathVariable long id, @Valid  @RequestBody  modelclass modelobj) {
		return repo.findById(id)
				.map(model -> {
					model.setFirstname(modelobj.getFirstname());
					return repo.save(model);
				}).orElseThrow(() -> new ResourceNotFoundException("Id not found" + id));
	}
	
}
