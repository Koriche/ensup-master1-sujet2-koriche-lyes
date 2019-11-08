package presentation;

import metier.Personne;
import service.Methodes;

public class Main {

	public static void main(String[] args) {
		
		
		Personne p1 = new Personne(1, "Koriche", "Lyes", "Ly-kor", "lk94", "01/06/1994");
		Personne p2 = new Personne(2, "Villanueva", "Jonthan", "Jo-vil", "jv94", "07/09/1994");
		Personne p3 = new Personne(3, "Cosson", "Jennifer", "Je-cos", "jc93", "10/03/1993");
		
		
		Methodes service = new Methodes();
		service.creerPersonne(Methodes.base, p1);
		service.creerPersonne(Methodes.base, p2);
		service.creerPersonne(Methodes.base, p3);
		
		
		System.out.println("Personnes avant ajout :");System.out.println(Methodes.base);System.out.println(" ");
		
		Personne p4 = new Personne(4, "Sartori", "Romain", "Ro-sar", "rs95", "11/10/1995");
		service.creerPersonne(Methodes.base, p4);
		
		System.out.println("Personnes après ajout d'une nouvelle personne :");
		System.out.println(Methodes.base);
	}

}