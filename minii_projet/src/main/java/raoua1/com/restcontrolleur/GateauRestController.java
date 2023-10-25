package raoua1.com.restcontrolleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import raoua1.com.Service.GateauService;
import raoua1.com.entity.Gateau;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class GateauRestController {
	
	@Autowired
	GateauService gateauService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Gateau> getAllGateaux() {
	return gateauService.getAllGateaus();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Gateau getProduitById(@PathVariable("id") Long id) {
	return gateauService.getGateau(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Gateau createProduit(@RequestBody Gateau gateau) {
	return gateauService.saveProduit(gateau);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Gateau updateGateau(@RequestBody Gateau Gateau) {
	return gateauService.updateProduit(Gateau);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
	    gateauService.deleteGateauById(id);
	}
	
	//@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	//public List<Gateau> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
	//return GateauService.findByCommandeIdCat(idCat);
	//}




}
