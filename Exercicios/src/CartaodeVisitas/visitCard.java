package CartaodeVisitas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class visitCard extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JLabel label;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                visitCard frame = new visitCard();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public visitCard() {
        setTitle("Cartão de Visitas");
        setBounds(100, 100, 724, 523);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        contentPanel.setBackground(new Color(159, 220, 248));
        contentPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        getContentPane().add(contentPanel, BorderLayout.CENTER);


        JLabel lblHelloKitty = new JLabel(new ImageIcon(getClass().getResource("/Image/copy/HelloKitty (2).jpg")));
        lblHelloKitty.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(new Color(245, 250, 255));
        infoPanel.setBorder(new CompoundBorder(
                new LineBorder(new Color(10, 90, 129), 2, true),
                new EmptyBorder(15, 15, 15, 15)
        ));

        JLabel lblTitulo = new JLabel("Sobre mim");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblNome = new JLabel("Nome: Isadora Goedert");
        JLabel lblIdade = new JLabel("Idade: 19 anos");
        JLabel lblCurso = new JLabel("Formação: Estudante de Design Gráfico – Univille");
        JLabel lblHobbies = new JLabel("Áreas de interesse: Pintura, ilustração e colagem artística");
        JLabel lblDestaque = new JLabel("Apaixonada por arte e inspiração criativa no dia a dia");
        JLabel lblExtra = new JLabel("Admiradora da música brasileira e da minha gata Ritinha");

        Font textoNormal = new Font("Segoe UI", Font.PLAIN, 13);
        lblNome.setFont(textoNormal);
        lblIdade.setFont(textoNormal);
        lblCurso.setFont(textoNormal);
        lblHobbies.setFont(textoNormal);
        lblDestaque.setFont(textoNormal);
        lblExtra.setFont(textoNormal);

        JLabel lblRitinha = criarFotoComEstilo("/Image/copy/ritinha.jpg", 120, 120);

        JButton btnExit = new JButton("Sair");
        btnExit.setBackground(new Color(11, 101, 145));
        btnExit.setForeground(Color.WHITE);
        btnExit.setFocusPainted(false);
        btnExit.setBorder(new RoundedBorder(10));
        btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnExit.addActionListener(e -> dispose());
        btnExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnExit.setBackground(new Color(20, 140, 200));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnExit.setBackground(new Color(11, 101, 145));
            }
        });

        GroupLayout infoLayout = new GroupLayout(infoPanel);
        infoLayout.setHorizontalGroup(
        	infoLayout.createParallelGroup(Alignment.CENTER)
        		.addGroup(infoLayout.createSequentialGroup()
        			.addGroup(infoLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblTitulo)
        				.addComponent(lblIdade)
        				.addComponent(lblCurso)
        				.addComponent(lblDestaque)
        				.addComponent(lblExtra)
        				.addGroup(infoLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblNome))
        				.addGroup(infoLayout.createSequentialGroup()
        					.addGap(126)
        					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        				.addGroup(infoLayout.createSequentialGroup()
        					.addGap(118)
        					.addComponent(label))
        				.addGroup(infoLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblHobbies)))
        			.addContainerGap(27, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
        	infoLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(infoLayout.createSequentialGroup()
        			.addComponent(lblTitulo)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNome)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblIdade)
        			.addComponent(lblCurso)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblHobbies)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblDestaque)
        			.addComponent(lblExtra)
        			.addGap(7)
        			.addComponent(label)
        			.addGap(18)
        			.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        infoPanel.setLayout(infoLayout);
        infoLayout.setAutoCreateGaps(true);
        infoLayout.setAutoCreateContainerGaps(true);


        GroupLayout mainLayout = new GroupLayout(contentPanel);
        contentPanel.setLayout(mainLayout);
        mainLayout.setAutoCreateGaps(true);
        mainLayout.setAutoCreateContainerGaps(true);
        mainLayout.setHorizontalGroup(
            mainLayout.createSequentialGroup()
                .addComponent(lblHelloKitty, 250, 250, 300)
                .addComponent(infoPanel)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(lblHelloKitty, 250, 250, 300)
                .addComponent(infoPanel)
        );
    }

    private JLabel criarFotoComEstilo(String caminho, int largura, int altura) {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(caminho));
        Image img = originalIcon.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        label = new JLabel(new ImageIcon(img));
        label.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 2, true),
            BorderFactory.createEmptyBorder(3, 3, 3, 3)
        ));
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        return label;
    }

    static class RoundedBorder implements Border {
        private int radius;
        RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
}
