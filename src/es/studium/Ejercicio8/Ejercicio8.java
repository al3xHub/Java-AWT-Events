package es.studium.Ejercicio8;



import java.awt.Dialog;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Ejercicio8 implements WindowListener, ActionListener
{
Frame ventana = new Frame("Menú");
MenuBar barraMenu = new MenuBar();
Menu articulos = new Menu("Artículos");
Menu clientes = new Menu("Clientes");
Menu facturas = new Menu("Facturas");
MenuItem articuloNuevo=new MenuItem("Nuevo Artículo");
MenuItem articuloEliminar=new MenuItem("Eliminar Artículo");
MenuItem articuloConsultar=new MenuItem("Consultar Artículo");
MenuItem clientesNuevo=new MenuItem("Nuevo Cliente");
MenuItem clientesEliminar=new MenuItem("Eliminar Cliente");
MenuItem clientesConsultar=new MenuItem("Consultar Cliente");
MenuItem facturasNueva=new MenuItem("Nueva Factura");
MenuItem facturaConsultar=new MenuItem("Consultar Factura");

/*
 * DIALOG Tiene que estar asociado a algún componente, en este caso con el parámetro "ventana".
 * Parámetro de cadena para escribir el título.
 * 3º parámetro: Boolean para saber si es modal o no. (Modal(true) hasta que no cierres el dialogo no puede
 * interacturar con la ventana de atrás. No modal se puede interactuar con las dos ventanas.
 */

Dialog dlgDialogo = new Dialog(ventana, "Diálogo con mensaje", true);

Label lblMensaje = new Label("");


public Ejercicio8()
{
ventana.setLayout(new FlowLayout());
ventana.setMenuBar(barraMenu);
articulos.add(articuloNuevo);
articulos.add(articuloEliminar);
articulos.add(articuloConsultar);

articuloNuevo.addActionListener(this);
articuloEliminar.addActionListener(this);
articuloConsultar.addActionListener(this);

clientes.add(clientesNuevo);
clientes.add(clientesEliminar);
clientes.add(clientesConsultar);

clientesNuevo.addActionListener(this);
clientesEliminar.addActionListener(this);
clientesConsultar.addActionListener(this);

facturas.add(facturasNueva);
facturas.add(facturaConsultar);

facturasNueva.addActionListener(this);
facturaConsultar.addActionListener(this);

barraMenu.add(articulos);
barraMenu.add(clientes);
barraMenu.add(facturas);

ventana.addWindowListener(this);

ventana.setSize(350,200);
ventana.setVisible(true);

//Tamaño dialogo
dlgDialogo.setLayout(new FlowLayout());
dlgDialogo.setSize(200,150);

// Para poder cerrar el Diálogo
dlgDialogo.addWindowListener(this);


}

public static void main(String[] args)
	{
		new Ejercicio8();
	}


public void windowActivated(WindowEvent we) {}
public void windowClosed(WindowEvent we) {}
public void windowClosing(WindowEvent we)
{
	//Forma de poder cerrar el dialogo sin cerrar todas las ventanas.
if(dlgDialogo.hasFocus())
{
	
dlgDialogo.setVisible(false);
}
else
{
System.exit(0);
}
}
public void windowDeactivated(WindowEvent we) {}
public void windowDeiconified(WindowEvent we) {}
public void windowIconified(WindowEvent we) {}
public void windowOpened(WindowEvent we) {}
public void actionPerformed(ActionEvent ae)
{
Object a;
a = ae.getSource();
if(a.equals(articuloNuevo))
{
lblMensaje.setText("Artículo Nuevo");
}
else if(a.equals(articuloEliminar))
{
lblMensaje.setText("Artículo Eliminar");
}
else if(a.equals(articuloConsultar))
{
lblMensaje.setText("Artículo Consultar");
}
else if(a.equals(clientesNuevo))
{
lblMensaje.setText("Cliente Nuevo");
}
else if(a.equals(clientesEliminar))
{
lblMensaje.setText("Cliente Eliminar");
}
else if(a.equals(clientesConsultar))
{
lblMensaje.setText("Cliente Consultar");
}
else if(a.equals(facturasNueva))
{
lblMensaje.setText("Factura Nueva");
}
else
{
	lblMensaje.setText("Factura Consultar");
	}
	dlgDialogo.add(lblMensaje);
	
	//mostrar el dialogo
	dlgDialogo.setVisible(true);
	}
}

