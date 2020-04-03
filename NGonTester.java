import org.junit.*;
import static org.junit.Assert.*;

/** 
 * test the NGon class 
 */

public class NGonTester {
    @Test
    public void testGetNumSides() {
        NGon tri = new NGon (new Point(0.0,0.0),3,3.0);
        NGon p4 = new NGon (new Point(0.0,0.0),4,3.0);
        NGon p5 = new NGon (new Point(0.0,0.0),5,3.0);
        NGon p6 = new NGon (new Point(0.0,0.0),6,3.0);
        
        assertEquals(3,tri.getNumSides());
        assertEquals(4,p4.getNumSides());
        assertEquals(5,p5.getNumSides());
        assertEquals(6,p6.getNumSides());
    }
    
    @Test
    public void testGetSideLength() {
        NGon p4 = new NGon (new Point(0.0,0.0),4,5.0);
        NGon p5 = new NGon (new Point(0.0,0.0),5,7.0);
        NGon p6 = new NGon (new Point(0.0,0.0),6,8.5);
        NGon p7 = new NGon (new Point(0.0,0.0),5,6.7);
        NGon p8 = new NGon (new Point(0.0,0.0),6,3.0);
        
        
        assertEquals(5.0,p4.getSideLength(),.1);
        assertEquals(7.0,p5.getSideLength(),.1);
        assertEquals(8.5,p6.getSideLength(),.1);
        assertEquals(6.7,p7.getSideLength(),.1);
        assertEquals(3.0,p8.getSideLength(),.1);
    }
    
    @Test
    public void testSetSideLength() {
        NGon p = new NGon (new Point(0.0,0.0),7,6.7);
        
        p.setSideLength(0);
        assertEquals(0.0,p.getSideLength(),.1);
        p.setSideLength(0.1);
        assertEquals(0.1,p.getSideLength(),.1);
        p.setSideLength(29);
        assertEquals(29.0,p.getSideLength(),.1);
        p.setSideLength(983);
        assertEquals(983.0,p.getSideLength(),.1);
    }
}