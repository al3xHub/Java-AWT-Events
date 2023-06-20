package es.studium.CuartoEjemploEventos;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CuartoEjemploEventos implements WindowListener, MouseListener
{

	Frame ventana = new Frame("Eventos");
	
	CuartoEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(250, 200);
		ventana.addWindowListener(this);
		
		ventana.addMouseListener(this);
		
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new CuartoEjemploEventos();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
	}

	@Override
	public void mouseClicked(MouseEvent evento)
	{
		//Click y soltar
		//Botón izquierdo y derecho
		
		System.out.println("x"+ evento.getX());
		System.out.println("y"+ evento.getY());
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		//Click mantenido
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		//soltando
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		//entra cursor raton en una zona
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		//cuando sale de una zona
	}

}
