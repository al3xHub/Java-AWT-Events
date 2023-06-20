package es.studium.SegundoEjemploEventos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SegundoEjemploEventos implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Calculadora");
	
	TextField txtUno = new TextField(20);
	TextField txtDos = new TextField(20);
	TextField txtResultado = new TextField(20);
	
	Button btnSumar = new Button("Sumar");
	Button btnRestar = new Button("Restar");
	Button btnMultiplicar = new Button("Multiplicar");
	Button btnDividir = new Button("Dividir");
	
	SegundoEjemploEventos()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(250, 200);
		ventana.add(txtUno);
		ventana.add(txtDos);
		
		ventana.setBackground(Color.gray);
		
		ventana.addWindowListener(this);
		
		btnSumar.addActionListener(this);
		ventana.add(btnSumar);
		
		btnRestar.addActionListener(this);
		ventana.add(btnRestar);
		
		btnMultiplicar.addActionListener(this);
		ventana.add(btnMultiplicar);
		
		btnDividir.addActionListener(this);
		ventana.add(btnDividir);
		
		txtResultado.setEnabled(false);
		ventana.add(txtResultado);
		
		
		
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new SegundoEjemploEventos();
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
	public void actionPerformed(ActionEvent e)
	{
		
		float uno, dos;
		float resultado;
		
		if(e.getSource().equals(btnSumar))
		{
			uno = Float.parseFloat(txtUno.getText());
			dos = Float.parseFloat(txtDos.getText());
			resultado = uno + dos;
			txtResultado.setText(String.format("%.2f", resultado));
		}
		
		else if(e.getSource().equals(btnRestar))
		{
			uno = Float.parseFloat(txtUno.getText());
			dos = Float.parseFloat(txtDos.getText());
			resultado = uno - dos;
			txtResultado.setText(String.format("%.2f", resultado));
		}
		
		else if(e.getSource().equals(btnMultiplicar))
		{
			uno = Float.parseFloat(txtUno.getText());
			dos = Float.parseFloat(txtDos.getText());
			resultado = uno * dos;
			txtResultado.setText(String.format("%.2f", resultado));
			
		}
		
		else if(e.getSource().equals(btnDividir))
		{
			uno = Float.parseFloat(txtUno.getText());
			dos = Float.parseFloat(txtDos.getText());
			if(dos!=0.0)
			{
				resultado = uno / dos;
				txtResultado.setText(String.format("%.2f",resultado));
			}
			else
			{
				txtResultado.setText("0");
			}
		}
		
	}
}
