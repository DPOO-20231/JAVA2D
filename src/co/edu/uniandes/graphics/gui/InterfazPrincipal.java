package co.edu.uniandes.graphics.gui;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class InterfazPrincipal extends JFrame {
	public InterfazPrincipal() {
		
		setSize(700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel lienzo =new PanelLienzo();
		this.add(lienzo, BorderLayout.CENTER);
		setVisible(true);		
	}
	
	public static void main(String[] args) {		
		new InterfazPrincipal();
	}
	
}
