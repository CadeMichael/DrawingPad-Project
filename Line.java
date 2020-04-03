/**
 * the Line class allows us to properly organize the points that makeup our shapes
 * @author Cade Lueker
 */
public class Line {
 
    /** the first point in the line segment */
    private Point startPoint;
    /** the last point in the line segment */
    private Point endPoint;
    
    //constructor takes 4 ints representing the coordinates of the points to makeup the initial line segment
    /**
     * Constructor
     * @param x1 is the x coordinate of the startPoint
     * @param y1 is the y coordinate of the startPoint
     * @param x2 is the x coordinate of the endPoint
     * @param y2 is the y coordinate of the endPoint
     */
    public Line (double x1,double y1, double x2, double y2){
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }
    
    // getter methods return the points that make up the line segment
    /**
     * @return the startPoint or first point in the segment
     */
    public Point getFirstPoint() {
        return this.startPoint;
    }
    
    /**
     * @return the endPoint or the second point in the segment
     */
    public Point getSecondPoint() {
        return this.endPoint;
    }
    

    /**
     * sets the first point in the segment
     * @param p the new startPoint
     */
    public void setFirstPoint(Point p){
        this.startPoint = p;
    }
    
    /**
     * sets the second point in the segment
     * @param p the new endPoint
     */
    public void setSecondPoint(Point p){
        this.endPoint = p;
    }
    
    /**
     * I overrode the toString method to make it easier to work with the points and lines
     * @return the string representation of the point
     */
    @Override 
    public String toString() {
        return "(" + this.getFirstPoint() + "," +this.getSecondPoint()+")";
    } 
    /**
     * this method makes and fills an array of the current Line
     * @return and array of type Line
     */
    public Line[] getLine() {
        Line[] a = new Line[1];
        a[0] = this;
        return a;
    }
}
