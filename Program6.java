//import stuff here!
import java.util.Scanner;
//Your code here
public class Circle{
    public static void main(String[] args){
        Scanner circle = new Scanner(System.in);
        final double pi=3.14159;
        
        System.out.print("Enter radius: ");
        double r = circle.nextDouble();
        double d = r*2;
        
        double a=pi*r*r;
        double c=pi*d;
        


        System.out.println("Radius = "+r);
        System.out.println("Diameter = "+d);
        System.out.printf("Area = %.3f ",a);
        System.out.println();
        System.out.printf("Circumference = %.3f ",c);
        
        
        
        
    }
    
}
//Paste console output below:
/*
Enter radius: 3.712
Radius = 3.712
Diameter = 7.424
Area = 43.288 
Circumference = 23.323 

*/
