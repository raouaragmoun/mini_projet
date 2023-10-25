package raoua1.com;


import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import raoua1.com.repository.GateauRepository;
import raoua1.com.entity.Gateau;
import raoua1.com.entity.Commande;



@SpringBootTest
class MiniiProjetApplicationTests {

	@Autowired
	private GateauRepository produitRepository;
	@Test
	public void testCreateProduit() {
	Gateau prod = new Gateau("tarte","chocolat",new Date(),67.9);
	produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit()
	{
	Gateau p = produitRepository.findById(1L).get(); 
	System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
	Gateau p = produitRepository.findById(1L).get();
	p.setPrix(1000.0);
	produitRepository.save(p);
	}
	
	
	@Test
	public void testFindByNomProduit()
	{
	List<Gateau> prods = produitRepository.findByNomGateau("tarte");
	for (Gateau p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomProduitContains ()
	{
	List<Gateau> prods=produitRepository.findByNomGateauContains("tarte");
	for (Gateau p : prods)
	{
	System.out.println(p);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Gateau> prods = produitRepository.findByNomPrix("tarte", 67.9);
	for (Gateau p : prods)
	{
	System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Gateau> prods = 
	produitRepository.findByOrderByNomGateauAsc();
	for (Gateau p : prods)
	{
	System.out.println(p);
	}
	}
	
	

	
	
	




}
