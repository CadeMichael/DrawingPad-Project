/**
 * the NGon class represents a regular polygon with n number of sides of a given length
 * @author Cade Lueker
 */
public class NGon extends Shape {
 
    /** the radius of the NGon */
    private double radius;
    /** the length of each side */
    private double sideLength;
    /** the number of sides */
    private int numSides;
    /** the value of pi */
    private double pi = 3.14159265358979; 
    
    /**
     * Constructor 
     * @param C the point that will become the center of the NGon
     * @param numSides the number of sides the NGon will have
     * @param sideLength the length of each side of the NGon
     */
    public NGon(Point C, int numSides, double sideLength){
        this.points = new Point[numSides];
        this.center = C;
        this.sideLength = sideLength;
        this.numSides = numSides;
        this.numpoints = numSides;
        this.setSideLength(sideLength);
        this.radius = sideLength / (2*Math.sin((pi/numSides)));
        Point next = new Point(C.getX(),C.getY()+radius);
        for(int i = 0; i < numSides; i ++) {
            if (i > 0) {
                next.rotateAbout(C, ((2*pi)/numSides));
                this.points[i] = new Point(next.getX(),next.getY());
            }
            else {this.points[0] = new Point(next.getX(),next.getY());}
        }
        
        this.resetLines();
    }
    
    /**
     * @return the number of sides
     */
    public int getNumSides(){
        return this.numSides;
    }
    
    /**
     * @return the length of one side
     */
    public double getSideLength(){
        return this.sideLength;
    }
    
    /**
     * this method changes the length of each side and therefore must set new points for the resulting NGon
     * @param sideLength that the transformed NGon will have
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        this.radius = sideLength / (2*Math.sin((pi/numSides)));
        Point next = new Point(this.getCenter().getX(),this.getCenter().getY()+radius);
        //this.points[0] = new Point(next.getX(),next.getY());
        for(int i = 0; i < numSides; i ++) {
            if (i > 0) {
                next.rotateAbout(this.getCenter(), ((2*pi)/numSides));
                this.points[i] = new Point(next.getX(),next.getY());
                //System.out.print(next);
            }
            else {this.points[0] = new Point(next.getX(),next.getY());}
        }
        this.resetLines();
    }
}
