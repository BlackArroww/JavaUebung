import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import java.awt.SystemColor;

public class JFrame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame1 frame = new JFrame1();
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
	public JFrame1() {
		setTitle("Die beste GUI 1890");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 566);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 11, 868, 505);
		contentPane.add(tabbedPane);
		
		JPanel Standart = new JPanel();
		tabbedPane.addTab("Standart", null, Standart, null);
		Standart.setLayout(null);
		
		JLabel lblWieFindestDu = new JLabel("Wie findest du diese Oberfl\u00E4che?");
		lblWieFindestDu.setBounds(336, 101, 214, 24);
		Standart.add(lblWieFindestDu);
		
		JRadioButton rdbtnSehrGut = new JRadioButton("Sehr Gut");
		rdbtnSehrGut.setBounds(336, 132, 109, 23);
		Standart.add(rdbtnSehrGut);
		
		JRadioButton rdbtnSehrGut_1 = new JRadioButton("Sehr Gut");
		rdbtnSehrGut_1.setBounds(336, 151, 109, 23);
		Standart.add(rdbtnSehrGut_1);
		
		JRadioButton rdbtnBeste = new JRadioButton("Beste GUI EVA");
		rdbtnBeste.setBounds(336, 170, 109, 23);
		Standart.add(rdbtnBeste);
		
		JLabel lblWieGehtsDir = new JLabel("Wie gehts dir?");
		lblWieGehtsDir.setBounds(336, 329, 86, 14);
		Standart.add(lblWieGehtsDir);
		
		textField = new JTextField();
		textField.setBounds(336, 348, 166, 30);
		Standart.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(336, 252, 131, 22);
		Standart.add(comboBox);
		
		JLabel lblWhleDeineLieblingsfarbe = new JLabel("W\u00E4hle deine Lieblingsfarbe aus:");
		lblWhleDeineLieblingsfarbe.setBounds(336, 223, 214, 14);
		Standart.add(lblWhleDeineLieblingsfarbe);
		JPanel TabDasZweite = new JPanel();
		TabDasZweite.setLayout(null);
		tabbedPane.addTab("Anpassung", null, TabDasZweite, null);
		
		JRadioButton rdbtnBlau = new JRadioButton("Blau");
		rdbtnBlau.setBounds(25, 34, 109, 23);
		TabDasZweite.add(rdbtnBlau);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(25, 438, 89, 23);
		TabDasZweite.add(btnNewButton);
		
		JPanel Notizen = new JPanel();
		Notizen.setBackground(Color.WHITE);
		tabbedPane.addTab("Notizen", null, Notizen, null);
		Notizen.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hier ist Platz f\u00FCr deine Notizen");
		lblNewLabel.setBounds(10, 0, 331, 22);
		Notizen.add(lblNewLabel);
		
		JTextArea txtrNotizen = new JTextArea();
		txtrNotizen.setBackground(SystemColor.controlHighlight);
		txtrNotizen.setBounds(10, 33, 848, 439);
		Notizen.add(txtrNotizen);
	}
}
