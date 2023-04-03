 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            System.out.println("Sayı giriniz : ");
    int number = scanner.nextInt();
    int toplam = 0;
    System.out.println(number);
    for (int k=2; k <number;k++){
        if (number%k == 0 ){

        toplam +=k + (number/k);

        }
    }if((toplam/2)+1 == number ){
            System.out.println("mukemmel sayıdır");

        }else {System.out.println("mukemmel sayı değildir");}
    }
}