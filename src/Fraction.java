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
    }
    public Fraction(){
        numerator = 1;
        denominator = 1;
    }
    //getters
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    //GCD method
    public int getGCD() {
    }
    //reduction method
    public void reduceFraction(){
    }
}
