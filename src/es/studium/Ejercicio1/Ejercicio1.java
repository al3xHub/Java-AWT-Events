package es.studium.Ejercicio1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//implementar interfaces Action...WindowL...
public class Ejercicio1 implements ActionListener, WindowListener
{
Frame ventana = new Frame("Ejercicio1");
Label lblHora1 = new Label("HH");
TextField txtHora1 = new TextField(2);
Label lblMinuto1 = new Label("MM");
TextField txtMinuto1 = new TextField(2);
Label lblHora2 = new Label("HH");
TextField txtHora2 = new TextField(2);
Label lblMinuto2 = new Label("MM");
TextField txtMinuto2 = new TextField(2);
Button btnCalcular = new Button("Calcular");
TextField txtResultado = new TextField(10);



Ejercicio1()
{
ventana.setLayout(new GridLayout(3,4));
ventana.add(lblHora1);
ventana.add(txtHora1);
ventana.add(lblMinuto1);
ventana.add(txtMinuto1);
ventana.add(lblHora2);
ventana.add(txtHora2);
ventana.add(lblMinuto2);
ventana.add(txtMinuto2);
ventana.add(btnCalcular);

//añadir el boton actionL... y a la ventana el WindowList...
btnCalcular.addActionListener(this);
ventana.addWindowListener(this);

//el texto no dejará escribir nada 
txtResultado.setEnabled(false);

ventana.add(txtResultado);
ventana.setSize(300,150);
ventana.setLocationRelativeTo(null);
ventana.setVisible(true);
}

public static void main(String[] args)
{
new Ejercicio1();
}

@Override
public void windowOpened(WindowEvent e)
{
}

@Override
public void windowClosing(WindowEvent e)
{
	//añadir cerrar ventana 
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
	//Aqui dar funcionalidad a los botones y cuadro de textos
	
	/*
	 * get text te saca siempre una cadena, pero lo estamos declarando a una variable de tipo entero,
	 * necesitamos "parsear" el método con Integer.par...
	 */
	
	int hh1=0, hh2=0, mm1=0, mm2=0;
	
	if(!txtHora1.getText().equals(""))
	{
		hh1 = Integer.parseInt(txtHora1.getText());
	}
	if(!txtHora2.getText().equals(""))
	{
		hh2 = Integer.parseInt(txtHora2.getText());
	}
	if(!txtMinuto1.getText().equals(""))
	{
		mm1 = Integer.parseInt(txtMinuto1.getText());
	}
	if(!txtMinuto2.getText().equals(""))
	{
		mm2 = Integer.parseInt(txtMinuto2.getText());
	}
	int diferencia = Math.abs((hh1*60+mm1)-(hh2*60+mm2));
	txtResultado.setText(String.format("%02d:%02d", diferencia/60, diferencia%60));	
}
}


