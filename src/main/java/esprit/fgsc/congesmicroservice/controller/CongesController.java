package esprit.fgsc.congesmicroservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import esprit.fgsc.congesmicroservice.entities.Conges;
import esprit.fgsc.congesmicroservice.services.CongesService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CongesController {
	
	@Autowired
	private  CongesService congesService;

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Conges> createConge(@RequestBody Conges conge) {
		return new ResponseEntity<>(congesService.addConges(conge), HttpStatus.OK);
	}
	
	@GetMapping("/conges")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Conges>>getAllConges(){
		 return new ResponseEntity<>(congesService.getAllConges(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteConges(@PathVariable String id) {
	     congesService.deleteConge(id);
	}

	@PutMapping(value="/update/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Conges> updateConge(@PathVariable("id") String id,@Valid @RequestBody Conges conge) {
		return new ResponseEntity<>(congesService.updateConge(id, conge),HttpStatus.OK);
	}
	
}
