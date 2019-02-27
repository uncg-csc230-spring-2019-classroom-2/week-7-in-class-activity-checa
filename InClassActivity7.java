/*
 * 
 * 
 * 
 */
package inclassactivity7;

import java.util.Scanner;

public class InClassActivity7 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);

        System.out.print("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);

        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
        System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
        System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
        System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs2());
    }
}

class Complex implements Comparable<Complex>{
    private double a;
    private double b;
    
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public Complex(double a) {
        this.a = a;
        b = 0;
    }
    
    public Complex() {
        a = 0;
        b = 0;
    }
    
    public double getRealPart() {
        return a;
    }
    
    public double getImaginaryPart() {
        return b;
    }
    
    public Complex add(Complex c2) {
        double a2 = c2.getRealPart();
        double b2 = c2.getImaginaryPart();
        
        Complex c3 = new Complex(a + a2, b + b2);
        return c3;
    }
    
    public Complex subtract(Complex c2) {
        double a2 = c2.getRealPart();
        double b2 = c2.getImaginaryPart();
        
        Complex c3 = new Complex(a - a2, b - b2);
        return c3;
    }
    
    public Complex multiply(Complex c2) {
        double a2 = c2.getRealPart();
        double b2 = c2.getImaginaryPart();
        
        Complex c3 = new Complex(a * a2 - b * b2, b * a2 + a * b2);
        return c3;
    }
    
    public Complex divide(Complex c2) {
        double a2 = c2.getRealPart();
        double b2 = c2.getImaginaryPart();
  
        Complex c3 = new Complex((a * a2 + b * b2)/(Math.pow(a2, 2) + Math.pow(b2, 2)), (b * a2 - a * b2)/(Math.pow(a2, 2) + Math.pow(b2, 2)));
        return c3;
    }
    
    public Complex abs() {
        a = Math.sqrt(Math.pow(a, 2));
        b = Math.sqrt(Math.pow(b, 2));
        
        Complex c2 = new Complex(a, b);
        return c2;
    }
    
    public double abs2() {
        double c3 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c3;
    }
    
    public String toString() {
        if (b == 0) {
            return a + "";
        }
        
        return a + " + " + b + "i";
    }
    
    public Complex clone() {
        Complex c3 = new Complex(a, b);
        return c3;
    }
    
    public int compareTo(Complex o) {
        if((this.abs()).getRealPart() > (o.abs()).getRealPart()) {
            return 1;
        }
        else if((this.abs()).getRealPart() < (o.abs()).getRealPart()) {
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
