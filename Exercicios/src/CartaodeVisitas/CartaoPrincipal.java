package CartaodeVisitas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import CalculadoraEx2.segundaTela;

import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Insets;

public class CartaoPrincipal {

	private JFrame frame;
	private JTextField messageField;
	private JTable table;
	private JTextField saidaField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartaoPrincipal window = new CartaoPrincipal();
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
	public CartaoPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.getContentPane().setBackground(new Color(199, 163, 210));
	    frame.getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 13));
	    frame.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
	    frame.setForeground(new Color(0, 0, 0));
	    frame.setBounds(100, 100, 660, 660);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);

	    JLabel txtDigitarMessage = new JLabel("Digite seu nome: ");
	    txtDigitarMessage.setBounds(10, 83, 236, 26);
	    txtDigitarMessage.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	    frame.getContentPane().add(txtDigitarMessage);
	    
	    

	    messageField = new JTextField();
	    messageField.setBounds(10, 120, 273, 26);
	    messageField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
	    frame.getContentPane().add(messageField);
	    messageField.setColumns(10);
	    

	   	JMenuBar menuBar = new JMenuBar();
	   	menuBar.setMargin(new Insets(1, 1, 1, 1));
	   	menuBar.setBorderPainted(false);
	   	menuBar.setForeground(new Color(64, 0, 64));
	   	menuBar.setBounds(0, 0, 644, 36);
	   	menuBar.setBackground(new Color(149, 83, 168));
	   	frame.getContentPane().add(menuBar);
	    	    
	    	    	  
	   	JMenu mnMenu = new JMenu("Menu >");
	   	menuBar.add(mnMenu); 

	    JMenuItem mntmOpenMessage = new JMenuItem("Abrir mensagem");
	    mntmOpenMessage.setIcon(new ImageIcon(CartaoPrincipal.class.getResource("/Image/copy/message.png")));
	    mntmOpenMessage.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    JOptionPane.showMessageDialog(null, "Olá, bem vindo(a) a minha janela de funções");
	    }
	    
	    });
	    mnMenu.add(mntmOpenMessage);

	  	JMenuItem mntmVisitCard = new JMenuItem("Abrir Cartão de Visita");
	  	mntmVisitCard.setIcon(new ImageIcon(CartaoPrincipal.class.getResource("/Image/copy/cartao.png")));
	  	mntmVisitCard.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    visitCard cartao = new visitCard();
	    cartao.setVisible(true);
	    }
	    });
	 	 mnMenu.add(mntmVisitCard);
	 	 
	 	 JButton btnShowMessage = new JButton("Mostrar");
	 	 btnShowMessage.setBackground(new Color(148, 83, 168));
	 	 btnShowMessage.setFont(new Font("Segoe UI", Font.PLAIN, 13));
	 	 btnShowMessage.setBounds(10, 166, 89, 23);
	 	 btnShowMessage.addActionListener(new ActionListener() {
	 	 	public void actionPerformed(ActionEvent e) {
	 	 		JOptionPane.showMessageDialog(null,"Oiee, "+ messageField.getText());
	 	 	}
	 	 });
	 	 frame.getContentPane().add(btnShowMessage);
	 	 
	 	 table = new JTable();
	 	 table.setModel(new DefaultTableModel(
	 	 	new Object[][] {
	 	 		{1, "Alice"},
	 	 		{2, "Bernardo"},
	 	 		{3, "Carol"},
	 	 		{4, "Danilo"},
	 	 		{5, "Eduarda"},
	 	 	},
	 	 	new String[] {
	 	 		"C\u00F3digo", "Nome"
	 	 	}
	 	 ));
	 	 table.setBounds(351, 47, 194, 80);
	 	 
	 	JScrollPane scrollPane = new JScrollPane(table);
	 	scrollPane.setToolTipText("Nomes dos Alunos\r\n");
		scrollPane.setBounds(310, 49, 324, 107);
	 	 frame.getContentPane().add(scrollPane);
	 	 
	 	 JComboBox cBDefCores = new JComboBox();
	 	 cBDefCores.addActionListener(new ActionListener() {
	 	 	public void actionPerformed(ActionEvent e) {
	 	 		if (cBDefCores.getSelectedItem() == "Rosa") {
	 	 			table.setBackground(Color.PINK);
	 	 	}
	 	 		if (cBDefCores.getSelectedItem() == "Verde") {
	 	 			table.setBackground(Color.GREEN);
	 	 	}
	 	 		if (cBDefCores.getSelectedItem() == "Azul") {
	 	 			table.setBackground(Color.BLUE);
	 	 	}
	 	 		if (cBDefCores.getSelectedItem() == "Branco") {
	 	 			table.setBackground(Color.WHITE);
	 	 	}
	 	 		if (cBDefCores.getSelectedItem() == "Amarelo") {
	 	 			table.setBackground(Color.YELLOW);
	 	 	}
	 	 	}});
	 	 cBDefCores.setFont(new Font("Segoe UI", Font.PLAIN, 13));
	 	 cBDefCores.setModel(new DefaultComboBoxModel(new String[] {"Selecone uma cor para a tabela", "Rosa", "Verde", "Azul", "Branco", "Amarelo"}));
	 	 cBDefCores.setBounds(310, 167, 324, 22);
	 	 frame.getContentPane().add(cBDefCores);
	 	 
	 	 JSeparator separator = new JSeparator();
	 	 separator.setBounds(10, 214, 624, 11);
	 	 frame.getContentPane().add(separator);
	 	 
	 	 JPanel panel = new JPanel();
	 	 panel.setBackground(new Color(218, 193, 225));
	 	 panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(61, 34, 68), null), "Qual(is) seu passatempo favorito?", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(61, 34, 68)));
	 	 panel.setBounds(20, 236, 263, 142);
	 	 frame.getContentPane().add(panel);
	 	 panel.setLayout(null);
	 	 
	 	 JCheckBox chbxLer = new JCheckBox("Ler");
	 	 chbxLer.setBackground(new Color(218, 193, 225));
	 	 chbxLer.setBounds(6, 24, 97, 23);
	 	 panel.add(chbxLer);
	 	 
	 	 JCheckBox chbxSair = new JCheckBox("Sair com os amigos");
	 	 chbxSair.setBackground(new Color(218, 193, 225));
	 	 chbxSair.setBounds(6, 50, 158, 23);
	 	 panel.add(chbxSair);
	 	 
	 	 JCheckBox chbxAssistir = new JCheckBox("Assistir televisão");
	 	 chbxAssistir.setBackground(new Color(218, 193, 225));
	 	 chbxAssistir.setBounds(6, 76, 158, 23);
	 	 panel.add(chbxAssistir);
	 	 
	 	 JButton btnitensSelecionados = new JButton("Passatemos");
	 	 btnitensSelecionados.setBackground(new Color(148, 83, 168));
	 	 btnitensSelecionados.addActionListener(new ActionListener() {
	 	 	public void actionPerformed(ActionEvent e) {
	 	 		 StringBuilder itens = new StringBuilder("Passatempos favs de " +messageField.getText()+ ":\n");

	 	        if (chbxLer.isSelected()) {
	 	            itens.append("- Ler\n");
	 	        }
	 	        if (chbxSair.isSelected()) {
	 	            itens.append("- Sair com os amigos\n");
	 	        }
	 	        if (chbxAssistir.isSelected()) {
	 	            itens.append("- Assistir televisão\n");
	 	        }
	 	        if (itens.toString().equals("Itens selecionados:\n")) {
	 	            itens = new StringBuilder("Nenhum item selecionado.");
	 	        }

	 	        JOptionPane.showMessageDialog(null, itens.toString());
	 	    
	 	 	}
	 	 });
	 	 btnitensSelecionados.setBounds(10, 108, 175, 23);
	 	 panel.add(btnitensSelecionados);
	 	 
	 	 JList listed = new JList();
	 	 listed.setBackground(new Color(218, 193, 225));
	 	 listed.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(61, 34, 68), null), "Lista de compras", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(61, 34, 68)));
	 	 listed.setModel(new AbstractListModel() {
	 	 	String[] values = new String[] {"Frutas", "Verduras", "Leite", "Pão", "Manteiga"};
	 	 	public int getSize() {
	 	 		return values.length;
	 	 	}
	 	 	public Object getElementAt(int index) {
	 	 		return values[index];
	 	 	}
	 	 });
	 	 listed.setBounds(310, 237, 141, 119);
	 	 frame.getContentPane().add(listed);
	 	 
	 	 JList listBlank = new JList();
	 	 listBlank.setBackground(new Color(218, 193, 225));
	 	 listBlank.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(61, 34, 68), null), "J\u00E1 no carrinho", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(61, 34, 68)));
	 	 listBlank.setBounds(461, 236, 141, 119);
	 	 frame.getContentPane().add(listBlank);
	 	 
	 	 JButton btnConfirmar = new JButton("Confirmar");
	 	 btnConfirmar.setBackground(new Color(148, 83, 168));
	 	 btnConfirmar.addActionListener(new ActionListener() {
	 	 	public void actionPerformed(ActionEvent e) {
	 	 		DefaultListModel dlm = new DefaultListModel();
	 	 		listBlank.setModel(dlm);
				
				listed.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				for(Iterator it = listed.getSelectedValuesList().iterator(); it.hasNext();){
					String itemSelecionado = (String) it.next();
					if(!dlm.contains(itemSelecionado)) {
						dlm.addElement(itemSelecionado);
					}
		}
	 	 	}
	 	 });
	 	 btnConfirmar.setBounds(310, 367, 292, 23);
	 	 frame.getContentPane().add(btnConfirmar);
	 	 
	 	 JPanel panel_1 = new JPanel();
	 	 panel_1.setBackground(new Color(218, 193, 225));
	 	 panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Qual seu sexo?", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	 	 panel_1.setBounds(20, 402, 582, 142);
	 	 frame.getContentPane().add(panel_1);
	 	 panel_1.setLayout(null);
	 	 
	 	 saidaField = new JTextField();
	 	 saidaField.setBounds(115, 21, 369, 71);
	 	 panel_1.add(saidaField);
	 	 saidaField.setColumns(10);
	 	 
	 	 JRadioButton btnrMasc = new JRadioButton("Masculino");
	 	 btnrMasc.setBackground(new Color(218, 193, 225));
	 	 buttonGroup.add(btnrMasc);
	 	 btnrMasc.setBounds(16, 33, 89, 23);
	 	 panel_1.add(btnrMasc);
	 	 
	 	 JRadioButton btnrFem = new JRadioButton("Feminino");
	 	 btnrFem.setBackground(new Color(218, 193, 225));
	 	 buttonGroup.add(btnrFem);
	 	 btnrFem.setBounds(16, 59, 89, 23);
	 	 panel_1.add(btnrFem);
	 	 
	 	 JButton btnInsert = new JButton("Inserir");
	 	 btnInsert.setBackground(new Color(148, 83, 168));
	 	 btnInsert.addActionListener(new ActionListener() {
	 	 	public void actionPerformed(ActionEvent e) {
	 	 		if(btnrMasc.isSelected() == true) {
	 	 			saidaField.setText("Bom dia " + messageField.getText() + ", seja bem-vindo ao meu site querido amigo!");
				}if(btnrFem.isSelected() == true) {
					saidaField.setText("Bom dia " +messageField.getText()+ ", seja bem vinda ao meu site querida amiga!");
				}}
	 	 	
	 	 });
	 	 btnInsert.setBounds(252, 108, 89, 23);
	 	 panel_1.add(btnInsert);
	 	 
	 	 JLabel lblNewLabel = new JLabel("");
	 	 lblNewLabel.setIcon(new ImageIcon(CartaoPrincipal.class.getResource("/Image/copy/Iconka-Meow-2-Cat-laptop.72.png")));
	 	 lblNewLabel.setBounds(494, 23, 78, 81);
	 	 panel_1.add(lblNewLabel);
	 	 
	 	 JSeparator separator_1 = new JSeparator();
	 	 separator_1.setBounds(10, 555, 624, 12);
	 	 frame.getContentPane().add(separator_1);
	 	 
	 	 JButton btnExit = new JButton("Exit");
	 	 btnExit.setBackground(new Color(132, 74, 149));
	 	 btnExit.addActionListener(new ActionListener() {
	 	 	public void actionPerformed(ActionEvent e) {
	 	 		System.exit(0);
	 	 	}
	 	 });
	 	 btnExit.setBounds(262, 575, 89, 26);
	 	 frame.getContentPane().add(btnExit);
	}
}


