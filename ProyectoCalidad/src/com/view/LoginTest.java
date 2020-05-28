package com.view;

import static org.junit.Assert.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.junit.Test;
import com.dataconection.DataConnectionUser;

public class LoginTest {
	
	private JPanel contentPane;
			public static JTextField txt_usuario;
			public static JPasswordField txt_contraseña;
			final paginaPrincipal paginaPrincipal = new paginaPrincipal();
	@Test
	public void testLogin() {
	
			/**
			 * frame.
			 */
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(3, 3, 3, 3));
			
	
				JLabel lblNombre = new JLabel("Usuario:");
				lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
				
				JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
				lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));

				JButton btnEntrar = new JButton("Entrar");
				btnEntrar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						try {
						PreparedStatement ps = DataConnectionUser.con.prepareStatement("Select * from Usuario where Nombre='"+txt_usuario.getText()+"'and Contraseña='"+txt_contraseña.getText()+"'");
						ResultSet rs = ps.executeQuery();
						if(rs.next()){
							JOptionPane.showMessageDialog(null, "!!Bienvenido!!");
							paginaPrincipal.setVisible(true);
							dispose();
							}
						}
						catch (Exception login) {
							System.out.println(e);
						}
					}
				});
													
			}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testLoginfallida() {
	
			/**
			 * Create the frame.
			 */
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(3, 3, 3, 3));
			
				
				JLabel lblNombre = new JLabel("Usuario:");
				lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
				
			
				
				JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
				lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
				
				
				JButton btnEntrar = new JButton("Entrar");
				btnEntrar.addActionListener(new ActionListener() {
										
					public void actionPerformed(ActionEvent e) {
						try {
						PreparedStatement ps = DataConnectionUser.con.prepareStatement("Select * from Usuario where Nombre='"+txt_usuario.getText()+"'and Contraseña='"+txt_contraseña.getText()+"'");
						ResultSet rs = ps.executeQuery();
						if(rs.next()){
							JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña Incorrectos");
							paginaPrincipal.setVisible(true);
							dispose();
							}
												}
						catch (Exception login) {
							System.out.println(e);
						}
						
					}

				});
				
			}
			
}
	
	


