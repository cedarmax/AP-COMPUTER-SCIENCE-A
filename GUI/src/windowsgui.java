import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class windowsgui {

	public static void main(String[] args) {
		// Create the frame
		JFrame theGui = new JFrame();
		theGui.setSize(300, 300);
		theGui.setTitle("egfug");
		theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGui.setVisible(true);
		
		/*
		// Color the border of the frame
		JPanel northpanel = new JPanel();
		northpanel.setBackground(Color.blue);
		Container pane = theGui.getContentPane();
		pane.add(northpanel, BorderLayout.NORTH);
		
		JPanel southpanel = new JPanel();
		southpanel.setBackground(Color.blue);
		pane.add(southpanel, BorderLayout.SOUTH);
		
		JPanel eastpanel = new JPanel();
		eastpanel.setBackground(Color.blue);
		pane.add(eastpanel, BorderLayout.EAST);

		JPanel westpanel = new JPanel();
		westpanel.setBackground(Color.blue);
		pane.add(westpanel, BorderLayout.WEST);
		*/
		
		/*
		//Color the center of the frame
		JPanel centerpanel = new JPanel();
		centerpanel.setBackground(Color.white);
		Container pane = theGui.getContentPane();
		pane.add(centerpanel, BorderLayout.CENTER);
		
		JPanel eastpanel = new JPanel();
		eastpanel.setBackground(Color.red);
		pane.add(eastpanel, BorderLayout.EAST);
		
		JPanel westpanel = new JPanel();
		westpanel.setBackground(Color.blue);
		pane.add(westpanel, BorderLayout.WEST);
		*/
		
		/*bggb g
		//bulgaria flag		
		JPanel centerpanel = new JPanel();
		centerpanel.setBackground(Color.green);
		Container pane = theGui.getContentPane();
		pane.add(centerpanel, BorderLayout.CENTER);
		
		JPanel eastpanel = new JPanel();
		eastpanel.setBackground(Color.white);
		pane.add(eastpanel, BorderLayout.NORTH);
		
		JPanel westpanel = new JPanel();
		westpanel.setBackground(Color.red);
		pane.add(westpanel, BorderLayout.SOUTH);
		*/
		
		JPanel centerpanel = new JPanel();
		centerpanel.setBackground(Color.blue);
		Container pane = theGui.getContentPane();
		pane.add(centerpanel, BorderLayout.CENTER);
		
		JPanel eastpanel = new JPanel();
		eastpanel.setBackground(Color.red);
		pane.add(eastpanel, BorderLayout.NORTH);
		
		JPanel westpanel = new JPanel();
		westpanel.setBackground(Color.yellow);
		pane.add(westpanel, BorderLayout.SOUTH);
		pane.setLayout(new GridLayout(3,0));

	}

}
