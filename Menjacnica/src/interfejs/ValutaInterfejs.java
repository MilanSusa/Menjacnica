package interfejs;

import java.util.GregorianCalendar;

import valuta.Kurs;

public interface ValutaInterfejs {

	public void dodajKursValuteNaOdredjeniDan(String nazivValute, Kurs kurs, GregorianCalendar naDan);

	public void obrisiKursValuteNaOdredjeniDan(String nazivValute, GregorianCalendar naDan);

	public Kurs vratiKursValuteNaOdredjeniDan(String nazivValute, GregorianCalendar naDan);

}
