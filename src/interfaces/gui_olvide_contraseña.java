package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class gui_olvide_contraseña extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JLabel lblNewLabel_5;
	private JTextField textField_1;
	private JLabel lblNewLabel_6;
	private JTextField textField_2;
	private JLabel lblNewLabel_7;
	private JTextField textField_3;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_olvide_contraseña frame = new gui_olvide_contraseña();
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
	public gui_olvide_contraseña() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\se-te-olvido-tu-contrasena.png"));
		setTitle("Olvidaste tu contraseña");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("CAMBIO DE CONTRASEÑA");
			lblNewLabel.setBackground(new Color(0, 0, 0));
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(0, 0, 315, 35);
			lblNewLabel.setOpaque(true);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Estimado @Usuario está apunto de cambiar su contraseña,");
			lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel_1.setToolTipText("");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1.setBounds(10, 46, 295, 21);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("no olvidar que para el correcto cambio de su contraseña,");
			lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel_2.setToolTipText("");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_2.setBounds(10, 56, 295, 21);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("deberá ingresar su codigo y dni correspondiente.");
			lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel_3.setToolTipText("");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_3.setBounds(10, 67, 295, 21);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Codigo");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_4.setBounds(10, 91, 67, 21);
			contentPane.add(lblNewLabel_4);
		}
		{
			textField = new JTextField();
			textField.setBounds(64, 92, 86, 20);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			lblNewLabel_5 = new JLabel("DNI");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_5.setBounds(10, 123, 67, 21);
			contentPane.add(lblNewLabel_5);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(64, 123, 86, 20);
			contentPane.add(textField_1);
		}
		{
			lblNewLabel_6 = new JLabel("Nueva Contraseña");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_6.setBounds(10, 155, 125, 21);
			contentPane.add(lblNewLabel_6);
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(145, 156, 125, 20);
			contentPane.add(textField_2);
		}
		{
			lblNewLabel_7 = new JLabel("Repetir Contraseña");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_7.setBounds(10, 181, 140, 21);
			contentPane.add(lblNewLabel_7);
		}
		{
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(145, 182, 125, 20);
			contentPane.add(textField_3);
		}
		{
			btnNewButton = new JButton("Guardar");
			btnNewButton.setBackground(new Color(0, 0, 0));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton.setBounds(46, 223, 205, 41);
			contentPane.add(btnNewButton);
		}
	}

}
