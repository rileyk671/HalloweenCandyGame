//Basic Game Application
//Version 2
// Basic Object, Image, Movement
// Astronaut moves to the right.
// Threaded

//K. Chun 8/2018

//*******************************************************************************
//Import Section
//Add Java libraries needed for the game
//import java.awt.Canvas;

//Graphics Libraries
/*
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


//*******************************************************************************
// Class Definition Section

public class BasicGameApp implements Runnable {

    //Variable Definition Section
    //Declare the variables used in the program
    //You can set their initial values too

    //Sets the width and height of the program window
    final int WIDTH = 1000;
    final int HEIGHT = 700;

    //Declare the variables needed for the graphics
    public JFrame frame;
    public Canvas canvas;
    public JPanel panel;

    public BufferStrategy bufferStrategy;

    //Declare the objects used in the program
    //These are things that are made up of more than one variable type
    public WrappingAstronaut astro;
    public Comet bezos;
    public Comet shatner;
    public Comet armstrong;

    public Image spacePic;
    public Image astroPic;
    public Image cometPic;





    // Main method definition
    // This is the code that runs first and automatically
    public static void main(String[] args) {
        BasicGameApp ex = new BasicGameApp();   //creates a new instance of the game
        new Thread(ex).run();                 //creates a threads & starts up the code in the run( ) method
    }


    // Constructor Method
    // This has the same name as the class and no return
    // This section is the setup portion of the program
    // Initialize your variables and construct your program objects here.
    public BasicGameApp() {
        setUpGraphics();

        System.out.println("Setting up game");
        //variable and objects
        //create (construct) the objects needed for the game and load up
        astro = new WrappingAstronaut(300, 300);
        astro.printInfo();
        astro.dx=-5;
        bezos = new Comet (100, 100);
        bezos.xpos = 700;
        bezos.printInfo();
        shatner = new Comet(600, 600);
        shatner.printInfo();
        armstrong = new Comet(200, 200);
        armstrong.printInfo();
        armstrong.dx=5;
        armstrong.dy=5;

        spacePic=Toolkit.getDefaultToolkit().getImage("SpacePic.jpeg");
        astroPic=Toolkit.getDefaultToolkit().getImage("astronaut.png");
        cometPic=Toolkit.getDefaultToolkit().getImage("CometImageForGame.png");





    }// BasicGameApp()


//*******************************************************************************
//User Method Section
//
// put your code to do things here.

    // main thread
    // this is the code that plays the game after you set things up
    public void run() {
        while(true){
            astro.move();  //move character
            shatner.move();
            bezos.move();
            armstrong.move();

            //check intersection
            if (astro.rec.intersects(bezos.rec)){
                astro.isAlive = false;
            }



            render();  //update the screen
            pause(40);  //wait
        }
    }

    //paints things on the screen using bufferStrategy
    public void render() {
        //have to be first two
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.drawImage(spacePic,0, 0,1000, 700,null);

        //draw things
        //g.drawString("astro", astro.xpos, astro.ypos);
        //g.drawString("xpos:"+ astro.xpos, astro.xpos, astro.ypos+10);
        //g.drawString("ypos:"+ astro.ypos, astro.xpos, astro.ypos+20);
        if(astro.isAlive==true) {
            g.drawImage(astroPic, astro.xpos, astro.ypos, astro.width, astro.height, null);
        }

        //g.drawString("bezos", bezos.xpos, bezos.ypos);
        //g.drawString("xpos:"+ bezos.xpos, bezos.xpos, bezos.ypos+10);
        //g.drawString("ypos:"+ bezos.ypos, bezos.xpos, bezos.ypos+20);
        g.drawImage(cometPic,bezos.xpos, bezos.ypos,bezos.width, bezos.height,null);

        //g.drawString("shatner", shatner.xpos, shatner.ypos);
        //g.drawString("xpos:"+ shatner.xpos, shatner.xpos, shatner.ypos+10);
        //g.drawString("ypos:"+ shatner.ypos, shatner.xpos, shatner.ypos+20);
        g.drawImage(cometPic,shatner.xpos, shatner.ypos,shatner.width, shatner.height,null);

        //g.drawString("armstrong", armstrong.xpos, armstrong.ypos);
        //g.drawString("xpos:"+ armstrong.xpos, armstrong.xpos, armstrong.ypos+10);
        //g.drawString("ypos:"+ armstrong.ypos, armstrong.xpos, armstrong.ypos+20);
        g.drawImage(cometPic,armstrong.xpos, armstrong.ypos,armstrong.width, armstrong.height,null);


        //have to be last two
        g.dispose();
        bufferStrategy.show();
    }

    //Pauses or sleeps the computer for the amount specified in milliseconds
    public void pause(int time) {
        //sleep
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }
    }

    //Graphics setup method
    private void setUpGraphics() {
        frame = new JFrame("My First Game");   //Create the program window or frame.  Names it.

        panel = (JPanel) frame.getContentPane();  //sets up a JPanel which is what goes in the frame
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));  //sizes the JPanel
        panel.setLayout(null);   //set the layout

        // creates a canvas which is a blank rectangular area of the screen onto which the application can draw
        // and trap input events (Mouse and Keyboard events)
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);

        panel.add(canvas);  // adds the canvas to the panel.

        // frame operations
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes the frame close and exit nicely
        frame.pack();  //adjusts the frame and its contents so the sizes are at their default or larger
        frame.setResizable(false);   //makes it so the frame cannot be resized
        frame.setVisible(true);      //IMPORTANT!!!  if the frame is not set to visible it will not appear on the screen!

        // sets up things so the screen displays images nicely.
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        System.out.println("DONE graphic setup");

    }



}

 */


