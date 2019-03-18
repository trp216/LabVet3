package model;

public class Client {

	private String name;
	private int id;
	private String dir;
	private int phone;
	
	public Client(String n, int i, String d, int p) {
		name = n;
		id = i;
		dir = d;
		phone = p;
	}

	public String getNameC() {
		return name;
	}

	public void setNameC(String name) {
		this.name = name;
	}

	public int getIDC() {
		return id;
	}

	public void setIDC(int id) {
		this.id = id;
	}

	public String getDirC() {
		return dir;
	}

	public void setDirC(String dir) {
		this.dir = dir;
	}

	public int getPhoneC() {
		return phone;
	}

	public void setPhoneC(int phone) {
		this.phone = phone;
	}

}
