package votaciones.controller.beans;


import org.apache.log4j.Logger;

import votaciones.models.dao.DAOFactory;
import votaciones.models.dao.VotoDAO;
import votaciones.models.entities.Opcion;
import votaciones.models.entities.Voto;

public class VotarBean extends Bean {
	
	private Voto voto;
	
	 public VotarBean() {
	    }

	  public Opcion[] getOpcion() {
	      return Opcion.values();
	  }
	  
	  
	  public String register() {
	      //  LoginEjb eaE = new LoginEjb();
	        String result = "register";

	      
	        return result;
	    }

}
