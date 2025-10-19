import java.util.Scanner;
class  Odev2{
void main(String[] args) {
    Scanner input = new
            Scanner(System.in);
    System.out.println("Adınızı giriniz.");

    String isim =
            input.nextLine();

    System.out.println("İlk sınav notunuzu giriniz!");

    int sinav1=input.nextInt();

            System.out.println("İkinci sınav notunuzu giriniz!");

    int sinav2= input.nextInt();
    input.nextLine();
    int etki1=(int) ((double)sinav1*0.4);
    int etki2=(int) ((double)sinav2*0.6);
    int ortalama=(int) etki1 + etki2;
    int baraj= 50;

    if(ortalama>=baraj){
        System.out.println("Tebrikler,dersi geçtiniz!");
    } else {
        System.out.println("Üzgünüm,dersten kaldınız!");
    }

    System.out.println("Bir cümle veya metin giriniz.");

    String metin =
            input.nextLine();

    System.out.println("Şifrenizi giriniz!");

    String sifre =
            input.nextLine();
    if (sifre.equals("ruhi123")){
        System.out.println("Şifre doğru,giriş başarılı!");
    } else {
        System.out.println("Şifre yanlış,giriş başarısız!");
    }


    if (metin.contains("elma")){
        System.out.println("Metnin elma kelimesini içeriyor!");
    } else {
        System.out.println("Metnin elma kelimesini içermiyor.");
    }


    System.out.println("İsminiz büyük harfler ile "+ isim.toUpperCase());
    System.out.println("İsminiz küçük harfler ile "+ isim.toLowerCase());
    System.out.println("İsminizin ilk harfi "+ isim.charAt(0));
    System.out.println("Metninizin uzunluğu "+ metin.length() + " karakter");


}

}
