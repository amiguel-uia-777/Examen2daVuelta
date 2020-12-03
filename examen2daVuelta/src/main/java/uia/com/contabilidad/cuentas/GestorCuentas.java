package uia.com.contabilidad.cuentas;

import uia.com.contabilidad.cheques.Cheque;
import uia.com.contabilidad.cheques.GestorCheques;
import uia.com.contabilidad.proveedores.Proveedor;

public class GestorCuentas {
	
	private GestorCheques miGestorCheques = new GestorCheques();
	private Cuenta miCCheques;
	private Proveedor miProveedor;
	
	public void GestorCuentas()
	{}
	
	public void validaCobranza(Proveedor proveedor)
	{
		miProveedor = proveedor;
		//miProveedor.validaCobranza();		
	}

	public void registraCheque(Proveedor proveedor, String nomCuentaCheques, String nomCheque) 
	{

		this.miProveedor = proveedor;
		if(this.miGestorCheques != null && miProveedor != null)
		{
			for(int i = 0; i < this.miProveedor.getItems().size(); i++)
			{
			    miCCheques = (Cuenta) this.miProveedor.getItems().get(i);
			    if(miCCheques.getName().contains(nomCuentaCheques.toString()))
			    	break;
			}
			
			if(miCCheques != null)
				if((miGestorCheques.registraCheque(miCCheques,  nomCuentaCheques, nomCheque).getEstado().contentEquals("devuelto")))
						miGestorCheques.realizaAsientoDeudor(miCCheques,  nomCuentaCheques, nomCheque);
			else
				System.out.println("Error: Cuenta de cheques no encontrada");
		}
	}
	
	

}
