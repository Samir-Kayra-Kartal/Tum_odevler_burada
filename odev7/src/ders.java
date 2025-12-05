public class ders {

    private String dersAdi;
    private String ogretmenAdi;
    private String odev;
    private int sozluNotu;
    private int yaziliNotu;


    public ders(String dersAdi, String ogretmenAdi) {
        this.dersAdi = dersAdi;
        this.ogretmenAdi = ogretmenAdi;
        this.odev = "Ödev Yok";
        this.sozluNotu = 0;
        this.yaziliNotu = 0;
    }


    public void setOdev(String odev) {
        this.odev = odev;
    }

    public void setNotlar(int yazili, int sozlu) {
        if (yazili >= 0 && yazili <= 100 && sozlu >= 0 && sozlu <= 100) {
            this.yaziliNotu = yazili;
            this.sozluNotu = sozlu;
        } else {
            System.out.println("HATA: " + dersAdi + " için notlar 0-100 aralığında değil.");
        }
    }


    public void bilgileriGoster() {
        double ortalama = (yaziliNotu + sozluNotu) / 2.0;

        var durum = (ortalama >= 50) ? "GEÇTİ" : "KALDI";
        var durumMetni = (yaziliNotu == 0 || sozluNotu == 0) ? "Notlar Eksik" : durum;

        System.out.println("  - - - - - - - - - - - - - - - -");
        System.out.println("  Ders: " + dersAdi);
        System.out.println("  Öğretmen: " + ogretmenAdi);
        System.out.println("  Ödev: " + odev);
        System.out.println("  Yazılı/Sözlü Notu: " + yaziliNotu + " / " + sozluNotu);
        System.out.println("  Ortalama: " + ortalama + " | Durum: " + durumMetni);
    }
}