public class CarTripDriver {
    public static void main(String[] args){
        //default object
        CarTrip a = new CarTrip();
        //object with parameters
        CarTrip b = new CarTrip(5,120,2.3, 9.4);
        //method calls
        System.out.println(b.getTripDistance());
        System.out.println(b.getAverageSpeed());
        System.out.println(b.getGasMileage());
        System.out.println(b.getTotalGasPrice(3.4));
        System.out.println(b.toString());
    }

}
