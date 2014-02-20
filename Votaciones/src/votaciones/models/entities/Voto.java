package votaciones.models.entities;

public class Voto {
	 	private String ip;

	    private String voto;
	    
	    public Voto() {
	        
	    }

	    public Voto(String ip, String voto) {
	        super();
	        this.ip = ip;
	        this.voto = voto;
	    }

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getVoto() {
			return voto;
		}

		public void setVoto(String voto) {
			this.voto = voto;
		}
		
	 @Override
	    public String toString() {
	        return "User [ip=" + ip + ", voto=" + voto +"]";
	    }

}
