package votaciones.models.ejb;

import votaciones.models.dao.DAOFactory;
import votaciones.models.dao.VotoDAO;
import votaciones.models.entities.Voto;

public class VotarEjb {
	
	  
	  public boolean register(Voto voto) {
	        VotoDAO userDAO = DAOFactory.getFactory().getUserDAO();
	        userDAO.create(voto);
			return true;

	    }

}
