package uia.com.contabilidad.cuentas;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import uia.com.contabilidad.proveedores.InfoUIA;

public class AsientoDeudor extends InfoUIA
{
		String fecha = "";
		
		public AsientoDeudor()
		{			
		}
		
	    public AsientoDeudor(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("estado")String status, @JsonProperty("fecha")String fecha) 
		{
			super(id, name);
			this.setEstado(status);
			this.setFecha(fecha);
		}
		
		
	    public AsientoDeudor(int id, String name, String p1) 
		{
	        super(id, name);
	        this.fecha = p1;
	    }


		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}	
		
		public void validaCobranza()
		{
					System.out.println("Ejecutando validaCobranza() de  " + this.getId()+ "  "+this.getName());
		}
		
		public void pruebaGit()
		{
					System.out.println("Ejecutando pruebaGit ");
		}
	
}