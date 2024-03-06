import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin Basamak Sayısını giriniz :");
        int star = input.nextInt();

        // 0 dan basamak sayısına kadar 1'er arttır ve boşluk ekle
        for (int i = star; i > 0; i--) {
            for (int j =star+1;j>i;j--){
                System.out.print(" ");
            }
            //basamak sayısından 1'e kadar azalarak yıldız yazdır
            for (int k = 0; k<(i*2-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}