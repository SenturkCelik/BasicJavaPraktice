package day22_Arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        // verilenbir array deen kucuk ve en buyukdegerleri yazdirin

        int arr[]={3,5,6,1,8,9,22,34,0,};

        terstenSiralaYazdir(arr);

        
        

        
    }

    public static void terstenSiralaYazdir(int[] arr) {

        Arrays.sort(arr); //
        System.out.println(arr);
        
        int tersArr[]=new int[arr.length];
        
        for(int i=0; i<arr.length;i++){
            tersArr[i]=arr[arr.length-1-i];
            System.out.println(Arrays.toString(tersArr));
        }
        



    }
}
