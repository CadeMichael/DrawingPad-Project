/**
 * the Rectangle class represents a rectangle of a given width and height
 * @author Cade Lueker
 */
public class Rectangle extends Polygon{
    
    /** the height of the rectangle*/
    private double height;
    /** the width of the rectangle*/
    private double width;
    
    /**
     * Constructor
     * @param center of the rectangle
     * @param height of the rectangle
     * @param width of the rectangle
     */
    public Rectangle(Point center, double height, double width) {
        super(new Point((center.getX() + (width/2.0)), (center.getY()+ (height/2))),
               new Point((center.getX() + (width/2.0)), (center.getY()- (height/2))),
               new Point((center.getX() - (width/2.0)), (center.getY()- (height/2))),
               new Point((center.getX() - (width/2.0)), (center.getY()+ (height/2))));

        this.height = height;
        this.width = width;
    }
    
    /**
     * @return the width of the rectangle 
     */
    public double getWidth(){
        return this.width;
    }
    
    /**
     * @return the height of the rectangle
     */
    public double getHeight(){
        return this.height;
    }
    
    //setter methods
    /**
     * this method sets the width and readjusts the points of the rectangle
     * @param w the new width of the rectangle
     */
    public void setWidth(double w){
        this.width = w;
        Point[] p = new Point[4]; 
        for (int i = 0; i < 4; i++) {
          p[i] = new Point ((this.getCenter().getX() + (w/2)),this.getPoints()[i].getY()); 
        }
        this.setPoints(p);
    }
    
    /**
     * this method sets the height of the rectangle and readjusts the points 
     * @param h the new height of the rectangle
     */
    public void setHeight(double h){
        this.height = h;
        Point[] p = new Point[4]; 
        for (int i = 0; i < 4; i++) {
          p[i] = new Point (this.getPoints()[i].getX(),(this.getCenter().getY() + (h/2))); 
        }
        this.setPoints(p);
        
    }
    
}
