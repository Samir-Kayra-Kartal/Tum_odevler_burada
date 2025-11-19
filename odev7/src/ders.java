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
            System.out.println("Hata: Notlar 0 ile 100 arasında olmalıdır.");
        }
    }

    public void bilgileriGoster() {
        System.out.println("-----------------------------");
        System.out.println("DERS: " + dersAdi);
        System.out.println("Öğretmen: " + ogretmenAdi);
        System.out.println("Ödev Durumu: " + odev);
        System.out.println("Yazılı Notu: " + (yaziliNotu == 0 ? "Girilmedi" : yaziliNotu));
        System.out.println("Sözlü Notu:  " + (sozluNotu == 0 ? "Girilmedi" : sozluNotu));

        if (yaziliNotu > 0 && sozluNotu > 0) {
            double ortalama = (yaziliNotu + sozluNotu) / 2.0;
            System.out.println("Ortalama: " + ortalama);
        }
        System.out.println("-----------------------------");
    }

    public String getDersAdi() {
        return dersAdi;
    }
}