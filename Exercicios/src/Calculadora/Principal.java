package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Principal {

	private JFrame frame;
	private JTextField num1Field;
	private JTextField num2Field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(210, 210, 255));
		frame.setBounds(100, 100, 312, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel number1 = new JLabel("Valor 1: ");
		number1.setBounds(33, 54, 46, 14);
		frame.getContentPane().add(number1);
		
		num1Field = new JTextField();
		num1Field.setBounds(89, 54, 116, 20);
		frame.getContentPane().add(num1Field);
		num1Field.setColumns(10);
		
		JLabel number2 = new JLabel("Valor 2:");
		number2.setBounds(33, 117, 46, 14);
		frame.getContentPane().add(number2);
		
		num2Field = new JTextField();
		num2Field.setColumns(10);
		num2Field.setBounds(89, 117, 116, 20);
		frame.getContentPane().add(num2Field);
		
		JButton exitBtn = new JButton("SAIR");
		exitBtn.setBackground(new Color(225, 0, 0));
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.dispose();
			}
		});
		exitBtn.setBounds(33, 180, 183, 38);
		frame.getContentPane().add(exitBtn);
		
		JButton adicao = new JButton("+");
		adicao.setBackground(new Color(250, 205, 50));
		adicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double soma = num1 + num2;
				
				JOptionPane.showMessageDialog(null,"Resultado: "+soma, "Soma",1);
			}
		});
		adicao.setBounds(238, 50, 48, 23);
		frame.getContentPane().add(adicao);
		
		JButton sub = new JButton("-");
		sub.setBackground(new Color(250, 205, 50));
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double subtrair = num1 - num2;
				
				JOptionPane.showMessageDialog(null,"Resultado: "+subtrair, "Subtração",1);
			}
		});
		sub.setBounds(238, 97, 48, 23);
		frame.getContentPane().add(sub);
		
		JButton multi = new JButton("x");
		multi.setBackground(new Color(250, 205, 50));
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double multiplicar = num1 * num2;
				
				JOptionPane.showMessageDialog(null,"Resultado: "+multiplicar, "	Multiplicação",1);
			}
		});
		multi.setBounds(238, 147, 48, 23);
		frame.getContentPane().add(multi);
		
		JButton divisao = new JButton("/");
		divisao.setBackground(new Color(250, 205, 50));
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double dividir= num1 / num2;
				
				JOptionPane.showMessageDialog(null,"Resultado: "+dividir, "Divisão",1);
			}
		});
		divisao.setBounds(238, 195, 48, 23);
		frame.getContentPane().add(divisao);
	}

}
