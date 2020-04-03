import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Test the Point Class
 */
public class PointTester {

    @Test
    public void testGetX() {
        Point p = new Point(101,301);
        Point p1 = new Point(1,0);
        Point p2 = new Point(0,1);
        
        assertEquals(101.0, p.getX(),.1);
        assertEquals(1.0, p1.getX(),.1);
        assertEquals(0.0, p2.getX(),.1);
    }
    
    @Test
    public void testGetY() {
        Point p = new Point(101,301);
        Point p1 = new Point(1,0);
        Point p2 = new Point(0,1);
        
        assertEquals(301.0, p.getY(),.1);
        assertEquals(0.0, p1.getY(),.1);
        assertEquals(1.0, p2.getY(),.1);
    }
    
    @Test
    public void testsetX() {
        Point p = new Point(0,0);
        
        assertEquals(0.0, p.getX(),.1);
        p.setX(1);
        assertEquals(1.0, p.getX(),.1);
        p.setX(0);
        assertEquals(0.0, p.getX(),.1);
    }
    
    @Test
    public void testsetY() {
        Point p = new Point(0,0);
        
        assertEquals(0.0, p.getY(),.1);
        p.setY(1);
        assertEquals(1.0, p.getY(),.1);
        p.setY(0);
        assertEquals(0.0, p.getY(),.1);
    }
    
    @Test 
    public void testRotateAbout() {
        Point p = new Point(0,100);
        Point a = new Point(0,0);
        p.rotateAbout(a, -3.14/2);
        assertEquals(100, p.getX(), 1);
        assertEquals(0, p.getY(), 1);
        
        p = new Point(0,100);
        p.rotateAbout(a,0);
        assertEquals(0, p.getX(), 1);
        assertEquals(100, p.getY(), 1);
        
        p = new Point(0,100);
        p.rotateAbout(p,500);
        assertEquals(0, p.getX(), 1);
        assertEquals(100, p.getY(), 1);
    }
    
    @Test
    public void testToString() {
        Point p = new Point(1010,2020);
        assertEquals("(1010.0,2020.0)",p.toString());
    }
}
 