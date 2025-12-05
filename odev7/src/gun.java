import java.util.ArrayList;
import java.util.List;

public class gun {
    private String gunAdi;
    private List<ders> dersler;

    public gun(String gunAdi) {
        this.gunAdi = gunAdi;
        this.dersler = new ArrayList<>(); // Hata olmaması için diamond operator <> kullanıldı
    }


    public void dersEkle(ders ders) {
        this.dersler.add(ders);
    }

    public void gunlukRaporGoster() {


        if (dersler.isEmpty()) {
            System.out.println("Bu gün ders veya not bilgisi bulunmamaktadır.");
            return;
        }

        for (var ders : dersler) {
            ders.bilgileriGoster();
        }
    }
}