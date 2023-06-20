package es.studium.PrimerEjemploEventos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PrimerEjemploEventos implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Eventos");
	Button btnCerrar = new Button("Cerrar");
	Button btnMensaje = new Button("Mensaje");
	
	PrimerEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(250, 100);
		
		ventana.addWindowListener(this);
		btnCerrar.addActionListener(this);
		ventana.add(btnCerrar);
		
		btnMensaje.addActionListener(this);
		ventana.add(btnMensaje);
		
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new PrimerEjemploEventos();
	}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(btnMensaje))
		{
			System.out.println("Mensaje");
		}
		else
		{
			System.exit(0);
			
		}
		
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
}