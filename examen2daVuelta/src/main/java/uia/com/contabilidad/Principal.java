package uia.com.contabilidad;

import uia.com.contabilidad.proveedores.GestorProveedores;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.println("Hola UIA");
		
		GestorProveedores miGestorProveedores = new GestorProveedores();
		
		miGestorProveedores.registraCheque("Alfonso", "Cheques", "ProveedorX");
		
		
	}

}
