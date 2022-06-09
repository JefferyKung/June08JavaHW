package test;

import java.util.Scanner;
import java.lang.Math;

public class excerise1 {
    public static void main(String[] args) {
        
        Integer inData;
        Scanner s = new Scanner(System.in);

        System.out.println("Input the radius:");
        inData = s.nextInt();
        
        double area = Math.PI*(inData*inData);
        System.out.println("The radius is: " + inData + " The area is "+ area);

        s.close();
    }
}
