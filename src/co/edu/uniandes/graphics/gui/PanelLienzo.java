package co.edu.uniandes.graphics.gui;

import javax.swing.JPanel;
import java.awt.geom.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.*;


public class PanelLienzo extends JPanel{
	public PanelLienzo() {
		this.setSize(700,700);
		this.setBackground((Color.WHITE));
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		//realizo graficos pedidos
		Rectangle2D.Double rect1=new Rectangle2D.Double(0, 0, 400, 400);
		Ellipse2D.Double Ellip1= new Ellipse2D.Double(350,30,100,100);
		Rectangle2D.Double rect2=new Rectangle2D.Double(390, 130, 20, 40);
		RoundRectangle2D.Double rect3=new RoundRectangle2D.Double(320, 170, 25, 180,20,20);
		RoundRectangle2D.Double rect4=new RoundRectangle2D.Double(455, 170, 25, 180,20,20);
		Rectangle2D.Double rect5=new Rectangle2D.Double(335, 170, 130, 40);
		RoundRectangle2D.Double rect6=new RoundRectangle2D.Double(345, 200, 15, 40,20,20);
		RoundRectangle2D.Double rect7=new RoundRectangle2D.Double(440, 200, 15, 40,20,20);
		Rectangle2D.Double rect8=new Rectangle2D.Double(360, 170, 80, 180);
		RoundRectangle2D.Double rect9=new RoundRectangle2D.Double(360, 330, 35, 180,20,20);
		RoundRectangle2D.Double rect10=new RoundRectangle2D.Double(405, 330, 35, 180,20,20);
		Polygon rect11=new Polygon(new int[] { 230, 250, 550, 570 }, new int[] { 550, 500, 500, 550 }, 4);
		g2d.setColor(Color.gray);
		g2d.fill(rect1);
		g2d.setColor(Color.blue);
		g2d.fill(rect11);		
		g2d.setColor(Color.BLACK);
		g2d.fill(Ellip1); 
		g2d.fill(rect2); 
		g2d.fill(rect3);
		g2d.fill(rect4);
		g2d.fill(rect5);
		g2d.fill(rect10);
		g2d.fill(rect9);
		g2d.fill(rect8);
		g2d.setColor(Color.gray);
		g2d.fill(rect6);
		g2d.setColor(Color.WHITE);
		g2d.fill(rect7);


		//Realizo estrella
		g2d.setColor(Color.yellow);
		for (int pos =0; pos<=80;pos+=5) {
			g2d.drawLine(200, pos+20, 200-pos, 100);
			g2d.drawLine(200, pos+20, 200+pos, 100);
			g2d.drawLine(200, 180-pos, 200-pos, 100);
			g2d.drawLine(200, 180-pos, 200+pos, 100);
		}
		//imagen rellena sin utilizar las figuras
		g2d.setColor(Color.orange);
		for (int pos =160; pos<=280;pos+=1) {
			g2d.drawLine(30, pos, 110, pos);
		}
		//creo figura que hace parte del escenario

		Polygon rect12=new Polygon(new int[] {30, 70, 110}, new int[] { 160,120,160}, 3);
		Polygon rect13=new Polygon(new int[] {10, 30, 30}, new int[] { 280,160,280}, 3);
		Polygon rect14=new Polygon(new int[] {110, 110, 130}, new int[] { 280,160,280}, 3);
		Polygon rect15=new Polygon(new int[] {10, 30, 50, 70 }, new int[] { 320,280,280,320}, 4);
		Polygon rect16=new Polygon(new int[] { 70, 90, 110, 130 }, new int[] { 320,280,280,320}, 4);
		Polygon rect17=new Polygon(new int[] { 40,50,90,100}, new int[] { 280,250,250,280}, 4);
		Ellipse2D.Double Cir1= new Ellipse2D.Double(40,180,60,60);
		Ellipse2D.Double Cir2= new Ellipse2D.Double(50,190,40,40);
	
		

		g2d.setColor(Color.RED);
		g2d.fill(rect12); 
		g2d.fill(rect13); 
		g2d.fill(rect14); 
		g2d.fill(rect15); 
		g2d.fill(rect16); 
		g2d.fill(Cir1); 
		g2d.setColor(Color.GREEN);
		g2d.fill(Cir2);
		g2d.fill(rect17);

		
		
		
		
	}

}
