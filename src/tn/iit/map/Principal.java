package tn.iit.map;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author mo5
 *
 */
public class Principal extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setSize(550, 550);
		getContentPane().setLayout(null);

		JButton bt1 = new JButton();
		bt1.setBounds(450, 450, 50, 50);
		bt1.setBackground(Color.red);
		getContentPane().add(bt1);
		Voiture av1 = new Voiture(bt1);

		JButton bt2 = new JButton();
		bt2.setBounds(0, 0, 50, 50);
		bt2.setBackground(Color.green);
		getContentPane().add(bt2);
		Voiture av2 = new Voiture(bt2);
		
		JButton bt3 = new JButton();
		bt3.setBounds(250, 300, 50, 50);
		bt3.setBackground(Color.yellow);
		getContentPane().add(bt3);
		Voiture av3 = new Voiture(bt3);
		
		JButton bt4 = new JButton();
		bt4.setBounds(250, 100, 50, 50);
		bt4.setBackground(Color.black);
		getContentPane().add(bt4);
		Voiture av4 = new Voiture(bt4);
		
		JButton bt5 = new JButton();
		bt5.setBounds(50, 300, 50, 50);
		bt5.setBackground(Color.blue);
		getContentPane().add(bt5);
		Voiture av5 = new Voiture(bt5);
		
		JLabel jl = new JLabel();
		jl.setBounds(0, 0, 500, 500);
		getContentPane().add(jl);
		jl.setIcon(new ImageIcon("C:\\Users\\mo5\\Desktop\\map.png"));

		av1.start();
		av2.start();
		av3.start();
		av4.start();
		av5.start();
		validate();
	}
}
