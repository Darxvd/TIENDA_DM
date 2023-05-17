package interfaces;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui_factura extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_1;
	private JLabel lblNewLabel_4;
	private JTextField textField_2;
	private JSeparator separator_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_3;
	private JLabel lblNewLabel_7;
	private JTextField textField_4;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_8;
	private JTextField textField_5;
	private JLabel lblNewLabel_9;
	private JTextField textField_6;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private gui_busc_empresa empresa = new gui_busc_empresa();
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JTextField textField_9;
	private JTextField textField_8;
	private JLabel lblNewLabel_10;
	private JTextField textField_7;
	private JLabel lblNewLabel_13;
	private JTextField textField_10;
	private JLabel lblNewLabel_14;
	private JTextField textField_11;
	private JLabel lblNewLabel_15;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_factura frame = new gui_factura();
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
	public gui_factura() {
		getContentPane().setBackground(new Color(253, 245, 230));
		setFrameIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\factura (1).png"));
		setTitle("Factura");
		setClosable(true);
		setBounds(100, 100, 515, 524);
		getContentPane().setLayout(null);
		{
			lblNewLabel = new JLabel("Factura");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBackground(new Color(0, 0, 0));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBounds(0, 0, 499, 39);
			getContentPane().add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("N° Boleta");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_1.setBounds(10, 50, 62, 24);
			getContentPane().add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(82, 53, 117, 20);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Datos de la Empresa");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_2.setBounds(10, 85, 156, 24);
			getContentPane().add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("RUC");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(20, 111, 29, 24);
			getContentPane().add(lblNewLabel_3);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(71, 114, 150, 20);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("Rz. Social");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_4.setBounds(20, 140, 73, 24);
			getContentPane().add(lblNewLabel_4);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(82, 143, 377, 20);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}
		{
			btnNewButton = new JButton("Buscar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnNewButton(e);
				}
			});
			btnNewButton.setBounds(369, 111, 89, 23);
			getContentPane().add(btnNewButton);
		}
		{
			lblNewLabel_5 = new JLabel("Datos del Producto");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_5.setBounds(10, 175, 156, 29);
			getContentPane().add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("Cajero");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_6.setBounds(261, 50, 62, 24);
			getContentPane().add(lblNewLabel_6);
		}
		{
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(320, 53, 117, 20);
			getContentPane().add(textField_3);
		}
		{
			lblNewLabel_7 = new JLabel("Producto");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_7.setBounds(20, 204, 73, 24);
			getContentPane().add(lblNewLabel_7);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(92, 207, 261, 20);
			getContentPane().add(textField_4);
			textField_4.setColumns(10);
		}
		{
			btnNewButton_1 = new JButton("Buscar");
			btnNewButton_1.setBounds(369, 206, 89, 23);
			getContentPane().add(btnNewButton_1);
		}
		{
			lblNewLabel_8 = new JLabel("Precio");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_8.setBounds(20, 230, 62, 24);
			getContentPane().add(lblNewLabel_8);
		}
		{
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setBounds(92, 233, 86, 20);
			getContentPane().add(textField_5);
			textField_5.setColumns(10);
		}
		{
			lblNewLabel_9 = new JLabel("Cantidad");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_9.setBounds(195, 230, 62, 24);
			getContentPane().add(lblNewLabel_9);
		}
		{
			textField_6 = new JTextField();
			textField_6.setBounds(267, 233, 86, 20);
			getContentPane().add(textField_6);
			textField_6.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(21, 265, 332, 112);
			getContentPane().add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo", "Producto", "Precio", "Cantidad"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
		{
			btnNewButton_2 = new JButton("Pagar");
			btnNewButton_2.setBounds(385, 410, 73, 33);
			getContentPane().add(btnNewButton_2);
		}
		{
			btnNewButton_3 = new JButton("Limpiar");
			btnNewButton_3.setBounds(369, 245, 89, 23);
			getContentPane().add(btnNewButton_3);
		}
		{
			btnNewButton_4 = new JButton("Agregar");
			btnNewButton_4.setBounds(369, 302, 89, 44);
			getContentPane().add(btnNewButton_4);
		}
		{
			separator = new JSeparator();
			separator.setBounds(10, 83, 479, 102);
			getContentPane().add(separator);
		}
		{
			lblNewLabel_11 = new JLabel("Valor Bruto");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_11.setBounds(20, 378, 80, 24);
			getContentPane().add(lblNewLabel_11);
		}
		{
			lblNewLabel_12 = new JLabel("Descuento");
			lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_12.setBounds(195, 378, 80, 24);
			getContentPane().add(lblNewLabel_12);
		}
		{
			textField_9 = new JTextField();
			textField_9.setEditable(false);
			textField_9.setColumns(10);
			textField_9.setBounds(268, 382, 86, 20);
			getContentPane().add(textField_9);
		}
		{
			separator_1 = new JSeparator();
			separator_1.setBounds(10, 175, 479, 7);
			getContentPane().add(separator_1);
		}
		{
			textField_8 = new JTextField();
			textField_8.setEditable(false);
			textField_8.setColumns(10);
			textField_8.setBounds(100, 382, 86, 20);
			getContentPane().add(textField_8);
		}
		{
			lblNewLabel_10 = new JLabel("OP. Gravada");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_10.setBounds(20, 413, 80, 24);
			getContentPane().add(lblNewLabel_10);
		}
		{
			textField_7 = new JTextField();
			textField_7.setEditable(false);
			textField_7.setColumns(10);
			textField_7.setBounds(100, 416, 86, 20);
			getContentPane().add(textField_7);
		}
		{
			lblNewLabel_13 = new JLabel("Redondeo");
			lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_13.setBounds(195, 413, 80, 24);
			getContentPane().add(lblNewLabel_13);
		}
		{
			textField_10 = new JTextField();
			textField_10.setEditable(false);
			textField_10.setColumns(10);
			textField_10.setBounds(267, 416, 86, 20);
			getContentPane().add(textField_10);
		}
		{
			lblNewLabel_14 = new JLabel("IGV");
			lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_14.setBounds(20, 448, 80, 24);
			getContentPane().add(lblNewLabel_14);
		}
		{
			textField_11 = new JTextField();
			textField_11.setEditable(false);
			textField_11.setColumns(10);
			textField_11.setBounds(100, 451, 86, 20);
			getContentPane().add(textField_11);
		}
		{
			lblNewLabel_15 = new JLabel("Total Pagar");
			lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_15.setBounds(195, 448, 80, 24);
			getContentPane().add(lblNewLabel_15);
		}
		{
			textField_12 = new JTextField();
			textField_12.setEditable(false);
			textField_12.setColumns(10);
			textField_12.setBounds(267, 451, 86, 20);
			getContentPane().add(textField_12);
		}

	}
	//Buscar cliente
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		empresa.setVisible(true);
	}
}
