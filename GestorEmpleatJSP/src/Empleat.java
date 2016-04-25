import java.util.ArrayList;

public class Empleat {
	
	public static ArrayList<Empleat> list = new ArrayList<Empleat>();
	
	public String Name;
	public String Cognom1;
	public String Cognom2;
	public String EMail;
	public String Telefon;
	
	public Empleat(){

	}
	
	public void addEmpleat(){
		list.add(this);
	}

	public static ArrayList<Empleat> getList() {
		return list;
	}

	public static void setList(ArrayList<Empleat> list) {
		Empleat.list = list;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCognom1() {
		return Cognom1;
	}

	public void setCognom1(String cognom1) {
		Cognom1 = cognom1;
	}

	public String getCognom2() {
		return Cognom2;
	}

	public void setCognom2(String cognom2) {
		Cognom2 = cognom2;
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		EMail = eMail;
	}

	public String getTelefon() {
		return Telefon;
	}

	public void setTelefon(String telefon) {
		Telefon = telefon;
	}

	@Override
	public String toString() {
		return Name + " " + Cognom1 + " " + Cognom2 + " " + EMail
				+ " " + Telefon;
	}
	
	

}
