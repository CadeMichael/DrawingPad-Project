import org.junit.*;
import static org.junit.Assert.*;

/** 
 * test the Square class 
 */

public class SquareTester {
    
    @Test
    public void testGetHeight() {
        Point c = new Point(0,0);
        Square sq = new Square(c, 10);
        
        assertEquals(10.0, sq.getHeight(),.1);
    }
    
    @Test
    public void testGetWidth() {
        Point c = new Point(0,0);
        Square sq = new Square(c, 10);
        
        assertEquals(10.0, sq.getWidth(),.1);
    }
    
    @Test
    public void testSetHeight() {
        Point c = new Point(0,0);
        Square sq = new Square(c, 10);
        
        sq.setWidth(465);
        assertEquals(465.0, sq.getHeight(),.1);
        assertEquals(465.0, sq.getWidth(),.1);
    }
    
    @Test
    public void testSetWidth() {
        Point c = new Point(0,0);
        Square sq = new Square(c, 10);
        
        sq.setWidth(182);
        assertEquals(182.0, sq.getWidth(),.1);
        assertEquals(182.0, sq.getWidth(),.1);
    }
    
    
}