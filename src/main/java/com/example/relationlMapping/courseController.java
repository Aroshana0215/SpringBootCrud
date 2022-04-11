package com.example.relationlMapping;

import java.util.List; 
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class courseController {


		@Autowired
		private courseService service;
		
		
		@GetMapping("/courses")
		public List<course> list() {
		    return service.listAll();
		}
		

		@GetMapping("/courses/{id}")
		public ResponseEntity<course> get(@PathVariable Integer id) {
		    try {
		    	course course = service.get(id);
		        return new ResponseEntity<course>(course, HttpStatus.OK);
		      
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<course>(HttpStatus.NOT_FOUND);
		    }      
		}
		
		
		@PostMapping("/courses")
		public void add(@RequestBody course course) {
		    service.save(course);
		}
		
		
		
		@DeleteMapping("/courses/{id}")
		public void delete(@PathVariable Integer id) {
		    service.delete(id);
		}
		
		
		@PutMapping("/courses/{id}")
		public ResponseEntity<?> update(@RequestBody course course, @PathVariable Integer id) {
		    try {
		    	course existCourse = service.get(id);
		        service.save(course);
		        return new ResponseEntity<>(HttpStatus.OK);
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }      
		}
		

		
	
}
