import java.util.Random;
class Odev6{

    public static void siniflaranotver(int[] sinifDizisi) {
        Random rastgele = new Random();

        for (int i = 0; i < sinifDizisi.length; i++) {
            sinifDizisi[i] = rastgele.nextInt(100);
        }
    }

    public static void notlariyazdir(String dersAdi, int[] sinifDizisi) {
        System.out.print(dersAdi + " dersi notları: ");

        for (int i = 0; i < sinifDizisi.length; i++) {
            System.out.print(sinifDizisi[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] matematikSinifi = new int[10];
        int[] fizikSinifi = new int[10];
        int[] tarihSinifi = new int[10];

        siniflaranotver(matematikSinifi);
        siniflaranotver(fizikSinifi);
        siniflaranotver(tarihSinifi);

        System.out.println("Tüm derslerin notları verildi");

        notlariyazdir("Matematik", matematikSinifi);
        notlariyazdir("Fizik", fizikSinifi);
        notlariyazdir("Tarih", tarihSinifi);
    }
}
