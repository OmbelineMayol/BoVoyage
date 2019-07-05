package com.intiformation.bovoyage.wsrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.bovoyage.entity.Banque;
import com.intiformation.bovoyage.service.IBanqueService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BanqueWSRest {

	/*------association avec la couche service--------*/
	@Autowired
	IBanqueService banqueService;

	// setter pour injection de spring
	public void setBanqueService(IBanqueService banqueService) {
		this.banqueService = banqueService;
	}
	
	//Méthodes
	
	/**
	 * Selection d'une banque
	 * @param 
	 */
	@RequestMapping(value="/banques/getById/{idBanque}", method= RequestMethod.GET, produces={"application/json"})
	public Banque getByIdBanqueService(@PathVariable("idBanque") int idBanqueIn) {
		return banqueService.getByIdBanqueService(idBanqueIn);
	}
	@RequestMapping(value="/banques/getByCb/{numeroCB}", method=RequestMethod.GET, produces={"application/json"})
	public Banque getByCbService(@PathVariable("numeroCB") int NumCBIn) {
		return banqueService.getByCbService(NumCBIn);
	}
	
	@RequestMapping(value= "/banques/update", method=RequestMethod.PUT, produces="application/json",consumes="application/json")
	public void updateBanqueService(@RequestBody Banque banqueIn) {
		banqueService.updateBanqueService(banqueIn);
	}
	
	
}//end class
