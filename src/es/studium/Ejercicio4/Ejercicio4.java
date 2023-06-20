package es.studium.Ejercicio4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 implements WindowListener, ActionListener
{

		Frame ventana = new Frame("Aficiones");
		
		Checkbox chkUno = new Checkbox("Correr");
		Checkbox chkDos = new Checkbox("Nadar");
		Checkbox chkTres = new Checkbox("Andar");
		Checkbox chkCuatro = new Checkbox("Leer");
		Checkbox chkCinco = new Checkbox("Ir al cine");
		Checkbox chkSeis = new Checkbox("Bailar");
		Checkbox chkSiete = new Checkbox("Fútbol");
		Checkbox chkOcho = new Checkbox("Tenis");
		Checkbox chkNueve = new Checkbox("Baloncesto");
		Checkbox chkDiez = new Checkbox("Deportes de vela");
		
		Button btnComprobar = new Button("Comprobar");
		
		String resultado = new String("");
		
		
		
		Ejercicio4()
		{
			ventana.setLayout(new FlowLayout());
			
			ventana.add(chkUno);
			ventana.add(chkDos);
			ventana.add(chkTres);
			ventana.add(chkCuatro);
			ventana.add(chkCinco);
			ventana.add(chkSeis);
			ventana.add(chkSiete);
			ventana.add(chkOcho);
			ventana.add(chkNueve);
			ventana.add(chkDiez);
			
			ventana.add(btnComprobar);
			
			ventana.setLocationRelativeTo(null);
			ventana.setSize(400, 150);
			
			//Añadir Listener al boton "comprobar"
			btnComprobar.addActionListener(this);
			
			//Añadir Listener a la ventana
			ventana.addWindowListener(this);
			
			
			
			ventana.setVisible(true);
		}
		
		public static void main(String[] args)
		{
			new Ejercicio4();
		}

		{


	}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			resultado = "";
			
			if(chkUno.getState()==true)
			{
				resultado = resultado +"Correr\n";
			}
			if(chkDos.getState()==true)
			{
				resultado = resultado +"Nadar\n";
			}
			if(chkTres.getState()==true)
			{
				resultado = resultado +"Andar\n";
			}
			if(chkCuatro.getState()==true)
			{
				resultado = resultado +"Leer\n";
			}
			if(chkCinco.getState()==true)
			{
				resultado = resultado +"Ir al cine\n";
			}
			if(chkSeis.getState()==true)
			{
				resultado = resultado +"Bailar\n";
			}
			if(chkSiete.getState()==true)
			{
				resultado = resultado +"Fútbol\n";
			}
			if(chkOcho.getState()==true)
			{
				resultado = resultado +"Tenis\n";
			}
			if(chkNueve.getState()==true)
			{
				resultado = resultado +"Baloncesto\n";
			}
			if(chkDiez.getState()==true)
			{
				resultado = resultado + "Deportes de vela\n";
			}
			
			System.out.println(resultado);
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
