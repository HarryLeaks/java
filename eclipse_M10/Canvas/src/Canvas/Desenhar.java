package Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Desenhar extends Canvas{
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		Desenhar b = new Desenhar();
		b.setBackground(Color.BLACK);
		
		//Criar um JFrame para colocar o Canvas (como JPanel)
		JFrame f =  new JFrame();
		f.setTitle("Desenhos Geométricos");
		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setUndecorated(true);
		f.getRootPane().setWindowDecorationStyle(4);
		f.add(b);
		f.setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(45, 54, 54, 54);
		g.setColor(Color.red);
		g.fillRect(120, 60, 60, 120);
		g.setColor(Color.green);
		g.fillRect(180, 190, 60, 60);
	}
}
