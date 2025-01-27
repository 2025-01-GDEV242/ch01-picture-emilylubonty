/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square dock;
    private Person fisher;
    private Triangle wave;
    private Triangle wave2;
    private Triangle wave3;
    private Circle sun;
    private Circle sun2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        dock = new Square();
        fisher = new Person();
        wave = new Triangle();  
        wave2 = new Triangle();
        wave3 = new Triangle(); 
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            dock.changeSize(100);
            dock.moveHorizontal(20);
            dock.moveVertical(40);
            dock.makeVisible();
            
            fisher.changeSize(20,20);
            fisher.moveHorizontal(30);
            fisher.moveVertical(40);
            fisher.makeVisible();
            
            wave.changeSize(100,100);
            wave.moveHorizontal(20);
            wave.moveVertical(30);
            wave.makeVisible();
            
            wave2.changeSize(100,100);
            wave2.moveHorizontal(-40);
            wave2.moveVertical(30);
            wave2.makeVisible();
            
            wave3.changeSize(100,100);
            wave3.moveHorizontal(-80);
            wave3.moveVertical(30);
            wave3.makeVisible();
            
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
        
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        dock.changeColor("black");
        wave.changeColor("black");
        wave2.changeColor("black");
        wave3.changeColor("black");
        sun.changeColor("black");
        fisher.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        dock.changeColor("blue");
        wave.changeColor("blue");
        wave2.changeColor("blue");
        wave3.changeColor("blue");
        sun.changeColor("yellow");
        fisher.changeColor("black");
    }
}
