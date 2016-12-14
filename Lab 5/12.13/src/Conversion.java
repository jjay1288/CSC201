import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Conversion extends JFrame {

	private static int choice=0;//1 is ftc, 2 is ctf
	public double input;
	private static double outputk;
	private static double outputc;
	private static double outputf;
	


	private final JTextField textArea;

	
	public Conversion(){
		super("Conversion");

		
		textArea=new JTextField();
		textArea.setEditable(true);
		Font bigFont = textArea.getFont().deriveFont(Font.PLAIN, 40f);
        textArea.setFont(bigFont);
        textArea.setText("Enter Temperature...");
        textArea.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent arg0) {
				textArea.setText("");
				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
        	
        });
add(textArea, BorderLayout.NORTH);

JPanel panel1=new JPanel();
JLabel label=new JLabel("Please select the unit of your input",JLabel.CENTER);
panel1.add(label);

	JRadioButton f = new JRadioButton("Fahrenheit");
	JRadioButton c = new JRadioButton("Celcius");
	JRadioButton k = new JRadioButton("Kelvin");
	ButtonGroup bG = new ButtonGroup();
	f.setFont(new java.awt.Font("Times New Roman", 1, 22));
	c.setFont(new java.awt.Font("Times New Roman", 1, 22));
	k.setFont(new java.awt.Font("Times New Roman", 1, 22));
	f.setSelected(true);
	bG.add(f);
	bG.add(c);
	bG.add(k);
	panel1.add(f);
	panel1.add(c);
	panel1.add(k);
	add(panel1);
	

	
	JPanel panel2=new JPanel();
	JButton ok=new JButton("Convert");
	panel2.add(ok, BorderLayout.SOUTH);
	add(panel2, BorderLayout.SOUTH);
	ok.addActionListener(
	new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
		input=Double.parseDouble(textArea.getText());
		setVisible(false);
		if (f.isSelected()){
			outputc=(input-32.00)/1.8;
			outputf=input;
			outputk=outputc+273.15;
			setChoice(1);
			}
		else if (c.isSelected()){
			outputf=input*1.8+32;
			outputc=input;
			outputk=outputc+273.15;
			setChoice(2);
		}
		else if (k.isSelected()){
			outputk=input;
			outputc=outputk-273.15;
			outputf=outputc*1.8+32;
			setChoice(3);
		}
		
		Output out = new Output();
		out.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		out.setSize(375,150);
		out.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		out.setLocation(dim.width/2-out.getSize().width/2, dim.height/2-out.getSize().height/2);
		
			
		}
		
	}
);
}


	public static int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}


	public static double getOutputk() {
		return outputk;
	}


	public void setOutputk(double outputk) {
		this.outputk = outputk;
	}


	public static double getOutputc() {
		return outputc;
	}


	public void setOutputc(double outputc) {
		this.outputc = outputc;
	}


	public static double getOutputf() {
		return outputf;
	}


	public void setOutputf(double outputf) {
		this.outputf = outputf;
	}

	class Output extends JFrame{
		private final JLabel label1;
		private final JLabel label3;
		private final JLabel label2;
		public Output(){
			
			super ("Output");
			int choice = Conversion.getChoice();

			


			label1 = new JLabel("Fahrenheit: "+Conversion.getOutputf(), JLabel.CENTER);
			label1.setFont(new java.awt.Font("Times New Roman", 1, 20));
			label1.setSize(375, 100);

			label2 = new JLabel("Celsius: "+Conversion.getOutputc(), JLabel.CENTER);
			label2.setFont(new java.awt.Font("Times New Roman", 1, 20));
			label2.setSize(375, 100);
			

			label3 = new JLabel("Kelvin: "+Conversion.getOutputk(), JLabel.CENTER);
			label3.setFont(new java.awt.Font("Times New Roman", 1, 20));
			label3.setSize(375, 100);
			

			
			add(label1, BorderLayout.NORTH);
			add(label2,BorderLayout.CENTER);
			add(label3,BorderLayout.SOUTH);
		
	}
	

}
}