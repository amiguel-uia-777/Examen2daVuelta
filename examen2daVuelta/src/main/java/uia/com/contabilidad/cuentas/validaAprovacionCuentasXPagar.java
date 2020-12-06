package uia.com.contabilidad.cuentas;

import com.sun.tools.javac.parser.Scanner;

import uia.com.contabilidad.proveedores.GestorProveedores;
import uia.com.contabilidad.proveedores.Proveedor;

public class validaAprovacionCuentasXPagar extends GestorProveedores, Fatura{
	
	String nomCheque;
	String cuentaCheques;
	String nomProveedor;
	
	public String registraChequeDeudor(String nomChe, String cuentaChe) {
		
		return “Cheque deudor registrado”;
	}
	
	public Factura validaAprovacionCuentaXPagar(String cuentaXPagar) 
	{
		if(cuentaXPagar != null ) {
			
		 System.out.println( “Ingresa nombre del cheque”);
		
		 Scanner scanIn = new Scanner(System.in); 
	     nomCheque = scanIn.nextLine(); 
		
	     System.out.println( “Ingresa la cuenta del cheque”);
			
		 Scanner scanInn = new Scanner(System.in); 
	     cuentaCheques = scanInn.nextLine(); 
	     
	     System.out.println( “Ingresa el nombre del proveedor”);
			
		 Scanner scanInnn = new Scanner(System.in); 
	     nomProveedor = scanInnn.nextLine(); 
	     
	     	
	
		
		public Factura registraChequeDeudor(String nomProveedor, String nomCheque, String cuentaCheques)
		
		{
			registraCheque(String nomProveedor, String cuentaCheques, String nomCheque);
		}
		
		registraChequeDudor(String nomProveedor, String nomCheque, String cuentaCheques);
	
		CuentasXPagar.add(this.cuentaXPagar);
	
		}
	else
	{
		System.out.println(“No hay cheque deudor que registrar”);
	}
	
}
