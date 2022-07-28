import java.util.Scanner;

public class MinveMax {
    public static void main(String[] args) {
        int adet, sayi, max=1, min=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz ?  ");
        adet = input.nextInt();

        for (int i = 1; i<=adet; i++){
            System.out.print(i+". Sayıyı Giriniz : ");
            sayi = input.nextInt();

            if (i==1){
                max = sayi;
                min = sayi;
            }
            if (sayi > max){
                max = sayi;
            } else if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("Max Değer : "+max);
        System.out.println("Min Değer : "+min);
    }
}
