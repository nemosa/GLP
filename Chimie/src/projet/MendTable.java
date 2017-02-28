package projet;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui extends JFrame {
	
	private int i;





	//private JButton button_tab [][] = new JButton[4][6];

	
	public gui(){
		
		this.setTitle("Table de Mendeliev");
		this.setSize(1530, 740);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //activation du bouton "x"
		this.setVisible(true);
		
		JPanel panneau = new JPanel(new GridLayout(3, 8));
		 
		this.add(panneau);
		 
		for (int i=0;i<3;i++) {
		        for (int j=0;j<8;j++){
				       if (i!=0){
				    	   for (j=1;j<7;j++){
				    		   panneau.add(new JButton());
				    	   }
				       }
			
		        }}
		}
	

		

		
		/*this.getContentPane().setLayout(null);
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=5;j++){
				getContentPane().add(button_tab[i][j]);
			}
		}*/
	
	
	public static void main(String[] args){
		new gui();
	}
}
