/**
 * the EquilateralTriangle class is essentially a NGon that is restricted to three
 * sides, it shares all of the same functions
 * @author Cade Lueker
 */
public class EquilateralTriangle extends NGon {
    
	/**
     * Constructor
     * @param c represents the point that will be the center of the triangle
     * @param sideLength represents what will be the sideLength of the triangle
     */
    public EquilateralTriangle (Point c, double sideLength) {
        super(c,3,sideLength);
    }
}