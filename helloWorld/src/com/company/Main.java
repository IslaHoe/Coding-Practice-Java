package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int i = 0;
        while(i < 10){
            i++;
            if(i == 4) {
                System.out.println("here");
                continue;
            }
        System.out.println(i);
        }
    }
}
