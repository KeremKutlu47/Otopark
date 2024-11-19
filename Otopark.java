package DateTime.Otopark;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Otopark {
	
	private static List<Arac> araclar = new ArrayList<>();
	private static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	static List<Arac> aracList = new ArrayList<>();
	private static final DateTimeFormatter girisSaatFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	public Double ucretHesapla(LocalDateTime girisZamani, LocalDateTime cikisZamani) {
		
		long toplamSure = Duration.between(girisZamani, cikisZamani).toHours();
		
		if (toplamSure > 12) {
			return 273.0;
		}
		else if (toplamSure > 8) {
			return 181.0;
		}
		else if (toplamSure > 4) {
			return 135.0;
		}
		else if (toplamSure > 2) {
			return 98.0;
		}
		else if (toplamSure > 1) {
			return 90.0;
		}
		else if (toplamSure > 0) {
			return 70.0;
		}
		else {
			System.out.println("Geçersiz Saat");
			return 0.0;
		}
	}
	public void aracGiris(String plaka, LocalDateTime giris) {
		
		Arac arac = new Arac(plaka, giris);
		aracList.add(arac);
	}
	
	public void aracCikis(String plaka, LocalDateTime cikis) {
		for (Arac arac : aracList) {
			if (arac.getPlaka().equals(plaka) && arac.getCikisZamani() == null) {
				arac.setCikisZamani(cikis);
				double ucret = ucretHesapla(arac.getGirisZamani(), arac.getCikisZamani());
				arac.setUcret(ucret);
				System.out.println("arac" + plaka + "çıkış yaptı" + "ödenecek ücret" + ucret);
				break;
			}
		}
	}
		public void gunSonu (LocalDateTime gun){
			String dosyaAdi = "./" + gun.format(dateFormatter) + "Otopark.txt"; // Dosya ismini oluştur
			
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
				double toplamGelir = 0.0;
				for (Arac arac : aracList) {
					// Aracın çıkış tarihi, verilen gün ile aynı ise dosyaya yaz
					if (arac.getCikisZamani() != null && arac.getCikisZamani().toLocalDate()
					                                         .equals(gun.toLocalDate())) {
						writer.write("Plaka: " + arac.getPlaka() + ", Giriş: " + arac.getGirisZamani()
						                                                             .format(girisSaatFormat) + ", Çıkış: " + arac
								.getCikisZamani().format(girisSaatFormat) + ", Ücret: " + arac.getUcret() + " TL\n");
						toplamGelir += arac.getUcret();
					}
					else if (arac.getCikisZamani() == null) {
						writer.write("Plaka: " + arac.getPlaka() + ", Giriş: " + arac.getGirisZamani()
						                                                             .format(girisSaatFormat) + ", " +
								             "Ücret: " + " Henüz Çıkış Yapmadı TL\n");
						
					}
				}
				writer.write("Toplam Gelir: " + toplamGelir + " TL\n");
				System.out.println("Gün sonu raporu oluşturuldu: " + dosyaAdi);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}