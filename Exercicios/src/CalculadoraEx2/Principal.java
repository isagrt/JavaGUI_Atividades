package CalculadoraEx2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Principal {

	private JFrame frame;
	private JTextField num1Field;
	private JLabel number2;
	private JTextField num2Field;
	private JButton subtrair;
	private JButton dividir;
	private JButton multiplicar;
	private JButton exit;
	private JButton clear;
	private JTextField resultField;
	private JLabel result;

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
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 223, 228));
		frame.setBounds(100, 100, 382, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		num1Field = new JTextField();
		num1Field.setBounds(111, 44, 112, 20);
		frame.getContentPane().add(num1Field);
		num1Field.setColumns(10);
		
		JLabel number1 = new JLabel("Número 1: ");
		number1.setFont(new Font("Verdana", Font.BOLD, 14));
		number1.setBounds(23, 45, 95, 14);
		frame.getContentPane().add(number1);
		
		JButton adicionar = new JButton("+");
		adicionar.setBackground(new Color(159, 207, 255));
		adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double soma = num1 + num2;
				
				result.setText(String.format("Resultado da adição:"));
				resultField.setText(String.format("%.2f", soma));
				
			}
		});
		adicionar.setBounds(252, 21, 86, 23);
		frame.getContentPane().add(adicionar);
		
		number2 = new JLabel("Número 2:");
		number2.setFont(new Font("Verdana", Font.BOLD, 14));
		number2.setBounds(23, 91, 84, 14);
		frame.getContentPane().add(number2);
		
		num2Field = new JTextField();
		num2Field.setColumns(10);
		num2Field.setBounds(111, 90, 112, 20);
		frame.getContentPane().add(num2Field);
		
		subtrair = new JButton("-");
		subtrair.setBackground(new Color(159, 207, 255));
		subtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double subtrair = num1 - num2;
				
				result.setText(String.format("Resultado da subtração:"));
				resultField.setText(String.format("%.2f", subtrair));
			}
		});
		subtrair.setBounds(252, 55, 86, 23);
		frame.getContentPane().add(subtrair);
		
		dividir = new JButton("/");
		dividir.setBackground(new Color(159, 207, 255));
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double dividir= num1 / num2;
				
				result.setText(String.format("Resultado da divisão:"));
				resultField.setText(String.format("%.2f", dividir));
			}
		});
		dividir.setBounds(252, 123, 86, 23);
		frame.getContentPane().add(dividir);
		
		multiplicar = new JButton("X");
		multiplicar.setBackground(new Color(159, 207, 255));
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(num1Field.getText()); 
				double num2= Double.parseDouble(num2Field.getText());
				double multiplicar = num1 * num2;
				
				result.setText(String.format("Resultado da multiplicação:"));
				resultField.setText(String.format("%.2f", multiplicar));
			}
		});
		multiplicar.setBounds(252, 89, 86, 23);
		frame.getContentPane().add(multiplicar);
		
		exit = new JButton("SAIR");
		exit.setBackground(new Color(193, 0, 0));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(252, 191, 86, 35);
		frame.getContentPane().add(exit);
		
		clear = new JButton("LIMPA");
		clear.setBackground(new Color(248, 200, 7));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1Field.setText("");
		        num2Field.setText("");
		        result.setText("Resultado");
		        resultField.setText("");
				
			}
		});
		clear.setBounds(252, 157, 86, 23);
		frame.getContentPane().add(clear);
		
		resultField = new JTextField();
		resultField.setBackground(new Color(193, 224, 255));
		resultField.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		resultField.setForeground(new Color(193, 0, 0));
		resultField.setEditable(false);
		resultField.setBounds(23, 191, 190, 35);
		frame.getContentPane().add(resultField);
		resultField.setColumns(10);
		
		result = new JLabel("Resultado");
		result.setFont(new Font("Verdana", Font.BOLD, 14));
		result.setBounds(23, 149, 219, 35);
		frame.getContentPane().add(result);
		
		JButton btnAbrir = new JButton("Abrir tela");
		btnAbrir.setToolTipText("abrir segunda tela");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundaTela tela = new segundaTela();
				tela.setVisible(true); //tela.show(); -> funciona mas está caindo em desuso!
			}
		});
		btnAbrir.setBounds(23, 235, 315, 23);
		frame.getContentPane().add(btnAbrir);
	}
}
