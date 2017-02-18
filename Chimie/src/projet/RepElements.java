package projet;

import java.io.*;
import java.util.ArrayList;

public class RepElements {
   ArrayList<Elements> al =new ArrayList<Elements>();
	
	public void AjouterDesElements(){
		
		
		 String s=null;
		 String []tab;
		 
		 try{
		        BufferedReader br =new BufferedReader(new FileReader("Elements.txt"));
				
				s=br.readLine();
				tab=s.split("/t");		
				while(s!=null){
					Elements e=new Elements(tab[3]);
					
					al.add(e);
					
					s=br.readLine();
					tab=s.split("/t");
					
				}
				br.close();
		 }catch(Exception e){
			 e.getMessage();
		 }
		
	}
	
	public Elements byName(String name){
		
		for(Elements e : al){
			if (e.getName().equals(name)){
				return e;
				}
			}
		return null;
		
	}//méthode de recherche pour le mode graphique
	
	public String bySymbol(String symbol){
		String s ="";
		int m = 0;
		for(Elements e : al){
			if (e.getSymbol().equals(symbol)){
				s+= e.getName()+"\t";
				m++;
				if (m%6==0){
					s+="\n";
				}
				
			}
			
		}
		return s;
		
	}
	
/*	public Elements byAtomicNumber(String atomicNumber){
		i = Integer.parseInt(atomicNumber);		
		for(Elements e : al){
			if (e.getAtomicNumber().equals(i)){
				return e;
			}
		}
		return null;
	}*/
		
		
	
	public int Taille(){
		return al.size();
	}	

}
