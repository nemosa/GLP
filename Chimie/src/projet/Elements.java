package projet;

import java.io.*;

public class Elements {
	//private String nom;
	private String name;
	
	//private String region;
	private String symbol;
	
	//private long population;
	private int atomicNumber;

	//private double densite;
	private double atomicMass;
	


	public Elements(String name, String symbol, int atomicNumber, double atomicMass) {
		this.name=name;
		this.symbol=symbol;
		this.atomicNumber=atomicNumber;
		this.atomicMass=atomicMass;
	}
	
	public Elements(String name){
		this.name=name;
	}
	
	
	public String getName(){
		return name;
	}
	
	
	//Symbol
	
	public String getSymbol(){
		return symbol;					
	}
	
	public void setSymbol(String name){
		String s;
		symbol="non disponible";
		String []tab;
		try{
		BufferedReader br =new BufferedReader(new FileReader("Elements.txt"));
		s=br.readLine();
		while(s!=null){
			if(s.contains(name)){
				tab=s.split("\t");
			     symbol=tab[1];
				break;
			}
			s=br.readLine();
		}
		br.close();
		}catch(Exception e){
			e.getMessage();
		}									
	}
	
	//atomic Number
	public int getAtomicNumber(){
		return atomicNumber;
	}
	
	public void setAtomicNumber(String name){
		String s;
		String split [], tab;
		int atomicNumber;
		try{
		BufferedReader br =new BufferedReader(new FileReader("Elements.txt"));
		s=br.readLine();
		while(s!=null){
			if(s.contains(name)){
				split=s.split("\t");
				tab = split[0];
				atomicNumber =Integer.parseInt(tab);
				break;
			}
			s=br.readLine();
		}
		br.close();
		}catch(Exception e){
			e.getMessage();
		}
	//	atomicNumber = atomicNumber;
	}
	
	public double getAtomicMass(){
		return atomicMass;
	}
	
	public void setAtomicMass(String name){
		String s;
		String split [], tab;
		double atomicMass;
		try{
		BufferedReader br =new BufferedReader(new FileReader("Elements.txt"));
		s=br.readLine();
		while(s!=null){
			if(s.contains(name)){
				split=s.split("\t");
				tab = split[2];
				atomicMass =Double.parseDouble(tab);
				break;
			}
			s=br.readLine();
		}
		br.close();
		}catch(Exception e){
			e.getMessage();
		}
	}
	
	
	
	
	
	

}
