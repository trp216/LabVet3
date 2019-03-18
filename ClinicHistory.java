package model;

public class ClinicHistory {

	public final static char OPEN = 'O';	
	public final static char CLOSED = 'C';

	
	private String id;
	private char state;
	
	public ClinicHistory() {
		// TODO Auto-generated constructor stub
	}

	public String getIDCH() {
		return id;
	}

	public void setIDCH(String id) {
		this.id = id;
	}

	public char getStateCH() {
		return state;
	}

	public void setStateCH(char state) {
		this.state = state;
	}

}
