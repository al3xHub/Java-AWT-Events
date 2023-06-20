package es.studium.Ejercicio11;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio11 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Tres en raya");
	
	Button btnBotonUno = new Button("");
	Button btnBotonDos = new Button("");
	Button btnBotonTres = new Button("");
	Button btnBotonCuatro = new Button("");
	Button btnBotonCinco = new Button("");
	Button btnBotonSeis = new Button("");
	Button btnBotonSiete = new Button("");
	Button btnBotonOcho = new Button("");
	Button btnBotonNueve = new Button("");
	
	Dialog dlgMensaje = new Dialog(ventana, "Mensaje", true);
	Label lblMensaje = new Label("");
	
	int turno=0;
	int contador=0;
	
	Ejercicio11()
	{
		ventana.setLayout(new GridLayout(3,3));
		ventana.addWindowListener(this);
		
		btnBotonUno.addActionListener(this);
		btnBotonDos.addActionListener(this);
		btnBotonTres.addActionListener(this);
		btnBotonCuatro.addActionListener(this);
		btnBotonCinco.addActionListener(this);
		btnBotonSeis.addActionListener(this);
		btnBotonSiete.addActionListener(this);
		btnBotonOcho.addActionListener(this);
		btnBotonNueve.addActionListener(this);
		
		dlgMensaje.setLayout(new FlowLayout());
		dlgMensaje.addWindowListener(this);
		dlgMensaje.setSize(150, 150);
		dlgMensaje.setLocationRelativeTo(null);
		dlgMensaje.setResizable(false);
		
		//primera fila
		ventana.add(btnBotonUno);
		ventana.add(btnBotonDos);
		ventana.add(btnBotonTres);
		
		//segunda fila
		ventana.add(btnBotonCuatro);
		ventana.add(btnBotonCinco);
		ventana.add(btnBotonSeis);
		
		//Tercera fila
		ventana.add(btnBotonSiete);
		ventana.add(btnBotonOcho);
		ventana.add(btnBotonNueve);
		
		ventana.setSize(350, 350);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new Ejercicio11();
	}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(btnBotonUno))
		{
			if(turno == 0)
			{
				btnBotonUno.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonUno.setLabel("X");
				turno = 0;
			}
			btnBotonUno.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonDos))
		{
			if(turno == 0)
			{
				btnBotonDos.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonDos.setLabel("X");
				turno = 0;
			}
			btnBotonDos.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonTres))
		{
			if(turno == 0)
			{
				btnBotonTres.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonTres.setLabel("X");
				turno = 0;
			}
			btnBotonTres.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonCuatro))
		{
			if(turno == 0)
			{
				btnBotonCuatro.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonCuatro.setLabel("X");
				turno = 0;
			}
			btnBotonCuatro.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonCinco))
		{
			if(turno == 0)
			{
				btnBotonCinco.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonCinco.setLabel("X");
				turno = 0;
			}
			btnBotonCinco.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonSeis))
		{
			if(turno == 0)
			{
				btnBotonSeis.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonSeis.setLabel("X");
				turno = 0;
			}
			btnBotonSeis.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonSiete))
		{
			if(turno == 0)
			{
				btnBotonSiete.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonSiete.setLabel("X");
				turno = 0;
			}
			btnBotonSiete.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonOcho))
		{
			if(turno == 0)
			{
				btnBotonOcho.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonOcho.setLabel("X");
				turno = 0;
			}
			btnBotonOcho.removeActionListener(this);
		}
		else if(evento.getSource().equals(btnBotonNueve))
		{
			if(turno == 0)
			{
				btnBotonNueve.setLabel("O");
				turno = 1;
			}
			else
			{
				btnBotonNueve.setLabel("X");
				turno = 0;
			}
			btnBotonNueve.removeActionListener(this);
		}
		contador ++;
		comprobar();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		if (dlgMensaje.isActive()) {
			dlgMensaje.setVisible(false);
		} else {
			System.exit(0);
		}
		
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
	
	void comprobar()
	{
		if((btnBotonUno.getLabel()).equals(btnBotonDos.getLabel())&&
				(btnBotonDos.getLabel()).equals(btnBotonTres.getLabel())&&
				!btnBotonUno.getLabel().equals(""))
		{
			lblMensaje.setText("Ha ganado " + btnBotonUno.getLabel());
			
			
			fin();
			
		}
		else if((btnBotonCuatro.getLabel()).equals(btnBotonCinco.getLabel())&&
				(btnBotonCinco.getLabel()).equals(btnBotonSeis.getLabel())&&
				!btnBotonCuatro.getLabel().equals(""))
		{
			lblMensaje.setText("Ha ganado " + btnBotonCuatro.getLabel());
			
			
			fin();
		}
		else if((btnBotonSiete.getLabel()).equals(btnBotonOcho.getLabel())&&
				(btnBotonOcho.getLabel()).equals(btnBotonNueve.getLabel())&&
				!btnBotonSiete.getLabel().equals(""))
		{
			lblMensaje.setText("Ha ganado " + btnBotonSiete.getLabel());
			
			fin();
		}
		else if((btnBotonUno.getLabel()).equals(btnBotonCuatro.getLabel())&&
				(btnBotonCuatro.getLabel()).equals(btnBotonSiete.getLabel())&&
				!btnBotonUno.getLabel().equals(""))
		{
			lblMensaje.setText("Ha ganado " + btnBotonUno.getLabel());
		
			fin();
		}
		else if((btnBotonCinco.getLabel()).equals(btnBotonDos.getLabel())&&
				(btnBotonDos.getLabel()).equals(btnBotonOcho.getLabel())&&
				!btnBotonCinco.getLabel().equals(""))
		{
			lblMensaje.setText("Ha ganado " + btnBotonCinco.getLabel());
			
		
			fin();
		}
		else if((btnBotonSeis.getLabel()).equals(btnBotonNueve.getLabel())&&
				(btnBotonNueve.getLabel()).equals(btnBotonTres.getLabel())&&
				!btnBotonSeis.getLabel().equals(""))
		{
			lblMensaje.setText("Ha ganado " + btnBotonSeis.getLabel());
			
			
			fin();
		}
		else if((btnBotonUno.getLabel()).equals(btnBotonCinco.getLabel())&&
				(btnBotonCinco.getLabel()).equals(btnBotonNueve.getLabel())&&
				!btnBotonUno.getLabel().equals(""))
		{
			lblMensaje.setText("Ha ganado " + btnBotonUno.getLabel());
			
			fin();
		}
		else if((btnBotonSiete.getLabel()).equals(btnBotonCinco.getLabel())&&
				(btnBotonCinco.getLabel()).equals(btnBotonTres.getLabel())&&
				!btnBotonSiete.getLabel().equals(""))
		{
			lblMensaje.setText("Ha ganado " + btnBotonSiete.getLabel());
			
		
			fin();
		}
		
		else if(contador==9)
		{
			lblMensaje.setText("Empate");
			fin();
		}
	}
	void fin()
	{
		dlgMensaje.add(lblMensaje);
		dlgMensaje.setVisible(true);
		btnBotonUno.removeActionListener(this);
		btnBotonDos.removeActionListener(this);
		btnBotonTres.removeActionListener(this);
		btnBotonCuatro.removeActionListener(this);
		btnBotonCinco.removeActionListener(this);
		btnBotonSeis.removeActionListener(this);
		btnBotonSiete.removeActionListener(this);
		btnBotonOcho.removeActionListener(this);
		btnBotonNueve.removeActionListener(this);
	}
	
	
}


