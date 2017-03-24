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
		if (prodajni <= 0) {
			throw new RuntimeException("Prodajni kurs ne sme biti nula ili manji");
		}
		this.prodajni = prodajni;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		if (kupovni <= 0) {
			throw new RuntimeException("Kupovni kurs ne sme biti nula ili manji");
		}
		this.kupovni = kupovni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		if (srednji <= 0) {
			throw new RuntimeException("Srednji kurs ne sme biti nula ili manji");
		}
		this.srednji = srednji;
	}

	public GregorianCalendar getNaDan() {
		return naDan;
	}

	public void setNaDan(GregorianCalendar naDan) {
		if (naDan == null) {
			throw new RuntimeException("Datum kursa ne sme biti null");
		}
		this.naDan = naDan;
	}

}
