package test;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        
        Integer inData;
        Scanner s = new Scanner(System.in);

        System.out.println("Input the cent:");
        inData = s.nextInt();
        
        int a = inData/100;
        int b = inData-(a*100);
        System.out.println("The value is "+ a +" dollars and "+b+" cents.");

        s.close();
    }
}