// Riley Keblin 12/3/2021


import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


//*******************************************************************************
// Class Definition Section

public class BasicGameApp implements Runnable {

    //Variable Definition Section
    //Declare the variables used in the program
    //You can set their initial values too

    //Sets the width and height of the program window
    final int WIDTH = 1000;
    final int HEIGHT = 700;

    //Declare the variables needed for the graphics
    public JFrame frame;
    public Canvas canvas;
    public JPanel panel;

    public BufferStrategy bufferStrategy;

    //Declare the objects used in the program
    //These are things that are made up of more than one variable type
    public Candy candyRoll;
    public Candy candyCorn;
    public Candy candyCane;
    public Vegetable carrot;
    public Vegetable lettuce;
    public Pumpkin pumpkin;
    public SpeedUp x2Speed;
    public SizeUp x2Size;
    public int counterC;
    public int counterV;
    public Rock rock;
    public boolean backgroundColorIsBlue;
    public boolean positiveScore;
    public boolean negativeScore;


    public Image candyRollPicture;
    public Image candyCornPicture;
    public Image candyCanePicture;
    public Image carrotPicture;
    public Image lettucePicture;
    public Image pumpkinPicture;
    public Image x2SpeedPicture;
    public Image x2SizePicture;
    public Image background;
    public Image rockImage;
    public Image yellow;
    public Image yay;
    public Image boo;




    public SoundFile vegetableSound;
    public SoundFile candySound;
    public SoundFile rockSound;
    public SoundFile speedUpSound;
    public SoundFile music;


    // Main method definition
    // This is the code that runs first and automatically
    public static void main(String[] args) {
        BasicGameApp ex = new BasicGameApp();   //creates a new instance of the game
        new Thread(ex).run();                 //creates a threads & starts up the code in the run( ) method
    }


    // Constructor Method
    // This has the same name as the class and no return
    // This section is the setup portion of the program
    // Initialize your variables and construct your program objects here.
    public BasicGameApp() {
        setUpGraphics();

        System.out.println("Setting up game");
        //variable and objects
        //create (construct) the objects needed for the game and load up
        pumpkin = new Pumpkin(300, 550);
        pumpkin.printInfo();
        candyRoll = new Candy(100, 100);
        candyRoll.xpos = 700;
        candyRoll.printInfo();
        candyCorn = new Candy(0, 0);
        candyCorn.printInfo();
        candyCane = new Candy(250, 200);
        candyCane.printInfo();
        carrot = new Vegetable(800, 800);
        carrot.printInfo();
        x2Speed = new SpeedUp(400, 400);
        x2Speed.printInfo();
        x2Size = new SizeUp(500, 500);
        x2Size.printInfo();
        rock = new Rock(600, 600);
        rock.printInfo();
        lettuce = new Vegetable(150, 400);
        lettuce.width = 100;
        lettuce.height = 100;
        lettuce.printInfo();
        backgroundColorIsBlue = true;

        vegetableSound = new SoundFile("blip.wav");
        candySound = new SoundFile("click_x.wav");
        rockSound = new SoundFile("boing2.wav");
        speedUpSound = new SoundFile("thunk.wav");
        music = new SoundFile("music.wav");


        candyRollPicture = Toolkit.getDefaultToolkit().getImage("CandyRoll.png");
        candyCornPicture = Toolkit.getDefaultToolkit().getImage("CandyCorn.png");
        candyCanePicture = Toolkit.getDefaultToolkit().getImage("CandyCane.png");
        carrotPicture = Toolkit.getDefaultToolkit().getImage("Carrot.png");
        lettucePicture = Toolkit.getDefaultToolkit().getImage("lettuce.png");
        x2SpeedPicture = Toolkit.getDefaultToolkit().getImage("SpeedUp.png");
        x2SizePicture = Toolkit.getDefaultToolkit().getImage("SizeUp.png");
        pumpkinPicture = Toolkit.getDefaultToolkit().getImage("Pumpkin.png");
        rockImage = Toolkit.getDefaultToolkit().getImage("rock.png");
        background = Toolkit.getDefaultToolkit().getImage("background.png");
        yellow = Toolkit.getDefaultToolkit().getImage("yellow.png");
        yay = Toolkit.getDefaultToolkit().getImage("yay.png");
        boo = Toolkit.getDefaultToolkit().getImage("boo.png");




    }// BasicGameApp()


//*******************************************************************************
//User Method Section
//
// put your code to do things here.

