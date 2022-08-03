package Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jpanelcanvas extends Canvas{
	private static final long serialVersionUID = 1L;
			
	private int larg=600, alt=400;
	private Canvas desenho;
	private JButton b;
	private JFrame j;
	private JPanel p;
	
	public void janela() {
		j = new JFrame();
		j.setSize(larg, alt);
		j.setResizable(false);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLocationRelativeTo(null);
		j.setVisible(true);
		
		desenho = new Canvas() {
			private static final long serialVersionUID = 1L;
			public void paint(Graphics g) {
				g.setColor(Color.yellow);
				g.fill3DRect(20, 20, 200, 200, true);
				g.setColor(Color.red);
				g.fillRect(120, 60, 60, 120);
				g.setColor(Color.green);
				g.fillRect(180, 190, 60, 60);
			}
		};
		
		desenho.setBackground(Color.black);
		desenho.setBounds(0, 0, 600, 280);
		desenho.setFocusable(false);
		j.add(desenho);
		
		p = new JPanel();
		p.setBackground(new Color(0, 51, 0));
		p.setBounds(300, 0, 600, 120);
		p.setLayout(null);
		b = new JButton("Teste");
		b.setBounds(150, 300, 70, 30);
		p.add(b);
		p.setVisible(true);
		j.add(p);
	}
	
	public static void main(String[] args) {
		Jpanelcanvas b = new Jpanelcanvas();
		b.janela();
	}
}
