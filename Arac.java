package DateTime.Otopark;


import java.time.LocalDateTime;

public class Arac {
	
	private String plaka;
	private LocalDateTime girisZamani;
	private LocalDateTime cikisZamani;
	private Double ucret;
	
	public Arac(String plaka, LocalDateTime girisZamani) {
		this.plaka = plaka;
		this.girisZamani = girisZamani;
	}
	
	@Override
	public String toString() {
		return "Arac{" + "plaka='" + plaka + '\'' + ", girisZamani=" + girisZamani + ", cikisZamani=" + cikisZamani + ", ucret=" + ucret + '}';
	}
	
	public String getPlaka() {
		return plaka;
	}
	
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	
	public LocalDateTime getGirisZamani() {
		return girisZamani;
	}
	
	public void setGirisZamani(LocalDateTime girisZamani) {
		this.girisZamani = girisZamani;
	}
	
	public LocalDateTime getCikisZamani() {
		return cikisZamani;
	}
	
	public void setCikisZamani(LocalDateTime cikisZamani) {
		this.cikisZamani = cikisZamani;
	}
	
	public Double getUcret() {
		return ucret;
	}
	
	public void setUcret(Double ucret) {
		this.ucret = ucret;
	}
}