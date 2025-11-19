import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        System.out.println("=== DERS TAKVİMİ ===");

        var matematik = new ders("Matematik", "Murat Aslan");
        var ingilizce = new ders("İngilizce", "Hülya Tekin");
        var edebiyat = new ders("Edebiyat", "Mustafa Tekin");

        matematik.setNotlar(66, 80);
        matematik.setOdev("2. tema sonunu bitir.");

        ingilizce.setNotlar(55, 65);
        ingilizce.setOdev("Verblerin tüm hallerini yaz.");

        edebiyat.setNotlar(84, 95);
        edebiyat.setOdev("Kitap özeti yaz.");

        var dersListesi = new ArrayList<ders>();
        dersListesi.add(matematik);
        dersListesi.add(ingilizce);
        dersListesi.add(edebiyat);

        System.out.println("\n--- DERS BİLGİLERİ ---\n");

        for (var ders : dersListesi) {
            ders.bilgileriGoster();
        }
    }
}