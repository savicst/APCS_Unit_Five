public class CarTrip {
    private int myStartOdometer;
    private int myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

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
//mutators
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

//other methods
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
      //need to round to hundredths
        return (myGallonsUsed * pricePerGallon);
    }

}
