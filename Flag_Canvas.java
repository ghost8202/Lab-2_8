package Canadian_Flag;

import java.awt.*;
import javax.swing.*;

public class Flag_Canvas extends JFrame{
	public Flag_Canvas(){
		super("Canvas to draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		Flag_FigurePane f = new Flag_FigurePane();
		getContentPane().add(f);
	}
}
