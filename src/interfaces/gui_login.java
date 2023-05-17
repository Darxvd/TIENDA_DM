package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui_login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JLabel lblErrorUsuario;
	private JLabel lblErrorContraseña;
	private JTextField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_login frame = new gui_login();
					frame.setLocationRelativeTo(null);
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
	public gui_login() {
		setResizable(false);
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\tienda.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 320);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(250, 250, 210));
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 11, 284, 45);
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(42, 81, 63, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(42, 145, 81, 24);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsuario.setBounds(133, 76, 139, 32);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblErrorUsuario = new JLabel("");
		lblErrorUsuario.setForeground(new Color(128, 0, 0));
		lblErrorUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErrorUsuario.setBounds(133, 107, 139, 20);
		contentPane.add(lblErrorUsuario);
		
		lblErrorContraseña = new JLabel("");
		lblErrorContraseña.setForeground(new Color(128, 0, 0));
		lblErrorContraseña.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErrorContraseña.setBounds(133, 170, 139, 20);
		contentPane.add(lblErrorContraseña);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnIngresar(e);
			}
		});
		btnIngresar.setForeground(new Color(255, 255, 255));
		btnIngresar.setBackground(new Color(0, 0, 0));
		btnIngresar.setFont(new Font("Arial", Font.BOLD, 16));
		btnIngresar.setBounds(59, 205, 162, 38);
		contentPane.add(btnIngresar);
		
		JLabel lblNewLabel_5 = new JLabel("Olvide mi contraseña");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(79, 246, 123, 24);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\usua_login.png"));
		lblNewLabel_6.setBounds(10, 74, 24, 32);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\contra_login.png"));
		lblNewLabel_6_1.setBounds(10, 138, 24, 32);
		contentPane.add(lblNewLabel_6_1);
		{
			txtContraseña = new JTextField();
			txtContraseña.setBounds(133, 138, 139, 31);
			contentPane.add(txtContraseña);
			txtContraseña.setColumns(10);
		}
	}
	//Restricciones
	void expresiones() {
		String usuario = txtUsuario.getText().trim();
		String clave = txtContraseña.getText().trim();
		
			if(usuario.matches("^\\d{5}$") && usuario.length() > 0) {
				lblErrorUsuario.setForeground(Color.GREEN);
				lblErrorUsuario.setText("Usuario Correcto");
			}
			else {
				lblErrorUsuario.setForeground(Color.RED);
				lblErrorUsuario.setText("Usuario incorrecto");
			}
			if(clave.matches("^\\d{8}[A-Za-z]{2}$") && clave.length() > 0) {
				lblErrorContraseña.setForeground(Color.GREEN);
				lblErrorContraseña.setText("Usuario Correcto");
			}
			else {
				lblErrorContraseña.setForeground(Color.RED);
				lblErrorContraseña.setText("Contraseña incorrecta");
			}
		}

	
	
	
	//Botono Ingresar
	protected void actionPerformedBtnIngresar(ActionEvent e) {
		expresiones();
	}
}
