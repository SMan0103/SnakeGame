import javax.swing.*;
import java.awt.*;

//vores bane
public class Grid {

    public void paint(Graphics g){
        //Override paint method in superclass
        
        super.paint(g);

        //Get current JFrame width
        int frameWidth=getSize().width;

        //Get current JFrame height
        int frameHeight=getSize().height;

        int temp=0;

        //Draw vertical grid line with spacing between each line equal to 10 pixels
        while(temp<frameWidth)
        {
        temp=temp+10;
        g.drawLine(temp,0,temp,frameHeight);
        }

        temp=0;

        //Draw horizontal grid line with spacing between each line equal to 10 pixels
        while(temp<frameHeight)
        {
        temp=temp+10;
        g.drawLine(0,temp,frameWidth,temp);
        }
    }
}
