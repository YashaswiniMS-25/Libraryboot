package com.wolken.wolkenapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.Entity.LibraryEntity;
import com.wolken.wolkenapp.Service.LibraryService;

@RestController
@RequestMapping("/")
@Controller
public class LibraryResources {
	
	@Autowired
	LibraryService libraryservice;
	@GetMapping("/getAll")
	public List<LibraryEntity> getAll(){
		return libraryservice.validateAndFindAll();
		
	}
	@PostMapping("/savedata")
	public String savedata(@RequestBody LibraryEntity libentity) {
		
		return libraryservice.saveData(libentity);
		
	}
	@PutMapping("/update")
	public String update(@RequestBody LibraryEntity libentity) {
		return  libraryservice.validateAndUpdate(libentity.getName(), libentity.getAuthor());
		}
	
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody LibraryEntity libentity) {
		return libraryservice.validateAndDelete(libentity.getName());
	}
	@GetMapping("/search")
	public List<LibraryEntity> search(@RequestBody LibraryEntity libentity){
		return libraryservice.search(libentity.getAuthor());
		
	}
	
	
	
	}
