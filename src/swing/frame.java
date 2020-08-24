package swing;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;



public class frame {
    public static void main(String[] args) {
        myFrame newFrame = new myFrame();


        //Check for font
        String font = JOptionPane.showInputDialog("Input font's name.");
        boolean fontExists = false;
        String[] fontsName = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        try {
            for(String fontName : fontsName){

            if(fontName.equals(font)){
                fontExists = true;
            }  
        }

        if(fontExists){
            System.out.println("The font is installed.");
        } else{
            System.out.println("The font is not installed.");
        }
        } catch (Exception e) {
            System.out.println("Font doesnt exists.");
        }
        


        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setVisible(true);
    }
}


class myFrame extends JFrame{

    public myFrame(){
        //To get the screen size to calculate frame position and size.
        Toolkit newDisplay = Toolkit.getDefaultToolkit();
        Dimension displaySize = newDisplay.getScreenSize();
        int width = (int)displaySize.getWidth();
        int height = (int)displaySize.getHeight();
        
        
        setTitle("Java Swing Cheatsheet");

        //To set a static pixel size - setSize(600, 300);
        //To set a size and position respecting the res of the screen use ⬇
        setSize(width/2, height/2);
        setLocation(width/4, height/4);
        //To set static pixel location - setLocation(500, 500);

        //To set static position and size.
        //setBounds(600, 300, 500, 500);
        setResizable(false);
        
        //Add icon, only works for GIF, JPEG and PNG. It has to be on the same directory.
        Image myIcon = newDisplay.getImage("user-male.png");
        setIconImage(myIcon);


        DrawFigure newFigure = new DrawFigure();
        
        add(newFigure);

        newFigure.setBackground(SystemColor.window);
        
    };
}
//Drawing Figures in the Frame.
class DrawFigure extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rect);

        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rect);
        //Changing fonts.
        Font myFont = new Font("Arial", Font.BOLD, 26);
        g2.setFont(myFont);
        g2.setColor(Color.blue);
    

        g2.draw(elipse);
        g.drawRect(10, 10, 50, 50);
        g.drawString("Hello World", 75, 50);

        //Add image.

        File myImage = new File("user-male.png");
        try {
            image = ImageIO.read(myImage);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Image not found.");
        }

        g.drawImage(image,500 ,120, null);

    }


    private Image image;
}