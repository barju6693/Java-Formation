package com.ejemplos.model;

public class Treballador {

	public int ID;
	public String Name;
	public String Cognom1;
	public String Cognom2;
	public String EMail;
	public String Telefon;
	public String dni;
	public String dataNaixement;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDataNaixement() {
		return dataNaixement;
	}

	public void setDataNaixement(String dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

	@Override
	public String toString() {
		return Name + "," + Cognom1 + "," + Cognom2 + "," + EMail
				+ "," + Telefon + "," + dni + "," + dataNaixement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cognom1 == null) ? 0 : Cognom1.hashCode());
		result = prime * result + ((Cognom2 == null) ? 0 : Cognom2.hashCode());
		result = prime * result + ((EMail == null) ? 0 : EMail.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Telefon == null) ? 0 : Telefon.hashCode());
		result = prime * result + ((dataNaixement == null) ? 0 : dataNaixement.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treballador other = (Treballador) obj;
		if (Cognom1 == null) {
			if (other.Cognom1 != null)
				return false;
		} else if (!Cognom1.equals(other.Cognom1))
			return false;
		if (Cognom2 == null) {
			if (other.Cognom2 != null)
				return false;
		} else if (!Cognom2.equals(other.Cognom2))
			return false;
		if (EMail == null) {
			if (other.EMail != null)
				return false;
		} else if (!EMail.equals(other.EMail))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Telefon == null) {
			if (other.Telefon != null)
				return false;
		} else if (!Telefon.equals(other.Telefon))
			return false;
		if (dataNaixement == null) {
			if (other.dataNaixement != null)
				return false;
		} else if (!dataNaixement.equals(other.dataNaixement))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}


}
