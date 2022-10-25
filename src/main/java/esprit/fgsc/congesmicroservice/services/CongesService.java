package esprit.fgsc.congesmicroservice.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import esprit.fgsc.congesmicroservice.entities.Conges;
import esprit.fgsc.congesmicroservice.repository.ICongesRepository;



@Service
public class CongesService {
	private static final DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	@Autowired
	private ICongesRepository congesRepository;
	
	public Conges addConges(Conges conge) {
		return congesRepository.save(conge);
		
	}
	public List<Conges>getAllConges(){
		 return congesRepository.findAll();
	}
	
	public void deleteConge(String id) {   

		congesRepository.deleteById(id);
   	
	}
          
public Conges updateConge(String id,Conges newConge) {
	if(congesRepository.findById(id).isPresent()) {
		Conges existingConges = congesRepository.findById(id).get();
		existingConges.setType(newConge.getType());
		 existingConges.setStart_date(newConge.getStart_date());
	        existingConges.setEnd_date(newConge.getEnd_date());
		 existingConges.setFirstName(newConge.getFirstName());
		 existingConges.setLastName(newConge.getLastName());
		return congesRepository.save(existingConges);
		
	}else {
		return null;
	}
}

public Conges getCongeById(String id) {
	return congesRepository.findById(id).get();
	
}
}
