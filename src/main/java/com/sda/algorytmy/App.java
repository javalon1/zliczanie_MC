package com.sda.algorytmy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] a = {4, 1, 6, 1, 1, 4, 3, 3, 1};

        System.out.println("Liczba wystapien wartosci x: " + wystapienie(a));

    }public static int wystapienie (int[] a){
        int x = 1;
        int wynik = 0;

        for(int i=0; i<a.length; i++){
            if(x==a[i]){
                wynik = wynik + 1;
            }
        }return wynik;
    }
}
