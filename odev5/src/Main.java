import java.util.Random;
void main() {

    int[] sayilar = new int[50];
    Random rastgele = new Random();

    for (int i = 0; i < 50; i++) {
        sayilar[i] = rastgele.nextInt(1000);
    }

    int n = sayilar.length;
    int temp;
    for (int i = 0; i < n - 1; i++) {

        for (int j = 0; j < n - i - 1; j++) {

            if (sayilar[j] > sayilar[j + 1]) {
                temp = sayilar[j];
                sayilar[j] = sayilar[j + 1];
                sayilar[j + 1] = temp;
            }
        }
    }

    System.out.println("Küçükten büyüğe sıralanmış sayılar:");
    for (int i = 0; i < sayilar.length; i++) {
        System.out.println(sayilar[i]);
    }
}