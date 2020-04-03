import org.junit.*;
import static org.junit.Assert.*;

/** 
 * test the Line class
 */

public class LineTester {
    
    @Test 
    public void testGetFirstPoint() {
        Point fP = new Point(6.7, 11.3);
        Point sP = new Point(100.2,63.3);
        Line l = new Line(6.7, 11.3,100.2, 63.3);
        
        assertEquals(fP.toString(), l.getFirstPoint().toString());
    }
    
    @Test
    public void testGetSecondPoint() {
        Point fP = new Point(6.7, 11.3);
        Point sP = new Point(100.2,63.3);
        Line l = new Line(6.7, 11.3,100.2, 63.3);
        
        assertEquals(sP.toString(), l.getSecondPoint().toString());
    }
    
    @Test
    public void testSetFirstPoint() {
        Point p1 = new Point(45.4, 71.8);
        Point p2 = new Point(10.9,36.2);
        Line l = new Line(0, 0,0, 0);
        l.setFirstPoint(p1);
        
        assertEquals(p1.toString(), l.getFirstPoint().toString());
        
        l.setFirstPoint(p2);
        
        assertEquals(p2.toString(), l.getFirstPoint().toString());
    }
    
    @Test
    public void testSetSecondPoint() {
        Point p1 = new Point(45.4, 71.8);
        Point p2 = new Point(10.9,36.2);
        Line l = new Line(0, 0,0, 0);
        l.setSecondPoint(p1);
        
        assertEquals(p1.toString(), l.getSecondPoint().toString());
        
        l.setSecondPoint(p2);
        
        assertEquals(p2.toString(), l.getSecondPoint().toString());
    }
    
    @Test
    public void testToString() {
        Line l = new Line(6.7, 11.3,100.2, 63.3);
        
        assertEquals("((6.7,11.3),(100.2,63.3))", l.toString());
    }
}