package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double x,y=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        x = in.nextInt();
        y = in.nextInt();
        if(x==y)
        {System.out.println("Error");}
        else
        {System.out.println("Первое чило:" + ((x<y)? (double)(x+y)/2:(double)(x*y)*2));
            System.out.println("Первое чило:" +( (x>y)? (double)(x+y)/2:(double)(x*y)*2));


        }

    }
}