    // main thread
    // this is the code that plays the game after you set things up
    public void run() {

        while (true) {

            music.loop();
            pumpkin.move();  //move character
            candyCorn.move();
            candyRoll.move();
            candyCane.move();
            carrot.move();
            lettuce.move();
            x2Speed.move();
            x2Size.move();
            rock.move();


            //check intersection

            if (pumpkin.rec.intersects(candyRoll.rec)) {
                candyRoll.ypos = 0;
                pumpkin.height = 150;
                pumpkin.width = 150;
                counterC = counterC + 1;
                candySound.play();


                //candyRoll.xpos=candyRoll.xpos-100;
            }
            if (pumpkin.rec.intersects(candyCane.rec)) {
                candyCane.ypos = 0;
                pumpkin.height = 150;
                pumpkin.width = 150;
                counterC = counterC + 1;
                candySound.play();


                //candyCane.xpos= candyCane.xpos-100;
            }
            if (pumpkin.rec.intersects(candyCorn.rec)) {
                candyCorn.ypos = 0;
                pumpkin.height = 150;
                pumpkin.width = 150;
                counterC = counterC + 1;
                candySound.play();


                //candyCorn.xpos=candyCorn.xpos-100;
            }
            if (pumpkin.rec.intersects(carrot.rec)) {
                pumpkin.height = 50;
                pumpkin.width = 50;
                carrot.ypos = 0;
                counterV = counterV + 1;
                vegetableSound.play();
            }
            if (pumpkin.rec.intersects(lettuce.rec)) {
                pumpkin.height = 50;
                pumpkin.width = 50;
                counterV = counterV + 1;
                lettuce.ypos = 0;
                vegetableSound.play();


            }
            if (pumpkin.rec.intersects(x2Speed.rec)) {
                pumpkin.dx = 2 * pumpkin.dx;
                x2Speed.ypos = 0;
                speedUpSound.play();
                backgroundColorIsBlue = false;


            }
            if (pumpkin.rec.intersects(rock.rec)) {
                pumpkin.dx = 7;
                pumpkin.dx = -pumpkin.dx;
                rockSound.play();
                backgroundColorIsBlue = true;

            }

            if (counterC>counterV) {
                positiveScore = true;
            }
            else{
                positiveScore = false;

            }
            if (counterV>counterC) {
                negativeScore = true;
            }
            else{
                negativeScore = false;

            }


            render();  //update the screen
            pause(40);  //wait

        }
    }

    //paints things on the screen using bufferStrategy
    public void render() {
        //have to be first two
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT);
        if (backgroundColorIsBlue == true) {
            g.drawImage(background, 0, 0, 1000, 700, null);
        }
        if (backgroundColorIsBlue == false) {
            g.drawImage(yellow, 0, 0, 1000, 700, null);
        }


        //draw things
        g.drawString("Vegtables Collected:" + counterV, 850, 10);
        g.drawString("Candies Collected:" + counterC, 850, 25);
        //g.drawString("xpos:"+ astro.xpos, astro.xpos, astro.ypos+10);
        //g.drawString("ypos:"+ astro.ypos, astro.xpos, astro.ypos+20);
        if (positiveScore == true) {
            g.drawImage(yay, 830, 30, 150, 100, null);
        }
        if(negativeScore == true){
            g.drawImage(boo, 830, 30, 200, 100, null);
        }




        if (pumpkin.isAlive == true) {
            g.drawImage(pumpkinPicture, pumpkin.xpos, pumpkin.ypos, pumpkin.width, pumpkin.height, null);
        }


