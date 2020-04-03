/**
 * Shape is an abstract class that is extended by all of the shapes that we use in DrawingPad
 * it holds all of their common feild's and methods
 * @author Cade Lueker
 */
public abstract class Shape{
    
    /** the points of the shape*/
    protected Point[] points;
    /** the center of the shape*/
    protected Point center;
    /** the lines of the shape*/
    protected Line[] lines;
    /** the number of points in the shape*/
    protected int numpoints;
    
    public Shape () {
        
    }
    /**
     *@return the points of the shape 
     */
    public Point[] getPoints() {
        return this.points;
    }
    /**
     * @return the lines of the shape
     */
    public Line[] getLines() {
        return this.lines;
    }
    /**
     * @return the center of the shape
     */
    public Point getCenter() {
        return this.center;
    }
    /**
     * Whenever points are changed the lines must be changed accordingly, this method
     * runs through the points and re-makes the line array
     */
    public void resetLines() {
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
     * this method rotates all of the points in the shape about their center a given number of radians
     * @param angle the number of radians each point is rotated
     */
    public void rotate(double angle) {
        for (int i = 0; i < this.numpoints; i++){
            this.points[i].rotateAbout(this.getCenter(), angle);
        }
        this.resetLines();
    }
    
    /**
     * this method sets the center and readjusts the points and lines accordingly
     * @param p the new center of the shape
     */
    public void setCenter(Point p) {
        for(int i = 0; i < numpoints; i++) {
            points[i].setX(points[i].getX()+(p.getX()-this.getCenter().getX()));
            points[i].setY(points[i].getY()+(p.getY()-this.getCenter().getY()));
        }
        this.center = p;
        this.resetLines();
    }
    
    /**
     * this method simply tells us the number of points in the shape
     * @return the number of Points in the shape
     */
    public int getNumPoints() {
        return this.numpoints;
    }
}