package test;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import interfejs.ValutaInterfejs;
import valuta.Kurs;
import valuta.Valuta;

public class TestMenjacnice implements ValutaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void dodajKursValuteNaOdredjeniDan(String nazivValute, Kurs kurs, GregorianCalendar naDan) {
		for (int i = 0; i < valute.size(); i++) {
			Valuta valuta = valute.get(i);
			if (valuta.getNaziv().equals(nazivValute)) {
				LinkedList<Kurs> kursevi = valuta.getKursevi();
				for (int j = 0; j < kursevi.size(); j++) {
					if (kursevi.get(j).getNaDan().equals(naDan)) {
						throw new RuntimeException("Kurs za dati dan vec postoji");
					}
				}
				valuta.getKursevi().add(kurs);
				return;
			}
		}
	}

	@Override
	public void obrisiKursValuteNaOdredjeniDan(String nazivValute, Kurs kurs, GregorianCalendar naDan) {
		for (int i = 0; i < valute.size(); i++) {
			Valuta valuta = valute.get(i);
			if (valuta.getNaziv().equals(nazivValute)) {
				LinkedList<Kurs> kursevi = valuta.getKursevi();
				for (int j = 0; j < kursevi.size(); j++) {
					if (kursevi.get(j).getNaDan().equals(naDan)) {
						valuta.getKursevi().remove(j);
						return;
					}
				}
			}
		}
	}

	@Override
	public Kurs vratiKursValuteNaOdredjeniDan(String nazivValute, GregorianCalendar naDan) {
		for (int i = 0; i < valute.size(); i++) {
			Valuta valuta = valute.get(i);
			if (valuta.getNaziv().equals(nazivValute)) {
				LinkedList<Kurs> kursevi = valuta.getKursevi();
				for (int j = 0; j < kursevi.size(); j++) {
					if (kursevi.get(j).getNaDan().equals(naDan)) {
						return valuta.getKursevi().get(j);
					}
				}
			}
		}
		throw new RuntimeException("Ne postoji kurs sa datim datumom");
	}

}
