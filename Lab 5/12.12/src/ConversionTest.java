import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ConversionTest {

	public static void main(String[] args) {
		Conversion cs = new Conversion();
		cs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cs.setSize(400,300);
		cs.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		cs.setLocation(dim.width/2-cs.getSize().width/2, dim.height/2-cs.getSize().height/2);
	}

}
