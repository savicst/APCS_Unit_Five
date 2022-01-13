public class Truck {
    //instance variables
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    //constant
    private final double CAPACITY = 20.0;
    //static variable
    private static double totalFuel;
    //constructors
    public Truck(String initTruckID){
        truckID = initTruckID;
        odometer = 0.0;
        mpg = 0.0;
        fuel = 0.0;
    }
    public Truck(String initID, double initOdo, double initMpg, double initFuel){
        truckID = initID;
        odometer = initOdo;
        mpg = initMpg;
        fuel = initFuel;
    }
    //getters
    public String getTruckID(){
        return truckID;
    }
    public double getOdometer(){
        return odometer;
    }
    public double getMpg(){
        return mpg;
    }
    public double getFuel(){
        return fuel;
    }
    //setter
    public void setMpg(double newMpg){
        mpg = newMpg;
    }
    //is there enough fuel for this trip?
    public boolean enoughFuel(double miles){
        return (miles/mpg <= CAPACITY);
    }
    //drive method reduces fuel, increases odometer and lets you know if you made it to your destination
    public int drive(double miles){
        if (enoughFuel(miles)) {
            odometer += miles;
            fuel -= (miles / mpg);
            return 1;
        }
        else return 0;
        }
    //fill methods
    public void fill(){
        totalFuel += (CAPACITY-fuel);
        fuel = CAPACITY;
    }
    public int fill(double gallons){

    }


}

