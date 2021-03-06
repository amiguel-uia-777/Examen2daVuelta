package uia.com.contabilidad.proveedores;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public  class ListaInfoUIA 
{
	protected int id;
	protected String name;
	
	 public List<InfoUIA> getAsientos() {
		return asientos;
	}

	private List<InfoUIA> items;
	 private List<InfoUIA> asientos;

	    public void setAsientos(List<InfoUIA> asientos) {
		this.asientos = asientos;
	}

		public ListaInfoUIA(List<InfoUIA> pl) {
	        this.items = pl;
	    }

	    public ListaInfoUIA() {
	        this.items = new ArrayList<InfoUIA>();
	    }

	    public List<InfoUIA> getItems() {
	        return this.items;
	    }

	    public void setItems(List<InfoUIA> l) {
	        this.items = l;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
