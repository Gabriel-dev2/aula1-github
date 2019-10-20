package exercicios;

public class Pensao {
     private int qtdRoom = 10;
     private String nomeHospede;
     private String emailHospede;
     private int numRoom;
     private int qtdHospedes;
	
     public Pensao() {
    	 
     }
     
     public Pensao(String nomeHospede, String emailHospede, int numRoom, int qtdHospedes) {
		super();
		this.nomeHospede = nomeHospede;
		this.emailHospede = emailHospede;
		this.numRoom = numRoom;
		this.qtdHospedes = qtdHospedes;
	}


	public int getQtdRoom() {
		return qtdRoom;
	}


	public void setQtdRoom(int qtdRoom) {
		this.qtdRoom = qtdRoom;
	}


	public String getNomeHospede() {
		return nomeHospede;
	}


	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}


	public String getEmailHospede() {
		return emailHospede;
	}


	public void setEmailHospede(String emailHospede) {
		this.emailHospede = emailHospede;
	}


	public int getNumRoom() {
		return numRoom;
	}


	public void setNumRoom(int numRoom) {
		this.numRoom = numRoom;
	}
	
	
     
	public int getQtdHospedes() {
		return qtdHospedes;
	}


	public void setQtdHospedes(int qtdHospedes) {
		this.qtdHospedes = qtdHospedes;
	}


	public int availableRooms() {
		return this.qtdRoom - this.qtdHospedes;
	}
	
	
     
	@Override
	public String toString() {
		return numRoom + ": " + nomeHospede + ", " + emailHospede + "\n";
	}

}
