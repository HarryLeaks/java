package Exceções;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IOException implements ActionListener {
	private JFrame janela;
	private JPanel painel;
	private JTextField tf;
	private JLabel l;
	private JButton b;
	
	public IOException() {
		janela = new JFrame();
		janela.setSize(400, 400);
		janela.setLocationRelativeTo(null);
		
		painel = new JPanel();
		painel.setLayout(null);
		janela.add(painel);
		
		tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		b = new JButton("IP?");
		b.setBounds(50, 150, 95, 30);
		b.addActionListener(this);
		
		painel.add(b);
		painel.add(tf);
		painel.add(l);
		
		janela.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ev) {
		try {
			String comp=tf.getText();
			String ip = java.net.InetAddress.getByName(comp).getHostAddress();
			l.setText("IP de " + comp + " é: " + ip);
		}catch(IOException e) {
			System.out.println("A rede não está ativa e/ou o DNS não está a funcionar");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new IOException();
	}
}
