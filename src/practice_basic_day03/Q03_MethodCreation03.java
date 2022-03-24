package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        double cm=scan.nextDouble();
        System.out.println(" cm=" +cm/100+  " metre dir");
        System.out.println(" cm=" +cm/1000+  " kilometre dir");



    }
}
