package Canadian_Flag;

import java.awt.*;
import javax.swing.*;

public class Flag_FigurePane extends JPanel{
	public void paintComponent(Graphics comp){
		Graphics2D comp2D = (Graphics2D)comp;

		comp2D.drawRect(20, 20, 200, 500);
		comp2D.setColor(Color.red);
		comp2D.fillRect(20, 20, 200, 500);
		comp2D.drawRect(220, 20, 400, 500);
		comp2D.drawRect(620, 20, 200, 500);
		comp2D.setColor(Color.red);
		comp2D.fillRect(620, 20, 200, 500);
		
	}	
}
