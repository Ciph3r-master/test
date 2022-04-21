package fr.cipher.test.algo;

import java.util.Random;

public class Algorithms {

    public Algorithms() {
    }


    public void displayAlphabet(){

        final String s = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i< s.length();i++) {
            System.out.print(s.toCharArray()[i]+" ");
        }

    }

    public void tablesMultiplication(int e){

        for(int n = 1; n<= e;n++) {

            for(int f = 1; f<= 10;f++){
                System.out.println(n+"x"+f+"="+(n*f));
            }

            System.out.println("----------------");

        }

    }

    public Integer factorielle(int n){

        int r = 1;

        for(int i = 2; i<=n;i++){
            r *= i;
        }

        return r;

    }

    public void getMultipleNumber(int n){

        Random rd = new Random();

        int r = 1;

        r = rd.nextInt(n+1)+1;

        while(n % r != 0){

            r = rd.nextInt(n+1)+1;
        }

        System.out.println(r);
    }
}
