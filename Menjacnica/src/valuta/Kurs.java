package valuta;

import java.util.GregorianCalendar;

public class Kurs {

	private double prodajni;
	private double kupovni;
	private double srednji;
	private GregorianCalendar naDan;

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}

	public GregorianCalendar getNaDan() {
		return naDan;
	}

	public void setNaDan(GregorianCalendar naDan) {
		this.naDan = naDan;
	}

}
