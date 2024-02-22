package funcViews;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import funcModel.Funcionario;


public class FuncDetForm extends JDialog {
	
	JLabel lblId = new JLabel("Id:");
	JTextField txtId = new JTextField(null, 20);	
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField(null, 20);
	JLabel lblCpf = new JLabel("Cpf:");
	JTextField txtCpf = new JTextField(null, 20);
	JButton btnGravar = new JButton("Gravar");
	JButton btnFechar = new JButton("Fechar"); 
	
	private Funcionario funcionario = new Funcionario();
	
	public FuncDetForm() {
		this.setLayout(new FlowLayout()); 
		this.getContentPane().add(lblId);
		this.getContentPane().add(txtId);
		
		this.getContentPane().add(lblNome);
		this.getContentPane().add(txtNome);
		
		this.getContentPane().add(lblCpf);
		this.getContentPane().add(txtCpf);		
		
		this.getContentPane().add(btnGravar); 
		this.getContentPane().add(btnFechar); 
		
		btnGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				funcionario.setId(Long.parseLong(txtId.getText()));
				funcionario.setName(txtNome.getText());
				funcionario.setCpf(txtCpf.getText());
				
				
				hide();
				
			}
		});
		
		this.setModal(true);
		this.setSize(600, 480);
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
