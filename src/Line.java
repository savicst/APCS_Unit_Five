class Line {
    //instance variables
    private int a;
    private int b;
    private int c;
    //constructor
    public Line (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //calculate slope
    public double getSlope(){
        return ((double)-a/b);
    }
    //is the point on the line?
    public boolean isOnLine(int x, int y){
        return (((a*x) + (b*y) + c) == 0);
    }
    //are two lines parallel?
    public boolean isParallel(Line other){
        return (((double)-a/b) == other.getSlope());
    }
    //equation of the line
    public String toString(){
        return a + "x + " + b + "y + " + c + " = 0";
    }
}
