package interfaces;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class gui_man_cliente extends JInternalFrame {
	private JLabel lblMantenimientoClientes;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JButton btnNewButton_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_man_cliente frame = new gui_man_cliente();
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
	public gui_man_cliente() {
		setFrameIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\clientes.png"));
		setResizable(true);
		getContentPane().setBackground(new Color(253, 245, 230));
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Mantenimiento Clientes");
		setClosable(true);
		setResizable(false);
		setBounds(100, 100, 545, 430);
		{
			lblMantenimientoClientes = new JLabel("Mantenimiento Clientes");
			lblMantenimientoClientes.setForeground(new Color(255, 255, 255));
			lblMantenimientoClientes.setBackground(new Color(0, 0, 0));
			lblMantenimientoClientes.setHorizontalAlignment(SwingConstants.CENTER);
			lblMantenimientoClientes.setOpaque(true);
			lblMantenimientoClientes.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblMantenimientoClientes.setBounds(0, 0, 529, 35);
			getContentPane().add(lblMantenimientoClientes);
		}
		{
			lblNewLabel = new JLabel("Codigo:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(27, 67, 57, 24);
			getContentPane().add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setEnabled(false);
			textField.setBounds(94, 70, 101, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Dni:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(27, 98, 49, 24);
			getContentPane().add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(94, 101, 101, 20);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Ruc:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(205, 104, 46, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(243, 101, 119, 20);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}
		{
			lblNewLabel_3 = new JLabel("Cliente:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(27, 135, 46, 14);
			getContentPane().add(lblNewLabel_3);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(94, 133, 268, 20);
			getContentPane().add(textField_3);
			textField_3.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("Razón Social:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_4.setBounds(27, 162, 88, 14);
			getContentPane().add(lblNewLabel_4);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(121, 160, 181, 20);
			getContentPane().add(textField_4);
			textField_4.setColumns(10);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Registrar", "Modificar", "Eliminar", "Buscar"}));
			comboBox.setBounds(390, 65, 119, 24);
			getContentPane().add(comboBox);
		}
		{
			btnNewButton = new JButton("Limpiar");
			btnNewButton.setBounds(390, 132, 119, 23);
			getContentPane().add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 197, 231, 192);
			getContentPane().add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo", "Dni", "Cliente"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(268, 197, 231, 192);
			getContentPane().add(scrollPane_1);
			{
				table_1 = new JTable();
				table_1.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo", "Ruc", "Raz. Social"
					}
				));
				scrollPane_1.setViewportView(table_1);
			}
		}
		{
			btnNewButton_1 = new JButton("OK");
			btnNewButton_1.setBounds(312, 159, 51, 23);
			getContentPane().add(btnNewButton_1);
		}
		{
			rdbtnNewRadioButton = new JRadioButton("DNI");
			rdbtnNewRadioButton.setBounds(205, 69, 57, 23);
			getContentPane().add(rdbtnNewRadioButton);
		}
		{
			rdbtnNewRadioButton_1 = new JRadioButton("RUC");
			rdbtnNewRadioButton_1.setBounds(275, 69, 88, 23);
			getContentPane().add(rdbtnNewRadioButton_1);
		}

	}
}
