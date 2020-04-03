import org.junit.*;
import static org.junit.Assert.*;

/** 
 * test the Rectangle class 
 */

public class RectangleTester {
    
    @Test
    public void testGetHeight() {
        Point c = new Point(0,0);
        Rectangle rect = new Rectangle(c, 90,2);
        Point c1 = new Point(3,106);
        Rectangle rect1 = new Rectangle(c1, 32,2);
        Point c2 = new Point(-59,390);
        Rectangle rect2 = new Rectangle(c2, 45, 2);
        
        assertEquals(90.0,rect.getHeight(),.1);
        assertEquals(32.0,rect1.getHeight(),.1);
        assertEquals(45.0,rect2.getHeight(),.1);
    }
    public void testSetHeight() {
        Point c = new Point(0,0);
        Rectangle rect = new Rectangle(c, 2,2);
        
        rect.setHeight(0);
        assertEquals(0.0, rect.getHeight(),.1);
        
        rect.setHeight(18);
        assertEquals(18.0, rect.getHeight(),.1);
        
        rect.setHeight(64);
        assertEquals(64.0, rect.getHeight(),.1);
    }
    public void testGetWidth() {
        Point c = new Point(0,0);
        Rectangle rect = new Rectangle(c, 2,2);
        Point c1 = new Point(3,106);
        Rectangle rect1 = new Rectangle(c1, 2, 56);
        Point c2 = new Point(-59,390);
        Rectangle rect2 = new Rectangle(c2, 2, 907);
        
        assertEquals(2.0,rect.getWidth(),.1);
        assertEquals(56.0,rect1.getWidth(),.1);
        assertEquals(907.0,rect1.getWidth(),.1);
    }
    public void testSetWidth() {
        Point c = new Point(0,0);
        Rectangle rect = new Rectangle(c, 2,2);
        
        rect.setWidth(0);
        assertEquals(0.0, rect.getWidth(),.1);
        
        rect.setWidth(84);
        assertEquals(84.0, rect.getWidth(),.1);
        
        rect.setWidth(79);
        assertEquals(79.0, rect.getWidth(),.1);
    }
}