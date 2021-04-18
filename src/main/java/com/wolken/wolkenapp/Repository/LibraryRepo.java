package com.wolken.wolkenapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.wolken.wolkenapp.Entity.LibraryEntity;

public interface LibraryRepo extends JpaRepository<LibraryEntity, Integer>{
	//public List<LibraryEntity> findAll();
	public LibraryEntity findByName(String name);
	public List<LibraryEntity> findByAuthor(String author);
	
	
	

}
