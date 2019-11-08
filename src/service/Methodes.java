package service;

import java.util.ArrayList;
import java.util.List;
import metier.Personne;

public class Methodes {
	
	
	public int creerPersonne(List<Personne> list, Personne personne) {
		list.add(personne);
		return 1;
	}
	
	public Personne getPersonne(List<Personne> list, int idPersonne) {
		for(Personne p1 : list) {
			if(p1.getPersonneId() == idPersonne) {
				return p1;
			}
		}
		return null;
	}
	

	public static List<Personne> base = new ArrayList<Personne>();
	public List<Personne> findAllPersonnes() {
		return (List<Personne>) base;
	}
	
	
	public void supprimerPersonne(List<Personne> list, int idPersonne) {
		for(Personne p2 : list) {
			if(p2.getPersonneId() == idPersonne) {
				list.remove(p2);
				break;
			}
		}
	}
	

public void updatePersonne(List<Personne> list, Personne p, String nom, String prenom, String dateNaissance) {
	for(Personne personne : list) {
		if(p.getPersonneId() == p.getPersonneId()) {
			personne.setNom(nom);
			personne.setPrenom(prenom);
			personne.setDateNaissance(dateNaissance);
			break;
		}
	}
	
  }
}
