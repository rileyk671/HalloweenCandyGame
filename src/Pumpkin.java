import java.awt.*;


public class Pumpkin {

    public String name;
    public int xpos;
    public int ypos;
    public int dx;
    public int dy;
    public int width;
    public int height;
    public boolean isAlive;
    public Rectangle rec;


    public Pumpkin(int pXpos, int pYpos) {
        xpos = pXpos;
        ypos = pYpos;
        dx = 7;
        dy = 0;
        width = 150;
        height = 150;
        isAlive = true;
        rec = new Rectangle(xpos, ypos, width, height);
    }


    public void printInfo() {
            System.out.println("ASTRONAUT INFORMATION");
            System.out.println(xpos + " , " + ypos);
        }


    public void move() {


        xpos = xpos + dx;
        ypos = ypos + dy;

        ///right wall
        if(xpos>1000-width){
            //go in the opposite direction
            dx = -dx;
        }

        //left wall
        if(xpos<0){
            //go in the opposite direction
            dx = -dx;
        }

        //upper wall
        if(ypos>700-height) {
            //go in the opposite direction
            dy = -dy;
        }

        //lower wall
        if(ypos<0){
            //go in the opposite direction
            dy = -dy;
        }

        rec = new Rectangle(xpos, ypos, width, height);


    }
}

