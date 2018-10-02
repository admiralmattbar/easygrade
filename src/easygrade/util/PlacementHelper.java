package easygrade.util;

import javax.swing.*;
import java.awt.*;

public class PlacementHelper {

    public static void setJFrameItemCenter(JFrame frame)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width/2) - (frame.getWidth()/2);
        int yPos = (dim.height/2) - (frame.getHeight()/2);

        frame.setLocation(xPos, yPos);
    }

    public static void positionComponent(JComponent component, int xFactor, int yFactor, int width, int height)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        component.setBounds(dim.width/xFactor, dim.height/yFactor, width, height);
    }

}
