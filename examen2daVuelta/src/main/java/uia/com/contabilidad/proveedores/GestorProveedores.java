package uia.com.contabilidad.proveedores;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import uia.com.contabilidad.cuentas.GestorCuentas;



/**
 * @author amiguel
 * @version 1.0
 
 */
public class GestorProveedores {

	private ListaProveedores miListaProveedores;
	private Proveedor miProveedor;
	private GestorCuentas miGestorCuentas = new GestorCuentas();
	

	public GestorProveedores() 
	{
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            //miListaProveedores = mapper.readValue(s, ListaProveedores.class);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
   		 	miListaProveedores = mapper.readValue(new FileInputStream("cuentasXPagar.json"), ListaProveedores.class );
            
        }
        catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (miListaProveedores != null) {
            System.out.println("----- Items List -----");

            for (InfoUIA mi : miListaProveedores.getItems()) {
                System.out.println("Type = " + mi.getClass() +  ", id = "+ mi.getId() + ", name = " + mi.getName());
            }
        }
		
	}

	public void finalize() throws Throwable {

	}
	
	public void actualiza(){

	}

	
	public List<String> getLista() 
	{
		List<String> listaStr = new ArrayList<String>();
				
		
		return listaStr;
		
	}

	
	public void validaCobranza()
	{
		
	}

	public void validaCobranza(String name) {
		
		miListaProveedores.getItems().forEach(t->
			{
				if(t.getName().contains(name.toString()))
				{
					miProveedor = (Proveedor) t;					
					miProveedor.validaCobranza();
				}
			}
			);
		
	}

	public void registraCheque(String nomProveedor, String cuentaCheques, String nomCheque) 
	{
		if(this.miGestorCuentas != null && miListaProveedores != null)
		{
			for(int i = 0; i < this.miListaProveedores.getItems().size(); i++)
			{
			    miProveedor = (Proveedor) this.miListaProveedores.getItems().get(i);
			    if(miProveedor.getName().contains(nomProveedor.toString()))
			    	break;
			}
			
			miGestorCuentas.registraCheque(miProveedor,  cuentaCheques, nomCheque);
			
		}
		
	}
}