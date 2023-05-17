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
import javax.swing.SwingConstants;
import java.awt.Color;

public class gui_man_producto extends JInternalFrame {
	private JLabel lblMantenimientoProductos;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JComboBox comboBox_1;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_man_producto frame = new gui_man_producto();
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
	public gui_man_producto() {
		setFrameIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\producto.png"));
		setClosable(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Mantenimiento Productos");
		setBounds(100, 100, 545, 430);
		getContentPane().setBackground(new Color(253, 245, 230));
		getContentPane().setLayout(null);
		{
			lblMantenimientoProductos = new JLabel("Mantenimiento Productos");
			lblMantenimientoProductos.setForeground(new Color(255, 255, 255));
			lblMantenimientoProductos.setBackground(new Color(0, 0, 0));
			lblMantenimientoProductos.setHorizontalAlignment(SwingConstants.CENTER);
			lblMantenimientoProductos.setOpaque(true);
			lblMantenimientoProductos.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblMantenimientoProductos.setBounds(0, 0, 529, 37);
			getContentPane().add(lblMantenimientoProductos);
		}
		{
			lblNewLabel = new JLabel("Codigo:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(30, 63, 57, 21);
			getContentPane().add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(89, 64, 102, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Tipo:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(30, 122, 57, 21);
			getContentPane().add(lblNewLabel_1);
		}
		{
			comboBox = new JComboBox();
			comboBox.setBounds(89, 122, 102, 21);
			getContentPane().add(comboBox);
		}
		{
			lblNewLabel_2 = new JLabel("Cantidad:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(201, 122, 57, 21);
			getContentPane().add(lblNewLabel_2);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(268, 123, 66, 20);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblNewLabel_3 = new JLabel("Descripcion:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(30, 95, 79, 21);
			getContentPane().add(lblNewLabel_3);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(119, 95, 215, 20);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("Precio:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_4.setBounds(201, 153, 57, 21);
			getContentPane().add(lblNewLabel_4);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(255, 154, 79, 20);
			getContentPane().add(textField_3);
			textField_3.setColumns(10);
		}
		{
			lblNewLabel_5 = new JLabel("Marca:");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_5.setBounds(30, 154, 66, 21);
			getContentPane().add(lblNewLabel_5);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(89, 154, 102, 20);
			getContentPane().add(textField_4);
			textField_4.setColumns(10);
		}
		{
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Registrar", "Modificar", "Eliminar", "Buscar"}));
			comboBox_1.setBounds(356, 63, 146, 21);
			getContentPane().add(comboBox_1);
		}
		{
			btnNewButton = new JButton("Limpiar");
			btnNewButton.setBounds(356, 122, 146, 23);
			getContentPane().add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(30, 196, 468, 193);
			getContentPane().add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo", "Descripcion", "Tipo", "Cantidad", "Marca", "Precio"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
		{
			btnNewButton_1 = new JButton("OK");
			btnNewButton_1.setBounds(356, 153, 57, 23);
			getContentPane().add(btnNewButton_1);
		}

	}
}
