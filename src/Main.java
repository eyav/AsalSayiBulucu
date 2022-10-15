import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,i,total;

        Scanner input = new Scanner(System.in);
        System.out.println("Asal olup olmadığını kontrol etmek istediğiniz sayiyi giriniz:");
        a = input.nextInt();
        total=0;
        if(a <= 100){
            for(i=1; i<=a; i++ ){
                if(a%i == 0 && a!=1) {
                    total = total + i;
                }

                }
            if(total == a+1){
                System.out.println(a + " sayisi asal bir sayidir.");
            }else{
                System.out.println(a + " Sayisi bir sayi değildir.");
            }

            }else{
            System.out.println("100'den kucuk bir sayi giriniz.");
        }




    }
}
