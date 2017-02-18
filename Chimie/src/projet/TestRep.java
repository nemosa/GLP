package projet;

import java.util.Scanner;

public class TestRep {
		
	public static void main(String[]args){
			RepElements r = new RepElements();
			r.AjouterDesElements();
			System.out.println(r.Taille());
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez le nom de l'élément :");
			String str = sc.nextLine();
			Elements e =r.byName(str);
			System.out.println(e);
			
			/*Scanner sc1 = new Scanner(System.in);
			System.out.println("Entrez le symbol de l'élément :");
			String str1 = sc1.nextLine();
			String p1 =r.bySymbol(str1);
			System.out.println(p1);
			
		/*	Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez le nombre de population :");
			String str2 = sc2.nextLine();
			Pays p2 =r.RechercheParPopulation(str2);
			System.out.println(p2);
	*/
		
	}
}
