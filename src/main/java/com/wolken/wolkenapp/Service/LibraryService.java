package com.wolken.wolkenapp.Service;

import java.util.List;

import com.wolken.wolkenapp.Entity.LibraryEntity;

public interface LibraryService {

	public List<LibraryEntity> validateAndFindAll();

	public String saveData(LibraryEntity libentity);

	public String validateAndUpdate(String name, String author);

	public String validateAndDelete(String name);

	public List<LibraryEntity> search(String author);

	

	 

}
