/**
 * Square extends rectangle and has almost exactly the same behaviors and all of the same methods
 * @author Cade Lueker
 */

public class Square extends Rectangle {
    
	/**
     *Constructor
     *@param p the center of the square
     *@param x the length of the sides of the square 
     */
    public Square(Point p, double x) {
        super(p,x,x);
    }
    
    /**
     *this method sets a new side length for the square by calling the super.setHeight and 
     *setWidth with the same value
     *@param x the new side length 
     */
    public void setWidth(double x) {
        super.setHeight(x);
        super.setWidth(x);
    }
    
    /**
     *this method sets a new side length for the square by calling the super.setHeight and 
     *setWidth with the same value
     *@param x the new side length 
     */
    public void setHeight(double x) {
        super.setHeight(x);
        super.setWidth(x);
    }
}