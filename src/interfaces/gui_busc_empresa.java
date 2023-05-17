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

public class gui_busc_empresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
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
			gui_busc_empresa dialog = new gui_busc_empresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public gui_busc_empresa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\clientes.png"));
		setTitle("Buscar empresa");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("BUSCAR EMPRESA");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBackground(new Color(0, 0, 0));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(0, 0, 434, 30);
			lblNewLabel.setOpaque(true);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("RUC");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_1.setBounds(22, 41, 44, 22);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setBounds(64, 41, 147, 22);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			btnNewButton = new JButton("Buscar");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(0, 0, 0));
			btnNewButton.setBounds(278, 41, 127, 22);
			contentPanel.add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 80, 414, 170);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"RUC", "Empresa"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
	}

}
