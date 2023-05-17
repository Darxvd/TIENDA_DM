package interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class gui_busc_cliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			gui_busc_cliente dialog = new gui_busc_cliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public gui_busc_cliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\clientes.png"));
		setTitle("Buscar cliente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(253, 245, 230));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("BUSCAR CLIENTE");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBackground(new Color(0, 0, 0));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(0, 0, 434, 32);
			lblNewLabel.setOpaque(true);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("DNI");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_1.setBounds(20, 43, 41, 26);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setBounds(61, 43, 144, 26);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			btnNewButton = new JButton("Buscar");
			btnNewButton.setBackground(new Color(0, 0, 0));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBounds(277, 43, 125, 26);
			contentPanel.add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 91, 414, 159);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Codigo", "DNI", "Cliente"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
	}
}
