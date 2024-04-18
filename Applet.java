
import java.awt.*;
import java.applet.*;

public class UpdatedApplet extends Applet 
{
    public void paint(Graphics g)
  {
        g.setColor(Color.green);
        Font font = new Font("Arial", Font.BOLD, 16);
        g.setFont(font);
        g.drawString("Welcome to My Applet", 60, 110);
    }
}
