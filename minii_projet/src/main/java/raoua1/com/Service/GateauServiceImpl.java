package raoua1.com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import raoua1.com.entity.Commande;
import raoua1.com.entity.Gateau;
import raoua1.com.repository.GateauRepository;

@Service
public class GateauServiceImpl implements GateauService  {

	@Autowired
	GateauRepository GateauRepository;
	
	@Override
	public Gateau saveProduit(Gateau p) {
		return GateauRepository.save(p);
	}

	@Override
	public Gateau updateProduit(Gateau p) {
		return GateauRepository.save(p);

	}

	@Override
	public void deleteGateaut(Gateau p) {
		GateauRepository.delete(p);
		
	}

	@Override
	public void deleteGateauById(Long id) {
		GateauRepository.deleteById(id);
		
	}

	@Override
	public Gateau getGateau(Long id) {
		return GateauRepository.findById(id).get();

	}

	@Override
	public List<Gateau> getAllGateaus() {
		return GateauRepository.findAll();
	}
	@Override
	public List<Gateau> findByNomGateau(String nom) {
	    return GateauRepository.findByNomGateau(nom);
	}

	@Override
	public List<Gateau> findByNomGateauContains(String nom) {
	    return GateauRepository.findByNomGateauContains(nom);
	}

	@Override
	public List<Gateau> findByNomPrix(String nom, Double prix) {
	    return GateauRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Gateau> findByCommande(Commande commande) {
	    return GateauRepository.findByCommande(commande);
	}

	

	@Override
	public List<Gateau> findByOrderByNomGateauAsc() {
	    return GateauRepository.findByOrderByNomGateauAsc();
	}

	@Override
	public List<Gateau> trierGateausNomsPrix() {
	    return GateauRepository.trierGateausNomsPrix();
	}


}
