package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class gui_menu extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private gui_man_empleado empleado = new gui_man_empleado();
	private gui_man_cliente cliente = new gui_man_cliente();
	private gui_man_producto producto = new gui_man_producto();
	private gui_boleta boleta = new gui_boleta();
	private gui_factura factura = new gui_factura();
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_menu frame = new gui_menu();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui_menu() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				windowClosingThis(e);
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\tienda.png"));
		setTitle("Menú Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 483);
	
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Salir");
		mnNewMenu.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\salida.png"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salir");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmNewMenuItem_2(e);
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\boton.png"));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		mnNewMenu_1.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\registro-en-linea.png"));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mnEmpleado = new JMenuItem("Empleados");
		mnEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMnEmpleado(e);
			}
		});
		mnEmpleado.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\empleados.png"));
		mnNewMenu_1.add(mnEmpleado);
		{
			mntmNewMenuItem = new JMenuItem("Clientes");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedMntmNewMenuItem(e);
				}
			});
			mntmNewMenuItem.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\clientes.png"));
			mnNewMenu_1.add(mntmNewMenuItem);
		}
		{
			mntmNewMenuItem_1 = new JMenuItem("Productos");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedMntmNewMenuItem_1(e);
				}
			});
			mntmNewMenuItem_1.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\producto.png"));
			mnNewMenu_1.add(mntmNewMenuItem_1);
		}
		
		JMenu mnNewMenu_5 = new JMenu("Ventas");
		mnNewMenu_5.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\punto-de-venta.png"));
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Boleta");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmNewMenuItem_4(e);
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\factura (2).png"));
		mnNewMenu_5.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Factura");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmNewMenuItem_5(e);
			}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\factura (1).png"));
		mnNewMenu_5.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_4 = new JMenu("Inventario");
		mnNewMenu_4.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\inventario.png"));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Control");
		mntmNewMenuItem_3.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\panel-de-administrador.png"));
		mnNewMenu_4.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_6 = new JMenu("Archivo");
		mnNewMenu_6.setIcon(new ImageIcon("D:\\JAVA\\JAVA DESKTOP\\PROYECTO_D_Y_T\\imagenes\\gracias.png"));
		menuBar.add(mnNewMenu_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		empleado.setLocation(58, 53);
		desktopPane.add(empleado);
		desktopPane.add(cliente);
		desktopPane.add(producto);
		desktopPane.add(boleta);
		desktopPane.add(factura);
		
	}
	//Accion si quieres salir
	protected void windowClosingThis(WindowEvent e) {
		
	}
	//Salir
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
		System.exit(0);
	}
	//Mantenimiento empleados
	protected void actionPerformedMnEmpleado(ActionEvent e) {
		empleado.setVisible(true);
	}
	//Mantenimiento clientes
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
		cliente.setVisible(true);
	}
	//Mantenimiento productos
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
		producto.setVisible(true);
	}
	//Venta boleta
	protected void actionPerformedMntmNewMenuItem_4(ActionEvent e) {
		boleta.setVisible(true);
	}
	//Factura
	protected void actionPerformedMntmNewMenuItem_5(ActionEvent e) {
		factura.setVisible(true);
	}
}
