package tr.edu.medipol.yazilimaraclari.ders7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinİslemleriTest {

	@Test
	public void testBuyukHarfeCevir() {
		
		String ornek = "Merhaba Arkadaslar";
		
		String sonuc = Metinİslemleri.buyukHarfeCevir(ornek);
		
		assertEquals("MERHABA ARKADASLAR",sonuc);
	}

}
