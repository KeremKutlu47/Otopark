package DateTime.Otopark;

import java.time.LocalDateTime;


public class Runner {
	public static void main(String[] args) {
		Otopark otopark = new Otopark();
		
		// 15 Kasım 2024 tarihli araç giriş ve çıkışları
		otopark.aracGiris("34ABC123", LocalDateTime.of(2024, 11, 15, 8, 30));
		otopark.aracGiris("35XYZ456", LocalDateTime.of(2024, 11, 15, 9, 0));
		otopark.aracCikis("34ABC123", LocalDateTime.of(2024, 11, 15, 12, 45));
		otopark.aracCikis("35XYZ456", LocalDateTime.of(2024, 11, 15, 11, 15));
		
		// 16 Kasım 2024 tarihli araç giriş ve çıkışları
		otopark.aracGiris("06DEF789", LocalDateTime.of(2024, 11, 16, 7, 45));
		otopark.aracGiris("07GHI012", LocalDateTime.of(2024, 11, 16, 10, 15));
		otopark.aracCikis("06DEF789", LocalDateTime.of(2024, 11, 16, 15, 0));
		otopark.aracCikis("07GHI012", LocalDateTime.of(2024, 11, 16, 12, 0));
		
		// 17 Kasım 2024 tarihli araç giriş ve çıkışları
		otopark.aracGiris("08JKL345", LocalDateTime.of(2024, 11, 17, 6, 30));
		otopark.aracGiris("09MNO678", LocalDateTime.of(2024, 11, 17, 8, 45));
		otopark.aracCikis("08JKL345", LocalDateTime.of(2024, 11, 17, 18, 0));
		otopark.aracCikis("09MNO678", LocalDateTime.of(2024, 11, 17, 14, 15));
		
		// 18 Kasım 2024 tarihli araç giriş ve çıkışları
		otopark.aracGiris("10PQR901", LocalDateTime.of(2024, 11, 18, 9, 30));
		otopark.aracGiris("11STU234", LocalDateTime.of(2024, 11, 18, 11, 15));
		otopark.aracCikis("10PQR901", LocalDateTime.of(2024, 11, 18, 13, 30));
		otopark.aracCikis("11STU234", LocalDateTime.of(2024, 11, 18, 16, 0));
		
		// 19 Kasım 2024 tarihli araç giriş ve çıkışları
		otopark.aracGiris("12VWX567", LocalDateTime.of(2024, 11, 19, 10, 30));
		otopark.aracGiris("13YZA890", LocalDateTime.of(2024, 11, 19, 12, 0));
		otopark.aracCikis("12VWX567", LocalDateTime.of(2024, 11, 19, 15, 45));
		// 20 Kasım 2024 tarihli araç giriş ve çıkışları
		otopark.aracGiris("14BCD123", LocalDateTime.of(2024, 11, 20, 8, 0));
		otopark.aracGiris("15EFG456", LocalDateTime.of(2024, 11, 20, 9, 30));
		otopark.aracCikis("14BCD123", LocalDateTime.of(2024, 11, 20, 18, 30));
		
		// 21 Kasım 2024 tarihli araç giriş ve çıkışları
		otopark.aracGiris("16HIJ789", LocalDateTime.of(2024, 11, 21, 7, 0));
		otopark.aracGiris("99KLM012", LocalDateTime.of(2024, 11, 21, 14, 30));
		otopark.aracGiris("17KLM012", LocalDateTime.of(2024, 11, 21, 18, 0));
		otopark.aracCikis("16HIJ789", LocalDateTime.of(2024, 11, 21, 10, 45));
		otopark.aracCikis("17KLM012", LocalDateTime.of(2024, 11, 21, 18, 0));
		
		// Gün sonu raporunu oluştur
		otopark.gunSonu(LocalDateTime.of(2024, 11, 15, 0, 0));
		otopark.gunSonu(LocalDateTime.of(2024, 11, 16, 0, 0));
		otopark.gunSonu(LocalDateTime.of(2024, 11, 17, 0, 0));
		otopark.gunSonu(LocalDateTime.of(2024, 11, 18, 0, 0));
		otopark.gunSonu(LocalDateTime.of(2024, 11, 19, 0, 0));
		otopark.gunSonu(LocalDateTime.of(2024, 11, 20, 0, 0));
		otopark.gunSonu(LocalDateTime.of(2024, 11, 21, 0, 0));
	}
	
}