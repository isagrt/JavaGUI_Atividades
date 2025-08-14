package CalculadoraEx2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class segundaTela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					segundaTela frame = new segundaTela();
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
	public segundaTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(segundaTela.class.getResource("/Image/Brain - 480x480.png")));
		lblNewLabel.setBounds(134, 41, 135, 153);
		contentPane.add(lblNewLabel);
		
		JLabel comprimento = new JLabel("Oiee!!");
		comprimento.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 33));
		comprimento.setBounds(47, 39, 90, 155);
		contentPane.add(comprimento);
		
		JButton closeSystem = new JButton("Fecha sistema");
		closeSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closeSystem.setBounds(123, 227, 89, 23);
		contentPane.add(closeSystem);
		
		JButton closeFrame = new JButton("Fecha tela");
		closeFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		closeFrame.setBounds(264, 227, 89, 23);
		contentPane.add(closeFrame);

	}
}
