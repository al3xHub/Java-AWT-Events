package es.studium.Ejercicio7;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio7 implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Baloncesto");
	List lisEquipos = new List(5, false);
	
	String[] equipos = {"Seleccione un equipo", "Real Madrid", "Barça",
	"Iberoestar Tenerife", "TD Systems Baskonia", "Hereda San Pablo Burgos",
	"Valencia Basket", "Club Joventut de Badalona", "Unicaja", "UCAM Murcia", 
	"BaxiManresa", "MoraBanc Andorra", "Herbalife Gran Canaria", "Monbus Obradoiro",
	"Movistar Estudiantes", "Casademont Zaragoza", "Urbas Fuenlabrada",
	"Coosur Real Betis", "RETAbet Bilbao Basket", "Acunsa Gipuzkoa Basket"};
	
	String[] ciudades = {"No ha seleccionado ningun equipo", "Madrid", "Barcelona", "Tenerife", "Bilbao", 
			"Burgos", "Valencia", "Badalona", "Málaga", "Murcia", "Manresa", "Andorra", "Gran Canarias", "Santiago de compostela",
			"Madrid", "Zaragoza", "Fuenlabrada", "Sevilla", "Bilbao", "Guipuzcoa"};
	
	public Ejercicio7()
	{
		ventana.setLayout(new FlowLayout());
		for(String equipo: equipos)
		{
		lisEquipos.add(equipo);
		}
		ventana.add(lisEquipos);
		ventana.setSize(260,150);
		
		//añadir Listener de ventana y lista
		ventana.addWindowListener(this);
		lisEquipos.addItemListener(this);
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		 new Ejercicio7();
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		String ciudad = new String();
		ciudad = ciudades[lisEquipos.getSelectedIndex()];
		
		System.out.println(ciudad);
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

