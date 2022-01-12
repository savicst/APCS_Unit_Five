public class CarTrip {
    private int myStartOdometer;
    private int myEndOdometer;
    private double myTime;
    private double myGallonsUsed;
//constructors
    public CarTrip(int x, int y, double z, double zz){
        myStartOdometer = x;
        myEndOdometer = y;
        myTime = z;
        myGallonsUsed = zz;
    }

    public CarTrip(){
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0;
        myGallonsUsed = 0;
    }
//getters
    public int getMyStartOdometer() {
        return myStartOdometer;
    }
    public int getMyEndOdometer() {
        return myEndOdometer;
    }
    public double getMyTime() {
        return myTime;
    }
    public double getMyGallonsUsed(){
        return myGallonsUsed;
    }
//setters
    public void setMyStartOdometer(int newMyStartOdometer){
        myStartOdometer = newMyStartOdometer;
    }
    public void setMyEndOdometer(int newMyEndOdometer){
        myEndOdometer = newMyEndOdometer;
    }
    public void setMyTime(double newMyTime){
        myTime= newMyTime;
    }
    public void setMyGallonsUsed(double newMyGallonsUsed){
        myGallonsUsed = newMyGallonsUsed;
    }

//calculationy methods
    public int getTripDistance(){
        return (myEndOdometer-myStartOdometer);
    }

    public double getAverageSpeed(){
        return (getTripDistance() / myTime);
    }

    public double getGasMileage(){
        return (getTripDistance() / myGallonsUsed);
    }
    public double getTotalGasPrice(double pricePerGallon){
      double a = myGallonsUsed * pricePerGallon;
        a*=100;
        a+=.5;
        a = (int)a;
        a/=100;
        return (a);
    }

// to String method
    public String toString(){
        return "Distance traveled: " + getTripDistance() + " miles Avg. Speed: " + getAverageSpeed() + " mph Gas Mileage: " + getGasMileage() + " mpg" ;
    }
}
