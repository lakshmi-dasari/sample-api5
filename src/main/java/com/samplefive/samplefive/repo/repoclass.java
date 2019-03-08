package com.samplefive.samplefive.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samplefive.samplefive.model.modelclass;

@Repository
public interface repoclass extends JpaRepository <modelclass,Long>{

}
