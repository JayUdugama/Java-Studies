package com.jayani;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int count = 0;

        while(num>0){

            int remain = num%10;
            if(remain == 3){
                count++;
            }
            num = num/10;

        }
        System.out.println(count);
    }
}
