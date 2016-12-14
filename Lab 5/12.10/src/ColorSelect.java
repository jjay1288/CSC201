import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ColorSelect extends JFrame{
	private final FlowLayout flowlayout=new FlowLayout();
	public ColorSelect(){
		super ("ColorSelect");
		JPanel panel1=new JPanel();
		String[] colors={"Blue","Yellow","Red","Green","Black"};
		JComboBox jlist=new JComboBox(colors);
		add(jlist, BorderLayout.NORTH);


		JPanel panel2=new JPanel();
		//panel2.setLayout(flowlayout);
		JRadioButton bg = new JRadioButton("Background");
		JRadioButton fg = new JRadioButton("Foreground");
		ButtonGroup bG = new ButtonGroup();
		bG.add(bg);
		bG.add(fg);
		panel2.add(bg);
		panel2.add(fg);
		add(panel2,BorderLayout.CENTER);

		JPanel panel3=new JPanel();
		panel3.setLayout(flowlayout);
		JButton ok=new JButton("OK");
		JButton cancel=new JButton("Cancel");
		panel3.add(ok);
		panel3.add(cancel);
		add(panel3, BorderLayout.SOUTH);

	}




}
