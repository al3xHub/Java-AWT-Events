package es.studium.Ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio2 implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(20);
	TextField txtFahrenheit = new TextField(20);
	Button btnCelsiustoF = new Button("Celsius a Fahrenheit");
	Button btnFtoCelsius = new Button("Fahrenheit a Celsius");
	
	Ejercicio2()
	{
		ventana.setLayout(new GridLayout(3, 2));
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFahrenheit);
		ventana.add(txtFahrenheit);
		ventana.add(btnCelsiustoF);
		ventana.add(btnFtoCelsius);
		
		btnCelsiustoF.addActionListener(this);
		btnFtoCelsius.addActionListener(this);
		ventana.addWindowListener(this);
		
		ventana.setSize(400,150);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
	new Ejercicio2();
	}


	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(btnCelsiustoF))
		{
			if(!txtCelsius.getText().equals(""))
			{
				float celsius = Float.parseFloat(txtCelsius.getText());
				//fº =(cº x9/5) +32				
				float fahrenheit = (celsius * 9.0f/5.0f) + 32.f;
				txtFahrenheit.setText(fahrenheit+"");
			}
		}
		
		else if(evento.getSource().equals(btnFtoCelsius))
		{
			if(!txtFahrenheit.getText().equals(""))
			{
				float fahrenheit = Float.parseFloat(txtFahrenheit.getText());
				//cº = (Fº - 32) x5/9
				float celsius = (fahrenheit - 32.0f) * 5.0f /9.0f;
				
				txtCelsius.setText(celsius+"");
				
			}
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
