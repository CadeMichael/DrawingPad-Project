/**
 * The Polygon class instantiates any arbitrary polygon of 3 points of more
 * @author Cade Lueker
 */
public class Polygon extends Shape{

 /** the rightmost x coordinate of the bounding rectangle*/
    private double bigX;
    /** the topmost y coordinate of the bounding rectangle*/
    private double bigY;
    /** the left most x coordinate of the bounding rectangle*/
    private double lilX;
    /** the bottom most y coordinate of the bounding rectangle*/
    private double lilY;

    /**
     * Constructor
     * @param p this is a variable amount of points that will act as if an array of Points
     * had been entered. they will become the corners of the polygon
     */
    public Polygon(Point ... p) {
         bigX = p[0].getX();
         bigY = p[0].getY();
        for (int i=1 ; i < p.length; i++) {
            if (bigX < p[i].getX()) {
                bigX = p[i].getX();
            }
            if (bigY < p[i].getY()) {
                bigY = p[i].getY();
            }
        }
         lilX = p[0].getX();
         lilY = p[0].getY();
        for (int i=1 ; i < p.length; i++) {
            if (lilX > p[i].getX()) {
                lilX = p[i].getX();
            }
            if (lilY > p[i].getY()) {
                lilY = p[i].getY();
            }
        }
        this.center = new Point((lilX + ((bigX-lilX)/2)), (lilY+((bigY-lilY)/2)));
        this.numpoints = p.length;
        this.points = new Point[numpoints];
        for(int i=0 ; i < numpoints; i++) {
            this.points[i] = p[i]; 
        }
        this.lines = new Line[numpoints];
        for (int i = 0; i < this.numpoints; i++) {
            if ((i+1) < this.numpoints) {
                Line l = new Line(points[i].getX(),points[i].getY(),points[i+1].getX(),points[i+1].getY());
                lines[i] = l;
            }
            else {
                Line l = new Line(points[i].getX(),points[i].getY(),points[0].getX(),points[0].getY());
                lines[i] = l;
            }
        }
    }
    
    /**
     * @param p is the array of points that becomes the points of the polygon
     */
    public void setPoints(Point[] p){
        this.points = p;
    }
    
    
    
}

