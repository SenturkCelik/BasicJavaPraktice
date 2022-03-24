package practice_basic_day03;

import java.util.Scanner;

public class Q15_DoWhileLoop01 {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

    public static void main(String[] args) {
        char harf;
        do {
            System.out.println("Program calisiyor \nbitirmek icin x'e basin");
            Scanner scan = new Scanner(System.in);
            harf = scan.next().charAt(0);
            if (harf == 'x') {
                System.out.println("Program bitti");
            }
        }while (harf != 'x');





        }
    }






















