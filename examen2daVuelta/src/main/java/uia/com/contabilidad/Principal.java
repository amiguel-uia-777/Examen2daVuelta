package uia.com.contabilidad;

import uia.com.contabilidad.proveedores.GestorProveedores;

public class Principal extends validaAprovacionCuentasXPagar{

	public static void main(String[] args) {
		
		
		System.out.println("Hola UIA");
		
		GestorProveedores miGestorProveedores = new GestorProveedores();
		
		miGestorProveedores.registraCheque("Alfonso", "Cheques", "ProveedorX");
		
		System.out.println( “Ingresa la cuenta a aprobar o un 0 se no la hay”);
		
		 Scanner scanIn = new Scanner(System.in); 
	     nomCuenta = scanIn.nextLine();
		
		validaAprovacionCuentaXPagar(String nomCuenta);
	}

}
