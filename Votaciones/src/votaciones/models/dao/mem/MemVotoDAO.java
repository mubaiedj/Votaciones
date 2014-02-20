package votaciones.models.dao.mem;

import votaciones.models.dao.VotoDAO;
import votaciones.models.entities.Voto;

public class MemVotoDAO extends MemGenericDAO<Voto, String> implements VotoDAO {

    public MemVotoDAO() {
    
    }

	@Override
	protected String getId(Voto entity) {
		// TODO Auto-generated method stub
		return null;
	}


}
