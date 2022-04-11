package com.example.relationlMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class courseService {
	
	@Autowired
	private courseRepository repo;
	
	
	 public List<course> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(course course) {
	        repo.save(course);
	    }
	     
	    public course get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	        repo.deleteById(id);
	    }
	

}
