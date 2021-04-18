package com.wolken.wolkenapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.Entity.LibraryEntity;
import com.wolken.wolkenapp.Repository.LibraryRepo;

@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	LibraryRepo librepo;

	@Override
	public List<LibraryEntity> validateAndFindAll() {
		return librepo.findAll();
		
	}

	@Override
	public String saveData(LibraryEntity libentity) {
		
		if(librepo.save(libentity)!=null) {
			return "saved";
		}
		else {
			return "not saved";
		}
	}

	@Override
	public String validateAndUpdate(String name, String author) {
		LibraryEntity entity= librepo.findByName(name);
		if(author!=null && name!=null) {
		entity.setAuthor(author);
		librepo.save(entity);
		return "updated";
		}
		else {
			return "not updated";
		}
		
	}

	@Override
	public String validateAndDelete(String name) {
		LibraryEntity entity= librepo.findByName(name);
		
			if(entity!=null) {
				librepo.delete(entity);
				return "deleted";
				
			}
			else {
				return "not deleted";
			}
			
			
	
		
	}

	@Override
	public List<LibraryEntity> search(String author) {
		return librepo.findByAuthor(author);
		
	}

	
	
	

}
