import java.sql.SQLOutput;

public class FractionDriver {

    public static void main(String[] args){
        //default object
        Fraction a = new Fraction();
        //objects with parameters
        Fraction b = new Fraction(8,1);
        Fraction c = new Fraction(4,8);
        Fraction d = new Fraction(105, 252);
        Fraction e = new Fraction(252, 105);
        Fraction f = new Fraction(8,4);
        Fraction g = new Fraction(9,-3);
        Fraction h = new Fraction(-2,-3);
        Fraction i = new Fraction(-2,3);
        //just print them all I guess
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        //methodical methods
        System.out.println(Fraction.add(a,b));
        System.out.println(Fraction.subtract(a,b));
        System.out.println(Fraction.multiply(a,b));
        System.out.println(Fraction.divide(a,b));

    }
}
