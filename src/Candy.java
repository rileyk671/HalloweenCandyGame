import java.awt.*;

public class Candy {

    public String name;
    public int xpos;
    public int ypos;
    public int dx;
    public int dy;
    public int width;
    public int height;
    public boolean isAlive;
    public Rectangle rec;


    public Candy(int pXpos, int pYpos) {
        xpos = pXpos;
        ypos = pYpos;
        dx = 0;
        dy = 10;
        width = 60;
        height = 60;
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

        //right wall
        if(xpos>1000){
            //wrap (enter from opposite wall)
            xpos = -width;
        }

        //left wall
        if(xpos<-width){
            //wrap (enter from opposite wall)
            xpos = 1000;
        }

        //upper wall
        if(ypos>700) {
            //wrap (enter from opposite wall)
            ypos = -height;
        }

        //lower wall
        if(ypos<-height){
            //wrap (enter from opposite wall)
            ypos = 1000;
        }

        rec = new Rectangle (xpos, ypos, width, height);

    }
}
