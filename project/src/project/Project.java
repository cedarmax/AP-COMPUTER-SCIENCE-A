package project;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;

public class Project {

	public static void main(String[] args) {
		// Create window
		javax.swing.JFrame project = new JFrame();
		project.setBounds(100, 100, 800, 600);
		project.setTitle("egfug");
		project.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		project.setVisible(true);
		
		Container btn = project.getContentPane(); 
		
		JButton btn1 = new JButton("7");
		btn1.setBounds(10, 90, 50 , 50);
		btn.add(btn1);
		
		JButton btn2 = new JButton("8");
		btn2.setBounds(80, 90, 50 , 50);
		btn.add(btn2);
		
		JButton btn3 = new JButton("9");
		btn3.setBounds(150, 90, 50 , 50);
		btn.add(btn3);
		
		JButton btn4 = new JButton("+");
		btn4.setBounds(220, 90, 50 , 50);
		btn.add(btn4);
		
		JButton btn5 = new JButton("4");
		btn5.setBounds(10, 160, 50 , 50);
		btn.add(btn5);
		
		JButton btn6 = new JButton("5");
		btn6.setBounds(80, 160, 50 , 50);
		btn.add(btn6);
		
		JButton btn7 = new JButton("6");
		btn7.setBounds(150, 160, 50, 50);
		btn.add(btn7);
		
		JButton btn8 = new JButton("-");
		btn8.setBounds(220, 160, 50 , 50);
		btn.add(btn8);
		
		JButton btn9 = new JButton("1");
		btn9.setBounds(10, 230, 50 , 50);
		btn.add(btn9);
		
		JButton btn10 = new JButton("2");
		btn10.setBounds(80, 230, 50 , 50);
		btn.add(btn10);
		
		JButton btn11 = new JButton("3");
		btn11.setBounds(150, 230, 50 , 50);
		btn.add(btn11);
		
		JButton btn12 = new JButton("*");
		btn12.setBounds(220, 230, 50 , 50);
		btn.add(btn12);
		
		JButton btn13 = new JButton("On");
		btn13.setBounds(10, 300, 50 , 50);
		btn.add(btn13);
		
		JButton btn14 = new JButton("=");
		btn14.setBounds(80, 300, 50 , 50);
		btn.add(btn14);
		
		JButton btn15 = new JButton("0");
		btn15.setBounds(150, 300, 50 , 50);
		btn.add(btn15);
		
		JButton btn16 = new JButton("/");
		btn16.setBounds(220, 300, 50 , 50);
		btn.add(btn16);
		
		JTextField textField = new JTextField();
		textField.setBounds(0, 0, 200, 30);
		btn.add(textField);

	}

}
