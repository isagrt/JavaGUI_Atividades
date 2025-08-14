package CalculoAdicao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame calculo;
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
					window.calculo.setVisible(true);
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
		calculo = new JFrame();
		calculo.getContentPane().setBackground(new Color(168, 215, 194));
		calculo.setBackground(new Color(139, 199, 199));
		calculo.setBounds(100, 100, 300, 301);
		calculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculo.getContentPane().setLayout(null);
		
		JLabel number1 = new JLabel("Número 1: ");
		number1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		number1.setBounds(40, 43, 85, 31);
		calculo.getContentPane().add(number1);
		
		JLabel number2 = new JLabel("Número 2: ");
		number2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		number2.setBounds(40, 110, 85, 31);
		calculo.getContentPane().add(number2);
		
		num1Field = new JTextField();
		num1Field.setBounds(148, 46, 96, 28);
		calculo.getContentPane().add(num1Field);
		num1Field.setColumns(10);
		
		num2Field = new JTextField();
		num2Field.setColumns(10);
		num2Field.setBounds(148, 112, 96, 28);
		calculo.getContentPane().add(num2Field);
		
		JButton calcular = new JButton("Calcular soma");
		calcular.setForeground(new Color(255, 255, 255));
		calcular.setBackground(new Color(0, 128, 77));
		calcular.setFont(new Font("Verdana", Font.BOLD, 13));
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double soma = num1 + num2;
				
				JOptionPane.showMessageDialog(null,"A soma dos dois números: "+soma, "Soma",1);
				
			}
		});
		calcular.setBounds(40, 178, 204, 31);
		calculo.getContentPane().add(calcular);
	}

}
