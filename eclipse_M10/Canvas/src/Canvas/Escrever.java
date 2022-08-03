package Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Escrever extends JFrame implements MouseListener, MouseMotionListener{
	private static final long serialVersionUID = 1L;
	private JFrame j;
	private Canvas c;
	
	public Escrever() {
		j = new JFrame();
		j.setSize(600, 600);
		j.setTitle("Área de Desenho");
		j.setResizable(false);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLocationRelativeTo(null);
		j.setVisible(true);
		
		c = new Canvas();
		c.setBackground(Color.black);
		
		//Adicionar um MouseListener e um MouseMotionListener ao Canvas
		c.addMouseListener(this);
		c.addMouseMotionListener(this);
		
		j.add(c);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = c.getGraphics();
		g.setColor(Color.blue);
		
		//Obter a posicao xe t do canvas
		int x, y;
		x = e.getX();
		y = e.getY();
		//Desenhar uma oval - click do rato
		g.fillOval(x, y,  8,  8);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = c.getGraphics();
		g.setColor(Color.blue);
		
		//obter a posicao x e y do canvas
		int x, y;
		x = e.getX();
		y = e.getY();
		//Desenhar uma oval - click do rato
		g.fillOval(x,  y, 8, 8);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new Escrever();
	}
	 
}
