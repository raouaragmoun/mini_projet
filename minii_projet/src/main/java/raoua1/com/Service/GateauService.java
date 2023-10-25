package raoua1.com.Service;

import java.util.List;

import raoua1.com.entity.Commande;
import raoua1.com.entity.Gateau;

public interface GateauService {
	
	Gateau saveProduit(Gateau p);
	Gateau updateProduit(Gateau p);
	void deleteGateaut (Gateau p);
	 void deleteGateauById(Long id);
	Gateau getGateau(Long id);
	List<Gateau> getAllGateaus();
	List<Gateau> findByNomGateau(String nom);
	List<Gateau> findByNomGateauContains(String nom);
	List<Gateau> findByNomPrix (String nom, Double prix);
	List<Gateau> findByCommande (Commande commande);
	List<Gateau> findByOrderByNomGateauAsc();
	List<Gateau> trierGateausNomsPrix();


}
