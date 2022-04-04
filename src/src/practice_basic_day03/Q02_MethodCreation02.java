package src.practice_basic_day03;

import practice_basic_day03.Q01_MethodCreation01;

public class Q02_MethodCreation02 {
/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        birKereYazdir("aabbcccccddddaaa");
        Q01_MethodCreation01.hesapMakinesi('+',2,4);
    }

    private static void birKereYazdir(String str) {
        String sonuc="";
        for (int i=0;i<=str.length()-1;i++){  //int i=0;i<str.length();i++  bu sekilde de oluyor
            if(!sonuc.contains(str.substring(i,i+1))){ //tekrarsiz karakterleri dondurecegimiz sonucumuz, cumleden aldigimiz herhangi bir klarakteri icermiyorsa
            sonuc += str.substring(i,i+1); //o zaman sonuca ekleyebilirisniz
        }}
        System.out.println(sonuc);
    }


}
