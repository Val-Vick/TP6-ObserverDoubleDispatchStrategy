package Poo2.tp6.Observer.p4.UI;

import Poo2.tp6.Observer.p4.modelo.Participante;
import Poo2.tp6.Observer.p4.modelo.ParticipanteRepositorio;
import Poo2.tp6.Observer.p4.modelo.InscripcionService;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Vista extends JFrame {
	private JTextField nombre;
	private JTextField telefono;
	private JTextField region;
//	private ParticipanteRepositorio repositorio;
	private JTextField email;
	private InscripcionService service;

//	public Vista(ParticipanteRepositorio repositorio){
//		this.repositorio = repositorio;
//		setupUIComponents();
//	}

	public Vista(InscripcionService service){
		this.service = service;
		setupUIComponents();
	}

	private void setupUIComponents() {
		setTitle("Add Participant");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.nombre = new JTextField(10);
		this.telefono = new JTextField(10);
		this.region = new JTextField(10);
		this.email = new JTextField(15);

		this.nombre.setText("");
		this.telefono.setText("");
		this.region.setText("China");
		this.email.setText("");

		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JLabel("Nombre: "));
		contentPane.add(nombre);
		contentPane.add(new JLabel("Telefono: "));
		contentPane.add(telefono);
		contentPane.add(new JLabel("Region: "));
		contentPane.add(region);
		contentPane.add(new JLabel("Email: ")); // <-- Agregado
		contentPane.add(email);

		JButton botonCargar = new JButton("Cargar");
		botonCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onBotonCargar();
			}
		});
		contentPane.add(botonCargar);
		setContentPane(contentPane);
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pack();
		setVisible(true);
	}

	private void onBotonCargar() {
		try {
			this.service.registrarParticipante(
					nombre.getText(),
					telefono.getText(),
					region.getText(),
					email.getText()
			);

			dispose();

		} catch (RuntimeException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}
}
