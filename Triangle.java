/**
 * Triangle extends Polygon and uses all of its Methods, it only changes where the center is placed
 * @author Cade Lueker
 */
public class Triangle extends Polygon {
	
    /**the x coordinate of the center */
    double x;
    /**the y coordinate of the center*/
    double y;
    
    /**
     * Constructor
     * it takes three points and feeds them to the super then resets the center based on the 
     * coordinates of the vertices
     * @param p1 first point of the triangle
     * @param p2 second point of the triangle
     * @param p3 third point of the triangle
     */
    public Triangle(Point p1, Point p2, Point p3) {
        super(p1,p2,p3);
        x = (this.getPoints()[0].getX() + this.getPoints()[1].getX() +this.getPoints()[2].getX()) / 3;
        y = (this.getPoints()[0].getY() + this.getPoints()[1].getY() +this.getPoints()[2].getY()) / 3;
        this.center = (new Point(x,y));
    }
}

