public class Fraction {
    //instance variables
    private int numerator;
    private int denominator;

    //constructors
    public Fraction(int num, int den){
        if ((num<0 && den<0)||(num>0 && den<0)){
            numerator = -num;
            denominator = -den;
        }
        else{
            numerator = num;
            denominator = den;
        }
        int gcd = getGCD(numerator, denominator);
        reduceFraction(gcd);
    }
    public Fraction(){
        numerator = 1;
        denominator = 1;
    }

    //getters
    public int getNumerator(){return numerator;}
    public int getDenominator() {
        return denominator;
    }

    //GCD method
    public int getGCD(int m, int n) {
        while (m%n != 0){
            int temp = m;
            int tempn = n;
            m = n;
            n = temp % tempn;
        }
        return Math.abs(n);
    }

    //reduction method
    public void reduceFraction(int gcd){
        numerator /= gcd;
        denominator /= gcd;
    }

   //the methodical methods
    public static Fraction add(Fraction a, Fraction b){
        int newNumerator = a.numerator + b.numerator;
        int newDenominator = a.denominator + b.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    //!!! thats not how this works i dont think just check hold on idk maybe youre right
    public static Fraction subtract(Fraction a, Fraction b){
        int newNumerator = a.numerator - b.numerator;
        int newDenominator = a.denominator - b.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public static Fraction multiply(Fraction a, Fraction b){
        int newNumerator = a.numerator * b.numerator;
        int newDenominator = a.denominator * b.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public static Fraction divide(Fraction a, Fraction b){
        int newNumerator = a.numerator * b.denominator;
        int newDenominator = a.denominator * b.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    //toString method -should change to account for whole numbers
    public String toString(){
        if (Math.abs(numerator) >denominator){
            int wholeNum = numerator/denominator;
            int newNumerator = numerator%denominator;
            if (numerator<0){
                return wholeNum + " " + Math.abs(newNumerator) + "/" + denominator;
            }
            else{
                return wholeNum + " " + newNumerator + "/" + denominator;
            }
        }
        else{
            return numerator + "/" + denominator;
        }
    }

}
