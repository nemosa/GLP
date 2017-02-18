/*package projet;

import java.io.*;                            


public class Elements {

	private int number= 0 ;
	
	public Elements (int number) {
		this.number = number;
	}
	
	public String getAtomicNumber(){
		BufferedReader br = null;
		String lign = "";
		String atomicnumber = "";

		try {
			FileReader fr = new FileReader("Elements");
			br = new BufferedReader(fr); 
			while ((lign = br.readLine()) != null) {
				if ((lign.contains(number))) {
					String[] sup = lign.split("\t"); 
					atomicnumber = sup[2];
				}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return superficie;
	}

}
*/