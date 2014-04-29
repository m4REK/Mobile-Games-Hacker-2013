package Hausaufgaben;

public class Referenten {
	private String refName;
	private String refEmail;
	private String refFirma;
	private Workshops angebotenesWorkshop;

	public Referenten(String name, String email, String firma,
			Workshops angebotenesWorkshop) {
		this.refName = name;
		this.refEmail = email;
		this.refFirma = firma;
		this.angebotenesWorkshop = angebotenesWorkshop;
	}

	public Workshops getAngebotenesWorkshop() {
		return angebotenesWorkshop;
	}

	public void setAngebotenesWorkshop(Workshops angebotenesWorkshop) {
		this.angebotenesWorkshop = angebotenesWorkshop;
	}

	public String getRefName() {
		return refName;
	}

	public String getRefEmail() {
		return refEmail;
	}

	public String getRefFirma() {
		return refFirma;
	}

	@Override
	public String toString() {
		return "Referent [" + getRefName() + ", " + getRefEmail() + ", "
				+ getRefFirma() + ", " + angebotenesWorkshop + "]";
	}

}
