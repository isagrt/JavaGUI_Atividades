package Carros;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CarrosMain {

	private JFrame frame;
	private JTextField textField;
	private JButton btnClean;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarrosMain window = new CarrosMain();
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
	public CarrosMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 280, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Modelos Populares Brasileiros");
		title.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		title.setBounds(27, 26, 209, 37);
		frame.getContentPane().add(title);
		
		JLabel model = new JLabel("Modelo:");
		model.setForeground(new Color(0, 64, 0));
		model.setFont(new Font("Verdana", Font.PLAIN, 13));
		model.setBounds(27, 72, 66, 19);
		frame.getContentPane().add(model);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "--")
					textField.setText("");
				if(comboBox.getSelectedItem() == "Gol")
					textField.setText("Volkswagem");
				if(comboBox.getSelectedItem() == "Uno")
					textField.setText("Fiat");
				if(comboBox.getSelectedItem() == "Onix")
					textField.setText("Chevrolet");
				if(comboBox.getSelectedItem() == "Ka")
					textField.setText("Ford");
				if(comboBox.getSelectedItem() == "HB20")
					textField.setText("Hyundai");

					
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--", "Gol", "Uno", "Onix", "HB20", "Ka"}));
		comboBox.setBounds(27, 102, 193, 22);
		frame.getContentPane().add(comboBox);
		
		
		
		JLabel montadora = new JLabel("Montadora:");
		montadora.setForeground(new Color(0, 64, 0));
		montadora.setFont(new Font("Verdana", Font.PLAIN, 13));
		montadora.setBounds(27, 135, 110, 19);
		frame.getContentPane().add(montadora);
		
		textField = new JTextField();
		textField.setBounds(27, 165, 193, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnClean = new JButton("Limpar");
		btnClean.setForeground(new Color(255, 128, 0));
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        textField.setText("");
			}
		});
		btnClean.setBounds(27, 196, 89, 23);
		frame.getContentPane().add(btnClean);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(131, 196, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
