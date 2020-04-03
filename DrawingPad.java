import javax.swing.*; 
import java.awt.*; 
/**
 * The DrawingPad class creates a series of panels if you will; a JFrame, JPanel, and Canvas. 
 * It then draws an input shape and can become blank again. It is the canvas on which we display
 * what our other classes can do.
 *@author Cade Lueker    
 */
public class DrawingPad{
  //feilds that store the dimensions of the JPanel
  /** the width of the drawing pad*/
  private int JPWidth;
  /** the height of the drawing pad*/
  private int JPHeight;
  /** the canvas being illustrated on*/
  private Canvas canvas;
  /** the graphics context of our drawing pad*/
  private Graphics gC;
  
  /**
   * the constructor
   * @param JPWidth the width of the drawing pad
   * @param JPHeight the height of the drawing pad
   */
  public DrawingPad(int JPWidth, int JPHeight) {
   
    this.JPHeight = JPHeight;
    this.JPWidth = JPWidth;
    JFrame jF = new JFrame();
    canvas = new Canvas();
    canvas.setSize(JPWidth, JPHeight);
    canvas.setBackground(Color.WHITE);
    JPanel jP = new JPanel();
    jP.add(canvas);
    jF.add(jP);
    jF.pack();
    jF.setVisible(true);
  }
  
  /**
   * returns the graphics context needed to draw lines
   * @return the graphics context of the canvas
   */
  public Graphics getGraphicsContext() {
    if (canvas == null) {
      return null;
    }
    else {
      Graphics gC = canvas.getGraphics();
      if (gC != null) {
          gC.setColor(Color.BLACK);
      }
      this.gC = gC;
      return gC;
      
    }
  }
  
  /**
   * takes a type that extends all of my shapes and draws it on the canvas
   * @param s which is of type shape
   */
  public void draw(Shape s) {
      double x;
      double y;
      double x1;
      double y1;
      for (int i = 0; i < s.getNumPoints();i++) {
          x = s.getLines()[i].getFirstPoint().getX();
          y = s.getLines()[i].getFirstPoint().getY();
          x1 = s.getLines()[i].getSecondPoint().getX();
          y1 = s.getLines()[i].getSecondPoint().getY();
          this.getGraphicsContext().drawLine((int)x,(int)y,(int)x1,(int)y1);
      }
  
  }
  
  //this method clears the JPanel and returns it to white 
  /**
   * erase essentially resets the canvas to white it takes no input and returns no value
   */
  public void erase() {
    Graphics gC = getGraphicsContext();
    gC.setColor(Color.WHITE);
    gC.fillRect(0,0,JPWidth, JPHeight);
    gC.setColor(Color.BLACK);
  }
}
