import java.util.Random;
import java.util.Arrays;
 void main() {

     int[] sayilar=new int[50];
     Random rastgele = new Random();
     for (int i=0; i<50; i++) {
         sayilar[i]=
                 rastgele.nextInt(1000);
     }
     Arrays.sort(sayilar);
     for (int i=0; i<sayilar.length; i++){
         System.out.println(sayilar[i]);
     }
}
