package test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.ValutaInterfejs;
import valuta.Kurs;
import valuta.Valuta;

public class TestMenjacnice implements ValutaInterfejs {

	LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void dodajKursValuteNaOdredjeniDan(String nazivValute, Kurs kurs, GregorianCalendar naDan) {

		for (int i = 0; i < valute.size(); i++) {
			Valuta valuta = valute.get(i);
			if (valuta.getNaziv().equals(nazivValute)) {
				LinkedList<Kurs> kursevi = valuta.getKursevi();
				for (int j = 0; j < kursevi.size(); j++) {
					if (kursevi.get(j).getNaDan().equals(naDan)) {
						System.out.println("Kurs za dati dan vec postoji");
					}
				}
				valuta.getKursevi().add(kurs);
				break;
			}
		}
	}

	@Override
	public void obrisiKursValuteNaOdredjeniDan(String nazivValute, GregorianCalendar naDan) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vratiKursValuteNaOdredjeniDan(String nazivValute, GregorianCalendar naDan) {
		// TODO Auto-generated method stub
		return null;
	}

}
