import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("HAFTALIK DERS TAKVİMİ RAPORU");

        var matematik = new ders("Matematik (9:00)", "Ayşe Yılmaz");
        matematik.setNotlar(90, 85);
        matematik.setOdev("Sayfa 45, 10. sorunun çözümü.");

        var fizik = new ders("Fizik (10:00)", "Ahmet Can");
        fizik.setNotlar(55, 65);
        fizik.setOdev("Einstein raporu.");

        var turkce = new ders("Türkçe (14:00)", "Zeynep Demir");
        turkce.setNotlar(100, 98);
        turkce.setOdev("Kitap özeti yazılacak.");

        var kimya = new ders("Kimya (11:00)", "Burak Sönmez");
        kimya.setNotlar(75, 80);

        var ingilizce = new ders("İngilizce (13:00)", "Serap Kurt");
        ingilizce.setNotlar(95, 95);
        ingilizce.setOdev("Yok");

        var tarih = new ders("Tarih (15:00)", "Mehmet Özer");
        tarih.setNotlar(40, 45);

        var pazartesi = new gun("Pazartesi");
        pazartesi.dersEkle(matematik);
        pazartesi.dersEkle(fizik);

        var sali = new gun("Salı");
        sali.dersEkle(kimya);
        sali.dersEkle(ingilizce);

        var carsamba = new gun("Çarşamba");
        carsamba.dersEkle(turkce);

        var persembe = new gun("Perşembe");
        persembe.dersEkle(tarih);

        var cuma = new gun("Cuma");


        var takvim = new ArrayList<gun>();
        takvim.add(pazartesi);
        takvim.add(sali);
        takvim.add(carsamba);
        takvim.add(persembe);
        takvim.add(cuma);

        System.out.println("HAFTALIK DERS PROGRAMI RAPORU");


        for (var gun : takvim) {
            gun.gunlukRaporGoster();
        }

        System.out.println("RAPOR SONU");
    }
}