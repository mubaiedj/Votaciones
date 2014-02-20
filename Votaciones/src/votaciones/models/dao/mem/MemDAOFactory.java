package votaciones.models.dao.mem;

import votaciones.models.dao.DAOFactory;
import votaciones.models.dao.VotoDAO;


public class MemDAOFactory extends DAOFactory {
	private VotoDAO memUsuarioDAO = new MemVotoDAO();

    @Override
    public VotoDAO getUserDAO() {
        return this.memUsuarioDAO;
    }

}
