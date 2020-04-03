import org.junit.*;
import static org.junit.Assert.*;

/** 
 * test the Shape class and all the methods it has fully written
 */

public class ShapeTester {
    
    @Test
    public void testGetPoints() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,2);
        Point p4 = new Point(2,0);
        Point p5 = new Point(1,1);
        Polygon poly = new Polygon(p1,p2,p3,p4,p5);
        Point[] tP = new Point[5];
        tP[0] = p1;
        tP[1] = p2;
        tP[2] = p3;
        tP[3] = p4;
        tP[4] = p5;
        
        for (int i = 0; i < 5; i++) {
            assertEquals(tP[i].toString(), poly.getPoints()[i].toString());
        }
    }
    
    @Test
    public void TestGetLines() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,2);
        Point p4 = new Point(2,0);
        Point p5 = new Point(1,1);
        Polygon poly = new Polygon(p1,p2,p3,p4,p5);
        Line l1 = new Line(1,3,2,2);
        Line l2 = new Line(2,2,3,2); 
        Line l3 = new Line(3,2,2,0); 
        Line l4 = new Line(2,0,1,1); 
        Line l5 = new Line(1,1,1,3); 
        Line[] tL = new Line[5];
        tL[0] = l1;
        tL[1] = l2;
        tL[2] = l3;
        tL[3] = l4;
        tL[4] = l5;
        
        for (int i = 0; i < 5; i++) {
            assertEquals(tL[i].toString(), poly.getLines()[i].toString());
        }
    }
    
    @Test
    public void testGetCenter() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,2);
        Point p4 = new Point(2,0);
        Point p5 = new Point(1,1);
        Polygon poly = new Polygon(p1,p2,p3,p4,p5);
        
        assertEquals("(2.0,1.5)", poly.getCenter().toString());
        
        p1 = new Point(6,10);
        p2 = new Point(11,3);
        p3 = new Point(2,2);
        Triangle tri = new Triangle(p1,p2,p3);
        
        assertEquals("(6.333333333333333,5.0)",tri.getCenter().toString());
    }
    
    @Test
    public void testRotate() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,2);
        Point p4 = new Point(2,0);
        Point p5 = new Point(1,1);
        Polygon poly = new Polygon(p1,p2,p3,p4,p5);
        double angle = -3.14/11;
        poly.rotate(angle);
        Point c = poly.getCenter();
        
        p1.rotateAbout(c, angle);
        assertEquals(p1.toString(), poly.getPoints()[0].toString());
        p2.rotateAbout(c, angle);
        assertEquals(p2.toString(), poly.getPoints()[1].toString());
        p3.rotateAbout(c, angle);
        assertEquals(p3.toString(), poly.getPoints()[2].toString());
        p4.rotateAbout(c, angle);
        assertEquals(p4.toString(), poly.getPoints()[3].toString());
        p5.rotateAbout(c, angle);
        assertEquals(p5.toString(), poly.getPoints()[4].toString());
    }
    
    @Test
    public void testSetCenter() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,2);
        Point p4 = new Point(2,0);
        Point p5 = new Point(1,1);
        Polygon poly = new Polygon(p1,p2,p3,p4,p5);
        Point[] tP = new Point[5];
        Point c = new Point(0,0);
        Point c1 = new Point(100,100);
        Point c0 = new Point(2,1.5);
        
        poly.setCenter(c0);
        assertEquals("(2.0,1.5)", poly.getCenter().toString());
        
        poly.setCenter(c1);
        assertEquals("(100.0,100.0)", poly.getCenter().toString());
        
        poly.setCenter(c);
        assertEquals("(0.0,0.0)", poly.getCenter().toString());
    }
    
    @Test
    public void testGetNumPoints() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,2);
        Point p4 = new Point(2,0);
        Point p5 = new Point(1,1);
        Polygon poly5 = new Polygon(p1,p2,p3,p4,p5);
        Polygon poly4 = new Polygon(p1,p2,p3,p4);
        Polygon poly3 = new Polygon(p1,p2,p3);
        
        assertEquals(5,poly5.getNumPoints());
        assertEquals(4,poly4.getNumPoints());
        assertEquals(3,poly3.getNumPoints());
    }
}