package projet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame {

	public Test(){
		setTitle("Test");
		setSize(800,600);
		getContentPane().setLayout(null);
		//this.setVisible(true);
	}
	
	public static void main(String args[]){
		JFrame mina = new Test();
		mina.setVisible(true);		
	}
	
	public void elements_tab(){
		JButton button_tab [][] = new JButton[4][6];
		int poscol=50, poslin=70, lin=80, hautlin=30;

		for(int i=0;i<=3;i++){
			for(int j=0;j<=5;j++){
				button_tab[i][j] = new JButton ("NULL");
				poscol = poscol + 80;
				button_tab[i][j].setBounds(poscol,poslin,lin,hautlin);
				//button_tab[i][j].setBounds(5,10,100,80);
				getContentPane().add(button_tab[1][j]);
			}
	}
	}
	}
