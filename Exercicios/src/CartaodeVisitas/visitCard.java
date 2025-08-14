package CartaodeVisitas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

public class visitCard extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visitCard frame = new visitCard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public visitCard() {
		setBounds(100, 100, 613, 424);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(159, 220, 248));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(159, 220, 248));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Quem sou eu?", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(10, 90, 129)));
		panel.setBounds(290, 60, 281, 261);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome: Isadora Goedert");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 36, 226, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Idade: 19 anos");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(10, 61, 226, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cursando: Design Gráfico na Univille");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(10, 86, 226, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hobbies: Pintar, desenhar e fazer colagens");
		lblNewLabel_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(10, 111, 261, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(20, 136, 100, 102);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(visitCard.class.getResource("/Image/copy/ritinha.jpg")));
		
		JLabel lblNewLabel_3 = new JLabel("Amante de Rita Lee");
		lblNewLabel_3.setFont(new Font("Corbel Light", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(130, 151, 141, 26);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("e amante da ritinha");
		lblNewLabel_3_1.setFont(new Font("Corbel Light", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(130, 175, 141, 26);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("<3");
		lblNewLabel_3_1_1.setFont(new Font("Dubai", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(178, 212, 31, 26);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(visitCard.class.getResource("/Image/copy/HelloKitty (2).jpg")));
		lblNewLabel.setBounds(-11, 38, 300, 300);
		contentPanel.add(lblNewLabel);
	}
}
