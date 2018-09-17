/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Daisry Joy Ladignon 
 * @version 2018.09.16
 */
public class Picture
{
    private Square sky;
    private Person human;  
    private Triangle roof;
    private Square buildingA;
    private Circle sun;
    private Circle moon;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        human = new Person(); 
        roof = new Triangle();  
        buildingA = new Square();
        sun = new Circle();
        moon = new Circle(); 
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            human.changeColor("yellow");
            human.moveHorizontal(150);
            human.moveVertical(-60);
            human.changeSize(100,60);
            human.makeVisible();
            drawn = true;
            
            human.changeColor("black");
            human.changeSize(100, 60);
            human.moveHorizontal(250);
            human.moveVertical(190);
            human.makeVisible();
            drawn = true;
            
          
            buildingA.changeColor("black");
            buildingA.changeSize(40);
            buildingA.moveVertical(260);
            buildingA.moveHorizontal(460);
            buildingA.makeVisible(); 
            drawn = true; 
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(150);
            sun.moveVertical(-60);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            moon.changeColor("blue");
            moon.moveHorizontal(130);
            moon.moveVertical(-60);
            moon.changeSize(80);
            moon.makeVisible();
            drawn = true;
            
            
           
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        human.changeColor("black");
        sky.changeColor("black");
        moon.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sun.changeColor("yellow");
        sky.changeColor("blue");
        human.changeColor("black");
        moon.changeColor("blue");
    }
}
