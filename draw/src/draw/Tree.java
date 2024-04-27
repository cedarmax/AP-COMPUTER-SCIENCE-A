package draw;

import javax.swing.*;
import java.awt.*;


public class Tree extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public static void main(String[] args) {
		
		//JFrame win = new JFrame("Draw");
		Tree win = new Tree();
		win.setTitle("Drawing");
		win.setBounds(0, 0, 800, 800);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

	}

	
	public void paint (Graphics g) {
		
		super.paint(g);
		
	
		g.drawLine(300, 300, 50, 200);
		g.drawLine(500, 500, 50, 300);
		g.drawLine(330, 300, 30, 305);
		g.drawLine(400, 400, 30, 300);
		g.drawLine(300, 300, 30, 300);
		g.drawLine(300, 360, 333, 350);
		g.drawLine(100, 400, 30, 340);
		g.drawLine(300, 300, 30, 370);
		g.drawLine(301, 600, 30, 309);
		g.drawLine(100, 300, 30, 300);
		g.drawLine(300, 300, 30, 300);
		g.drawOval(100, 300, 50, 50);
		g.drawOval(200, 300, 50, 50);
		
	}
}