        //g.drawString("bezos", bezos.xpos, bezos.ypos);
        //g.drawString("xpos:"+ bezos.xpos, bezos.xpos, bezos.ypos+10);
        //g.drawString("ypos:"+ bezos.ypos, bezos.xpos, bezos.ypos+20);
        if (candyRoll.isAlive == true) {
            g.drawImage(candyRollPicture, candyRoll.xpos, candyRoll.ypos, candyRoll.width, candyRoll.height, null);
        }

        //g.drawString("shatner", shatner.xpos, shatner.ypos);
        //g.drawString("xpos:"+ shatner.xpos, shatner.xpos, shatner.ypos+10);
        //g.drawString("ypos:"+ shatner.ypos, shatner.xpos, shatner.ypos+20);
        if (candyCorn.isAlive == true) {
            g.drawImage(candyCornPicture, candyCorn.xpos, candyCorn.ypos, candyCorn.width, candyCorn.height, null);
        }

        //g.drawString("armstrong", armstrong.xpos, armstrong.ypos);
        //g.drawString("xpos:"+ armstrong.xpos, armstrong.xpos, armstrong.ypos+10);
        //g.drawString("ypos:"+ armstrong.ypos, armstrong.xpos, armstrong.ypos+20);
        if (candyCane.isAlive == true) {
            g.drawImage(candyCanePicture, candyCane.xpos, candyCane.ypos, candyCane.width, candyCane.height, null);
        }

        //g.drawString("armstrong", armstrong.xpos, armstrong.ypos);
        //g.drawString("xpos:"+ armstrong.xpos, armstrong.xpos, armstrong.ypos+10);
        //g.drawString("ypos:"+ armstrong.ypos, armstrong.xpos, armstrong.ypos+20);
        if (carrot.isAlive == true) {
            g.drawImage(carrotPicture, carrot.xpos, carrot.ypos, carrot.width, carrot.height, null);
        }

        //g.drawString("armstrong", armstrong.xpos, armstrong.ypos);
        //g.drawString("xpos:"+ armstrong.xpos, armstrong.xpos, armstrong.ypos+10);
        //g.drawString("ypos:"+ armstrong.ypos, armstrong.xpos, armstrong.ypos+20);
        if (lettuce.isAlive == true) {
            g.drawImage(lettucePicture, lettuce.xpos, lettuce.ypos, lettuce.width, lettuce.height, null);
        }

        //g.drawString("armstrong", armstrong.xpos, armstrong.ypos);
        //g.drawString("xpos:"+ armstrong.xpos, armstrong.xpos, armstrong.ypos+10);
        //g.drawString("ypos:"+ armstrong.ypos, armstrong.xpos, armstrong.ypos+20);
        if (x2Speed.isAlive == true) {
            g.drawImage(x2SpeedPicture, x2Speed.xpos, x2Speed.ypos, x2Speed.width, x2Speed.height, null);
        }

        //g.drawString("armstrong", armstrong.xpos, armstrong.ypos);
        //g.drawString("xpos:"+ armstrong.xpos, armstrong.xpos, armstrong.ypos+10);
        //g.drawString("ypos:"+ armstrong.ypos, armstrong.xpos, armstrong.ypos+20);
        if (rock.isAlive == true) {
            g.drawImage(rockImage, rock.xpos, rock.ypos, rock.width, rock.height, null);
        }

        //have to be last two
        g.dispose();
        bufferStrategy.show();
    }

    //Pauses or sleeps the computer for the amount specified in milliseconds
    public void pause(int time) {
        //sleep
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }
    }

    //Graphics setup method
    private void setUpGraphics() {
        frame = new JFrame("My First Game");   //Create the program window or frame.  Names it.

        panel = (JPanel) frame.getContentPane();  //sets up a JPanel which is what goes in the frame
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));  //sizes the JPanel
        panel.setLayout(null);   //set the layout

        // creates a canvas which is a blank rectangular area of the screen onto which the application can draw
        // and trap input events (Mouse and Keyboard events)
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);

        panel.add(canvas);  // adds the canvas to the panel.

        // frame operations
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes the frame close and exit nicely
        frame.pack();  //adjusts the frame and its contents so the sizes are at their default or larger
        frame.setResizable(false);   //makes it so the frame cannot be resized
        frame.setVisible(true);      //IMPORTANT!!!  if the frame is not set to visible it will not appear on the screen!

        // sets up things so the screen displays images nicely.
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        System.out.println("DONE graphic setup");

    }


}



