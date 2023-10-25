package raoua1.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import raoua1.com.entity.Commande;
import raoua1.com.entity.Gateau;
@RepositoryRestResource(path = "rest")

public interface GateauRepository extends JpaRepository<Gateau, Long>{
	List<Gateau> findByNomGateau(String nom);
	 List<Gateau> findByNomGateauContains(String nom);
	 @Query("select p from Gateau p where p.nomGateau like %?1 and p.prix > ?2")
	 List<Gateau> findByNomPrix (String nom, Double prix);
	 
	 @Query("select p from Gateau p where p.commande = ?1")
	 List<Gateau> findByCommande (Commande commande);
	 
	 List<Gateau> findByOrderByNomGateauAsc();
	 @Query("select p from Gateau p order by p.nomGateau ASC, p.prix DESC")
	 List<Gateau> trierGateausNomsPrix ();
	 

	 
}
