package tr.edu.medipol.yazilimaraclari.ders7;

public class Metinİslemleri {

	public static void main(String[] args) {
		
		String ornek1 = "Merhaba Arkadaşlar";
		String sonuc1 = Metinİslemleri.buyukHarfeCevir(ornek1);
		System.out.println(ornek1 + "-> "+ sonuc1);

		

		
	}
	static String buyukHarfeCevir(String orjinalMetin) {
		if(orjinalMetin == null) {
			
		return orjinalMetin.toUpperCase();
		
	}
	return orjinalMetin.toUpperCase();
}

}
