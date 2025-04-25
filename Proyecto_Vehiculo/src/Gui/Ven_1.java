package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JTextArea;
import java.awt.SystemColor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ven_1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_2;
	private JComboBox cmbTipo;
	private JLabel lblDatosDelVehculo;
	private JTextField txtPlaca;
	private JLabel lblNewLabel_4;
	private JLabel lblEncargado;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtDni;
	private JComboBox cmbAreaL;
	private JButton btnNewButton;
	private JButton btnRegistrarSalida;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JScrollPane scrollPane_1;
	private JTextArea txtS1;
	private JLabel lblNombre;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ven_1 frame = new Ven_1();
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
	public Ven_1() {
		setTitle("Registro de Vehículos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 513);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel_2 = new JLabel("Tipo :");
			lblNewLabel_2.setBounds(19, 106, 58, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			cmbTipo = new JComboBox();
			cmbTipo.setBounds(118, 102, 122, 22);
			cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"Automóvil", "Bicicleta", "Camión", "Scooter electrico", "Moto"}));
			contentPane.add(cmbTipo);
		}
		{
			lblDatosDelVehculo = new JLabel("DATOS DEL VEHÍCULO");
			lblDatosDelVehculo.setBounds(19, 10, 175, 27);
			lblDatosDelVehculo.setFont(new Font("Sitka Small", Font.PLAIN, 15));
			contentPane.add(lblDatosDelVehculo);
		}
		{
			txtPlaca = new JTextField();
			txtPlaca.setBounds(117, 45, 123, 20);
			txtPlaca.setColumns(10);
			contentPane.add(txtPlaca);
		}
		{
			lblNewLabel_4 = new JLabel("Placa : ");
			lblNewLabel_4.setBounds(19, 48, 48, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			lblEncargado = new JLabel("DATOS DEL CONDUCTOR");
			lblEncargado.setBounds(337, 10, 189, 27);
			lblEncargado.setFont(new Font("Sitka Small", Font.PLAIN, 15));
			contentPane.add(lblEncargado);
		}
		{
			lblNewLabel = new JLabel("DNI  : ");
			lblNewLabel.setBounds(337, 71, 50, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Area Laboral  : ");
			lblNewLabel_1.setBounds(337, 106, 76, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtDni = new JTextField();
			txtDni.setBounds(430, 68, 128, 20);
			txtDni.setColumns(10);
			contentPane.add(txtDni);
		}
		{
			cmbAreaL = new JComboBox();
			cmbAreaL.setBounds(430, 102, 128, 22);
			cmbAreaL.setModel(new DefaultComboBoxModel(new String[] {"Área de seguridad", "Logística y Operaciones", "Visitante", "Proveedor", "Recursos Humanos", "Administración", "Área de Sistemas"}));
			contentPane.add(cmbAreaL);
		}
		{
			btnNewButton = new JButton("REGISTRAR ENTRADA");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(19, 158, 221, 54);
			contentPane.add(btnNewButton);
		}
		{
			btnRegistrarSalida = new JButton("REGISTRAR SALIDA");
			btnRegistrarSalida.setBounds(337, 158, 221, 54);
			contentPane.add(btnRegistrarSalida);
		}
		{
			lblNewLabel_3 = new JLabel("LISTA DE ENTRADA");
			lblNewLabel_3.setBounds(19, 254, 122, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_5 = new JLabel("LISTA DE SALIDA");
			lblNewLabel_5.setBounds(349, 254, 122, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 280, 203, 183);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(349, 279, 209, 184);
			contentPane.add(scrollPane_1);
			{
				txtS1 = new JTextArea();
				scrollPane_1.setViewportView(txtS1);
			}
		}
		{
			lblNombre = new JLabel("Nombre  : ");
			lblNombre.setBounds(337, 48, 76, 14);
			contentPane.add(lblNombre);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(430, 45, 128, 20);
			txtNombre.setColumns(10);
			contentPane.add(txtNombre);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) { // Boton Registrar
		
		
		
	}
	String LeerNombre() {return txtNombre.getText();}
	String LeerPlaca() {return txtPlaca.getText();}
	String LeerDni() {return txtDni.getText();}
	String LeerTipo() {return cmbTipo.getSelectedItem().toString();}
	String LeerAreaL() {return cmbAreaL.getSelectedItem().toString();}
	}
