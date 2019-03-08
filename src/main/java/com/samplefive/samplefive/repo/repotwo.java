package com.samplefive.samplefive.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.samplefive.samplefive.model.modelclass;

@Repository

public class repotwo {

	@PersistenceContext
	private EntityManager entitymanager;
	
	public List<modelclass> getfirstnameBylastname(String varname){
		Query q = entitymanager.createNativeQuery("select firstname from public.samplefive where lastname like :nameobj");
		q.setParameter("nameobj",varname);
		List<modelclass>model=q.getResultList();
		return model;
	}
	
	
	
	
}
