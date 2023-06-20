package es.studium.TercerEjemploEventos;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TercerEjemploEventos implements WindowListener, ItemListener
{

	Frame ventana = new Frame("Eventos");
	
	Choice choLista = new Choice();
	
	TercerEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(250, 200);
		ventana.addWindowListener(this);
		
		choLista.add("Seleccionar un color...");
		choLista.add("Rojo");
		choLista.add("Verde");
		choLista.add("Amarillo");
		choLista.add("Azul");
		choLista.addItemListener(this);
		ventana.add(choLista);
		
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new TercerEjemploEventos();

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
	public void itemStateChanged(ItemEvent evento)
	{
		if(evento.getItem().equals("Rojo"))
		{
			ventana.setBackground(Color.red);
		}
		
		else if(evento.getItem().equals("Verde"))
		{
			ventana.setBackground(Color.green);
		}
		
		else if(evento.getItem().equals("Amarillo"))
		{
			ventana.setBackground(Color.YELLOW);
		}
		
		else if(evento.getItem().equals("Azul"))
		{
			ventana.setBackground(Color.blue);
		}
	}

}
