/**
 * Point is the foundation of all of the other classes. it is what must be used to create any shape
 * @author Cade Lueker
 */
public class Point {

 /** the x coordinate */
 private double x;
 /** the y coordinate */
 private double y;

 /**
  * Constructor
  * @param x the x coordinate
  * @param y the y coordinate
  */
 public Point (double x, double y) {
  this.x = x;
  this.y = y;
 }
 
 // getter methods
 /**
 * @return the x coordinate
 */
 public double getX() {
  return this.x;
 }
 
 /**
 * @return the y coordinate
 */
 public double getY() {
  return this.y;
 }
 
 /**
 * @param x will be the new x coordinate
 */
 public void setX(double x) {
  this.x = x;
 }
 
 /**
 * @param y will be the new y coordinate
 */
 public void setY(double y) {
  this.y = y;
 }
 
 // rotate about takes a point and a double and rotates the point about the current point
 /**
 * rotate about rotates the current point around an arbitrary one a given amount of radians
 * @param p the point around which the current point will be rotated
 * @param angle the number of radians the current point will be rotated
 */
 public void rotateAbout(Point p, double angle) {
  double xP = p.getX();
  double yP = p.getY();
  
  double tempX = this.getX()- xP;
  double  tempY = this.getY()- yP;

  double xPrime = (tempX * Math.cos(angle)) - (tempY* Math.sin(angle));
  double yPrime = (tempX * Math.sin(angle)) + (tempY* Math.cos(angle));
  
  this.setX(xPrime + xP);
  this.setY(yPrime + yP);
 
 } 
 
 /**
 * In order to make it easier to test and understand how the point types are used I 
 * overrode the toString method in a way that suited my needs
 * @return a string of two coordinates in parenthesis
 */
 @Override 
 public String toString() {
     return "(" + this.getX() +"," + this.getY() + ")";
 }
 
}

