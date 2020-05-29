package com.apolo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apolo.model.Trax;
import com.apolo.repo.ITraxRepo;
import com.apolo.service.ITraxService;

@Controller
public class TraxController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

	
	//@Autowired
	//private ITraxRepo repo;
    
    @Autowired
    private ITraxService repo;
    
   	
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);
        return "Trax"; //view
    }
	
      
    // FindBYId
    @GetMapping("/trax/{id}")   
    public String getTraxId(@PathVariable(value = "idtrx") int idtrx) {    	
    	repo.select(idtrx);
        return "Greeting";
    }
      
    // FindBYId
    @GetMapping("/trax")   
    public List<Trax> getTraxId() {    	
    	repo.selectAll();
    }
             
     // Insert New
    @PutMapping("/trax")   
    public String postTrax() {    	 	
    	repo.create(t);
        return "Greeting";
    }
        
    // Update Trax
    @PostMapping("/trax")   
    public String putTrax() {    	
    	Trax t = new Trax();
    	t.setAmount(15.23);  	
    	repo.create(t);
        return "Greeting";
    }
  
    @DeleteMapping("/trax/{id}")
    public String deleteTrax(@PathVariable(value = "idtrx") int idtrx) {    	
    	repo.delete(idtrx);
        return "Greeting";
    }
    
   

}
