package interfaces;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import arreglos.arrEmpleado;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class gui_man_empleado extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_7;
	private JTextField textField_6;
	private JLabel lblNewLabel_8;
	private JComboBox comboBox_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_9;
	private JTextField textField_7;
	
	//Atributos
	private arrEmpleado objP;
	private ArrayList<P>

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_man_empleado frame = new gui_man_empleado();
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
	public gui_man_empleado() {
		setFrameIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\empleados.png"));
		setResizable(true);
		getContentPane().setBackground(new Color(253, 245, 230));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Mantenimiento Empleados");
		setClosable(true);
		setResizable(false);
		setBounds(100, 100, 545, 471);
		getContentPane().setLayout(null);
		{
			lblNewLabel = new JLabel("Mantenimiento Empleados");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBackground(new Color(0, 0, 0));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setOpaque(true);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(0, 0, 529, 34);
			getContentPane().add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Codigo:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(28, 63, 60, 23);
			getContentPane().add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setEditable(false);
			textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
			textField.setBounds(98, 65, 60, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Nombres:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(28, 97, 60, 23);
			getContentPane().add(lblNewLabel_2);
		}
		{
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			textField_1.setBounds(98, 98, 216, 20);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblNewLabel_3 = new JLabel("Apellidos:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(28, 131, 60, 23);
			getContentPane().add(lblNewLabel_3);
		}
		{
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			textField_2.setBounds(98, 133, 216, 20);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("F. Nacimiento:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_4.setBounds(28, 164, 93, 23);
			getContentPane().add(lblNewLabel_4);
		}
		{
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			textField_3.setBounds(120, 164, 95, 20);
			getContentPane().add(textField_3);
			textField_3.setColumns(10);
		}
		{
			lblNewLabel_5 = new JLabel("Edad:");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_5.setBounds(225, 168, 39, 14);
			getContentPane().add(lblNewLabel_5);
		}
		{
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			textField_4.setBounds(265, 164, 49, 20);
			getContentPane().add(textField_4);
			textField_4.setColumns(10);
		}
		{
			lblNewLabel_6 = new JLabel("Direccion:");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_6.setBounds(29, 198, 86, 20);
			getContentPane().add(lblNewLabel_6);
		}
		{
			textField_5 = new JTextField();
			textField_5.setBounds(98, 199, 216, 20);
			getContentPane().add(textField_5);
			textField_5.setColumns(10);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Registrar", "Modificar", "Eliminar", "Buscar"}));
			comboBox.setBounds(369, 64, 128, 22);
			getContentPane().add(comboBox);
		}
		{
			btnNewButton = new JButton("Limpiar");
			btnNewButton.setBounds(369, 132, 128, 23);
			getContentPane().add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 284, 466, 146);
			getContentPane().add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"Codigo", "Nombres", "Apellidos", "F. Nacimiento", "Edad"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
		{
			lblNewLabel_7 = new JLabel("Dni:");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_7.setBounds(168, 63, 31, 23);
			getContentPane().add(lblNewLabel_7);
		}
		{
			textField_6 = new JTextField();
			textField_6.setBounds(209, 65, 105, 20);
			getContentPane().add(textField_6);
			textField_6.setColumns(10);
		}
		{
			lblNewLabel_8 = new JLabel("Cargo:");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_8.setBounds(29, 229, 60, 23);
			getContentPane().add(lblNewLabel_8);
		}
		{
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(98, 229, 128, 23);
			getContentPane().add(comboBox_1);
		}
		{
			btnNewButton_1 = new JButton("OK");
			btnNewButton_1.setBounds(236, 230, 79, 23);
			getContentPane().add(btnNewButton_1);
		}
		{
			lblNewLabel_9 = new JLabel("Contraseña");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_9.setBounds(28, 261, 79, 23);
			getContentPane().add(lblNewLabel_9);
		}
		{
			textField_7 = new JTextField();
			textField_7.setBounds(98, 263, 128, 20);
			getContentPane().add(textField_7);
			textField_7.setColumns(10);
		}

	}
}
