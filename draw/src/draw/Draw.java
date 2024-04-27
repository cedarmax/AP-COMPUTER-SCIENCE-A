package draw;

import javax.swing.*;
import java.awt.*;


public class Draw extends JFrame {

	public static void main(String[] args) {
		
		//JFrame win = new JFrame("Draw");
		Draw win = new Draw();
		win.setTitle("Drawing");
		win.setBounds(0, 0, 800, 800);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

	}

	
	public void paint (Graphics g) {
		
		super.paint(g);
		
		g.drawRect(310,  310,  340,  340);
		g.drawLine(300, 300, 50, 200);
		g.drawLine(500, 300, 50, 300);
		g.drawLine(300, 300, 30, 300);
		g.drawLine(300, 300, 30, 300);
		g.drawOval(100, 300, 50, 50);
		g.drawOval(200, 300, 50, 50);
		
	}
}
