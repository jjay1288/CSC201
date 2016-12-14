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
	private static double output;


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
		JRadioButton ftc = new JRadioButton("Fahrenheit -> Celcius");
		JRadioButton ctf = new JRadioButton("Celcius -> Fahrenheit");
		ButtonGroup bG = new ButtonGroup();
		ftc.setFont(new java.awt.Font("Times New Roman", 1, 22));
		ctf.setFont(new java.awt.Font("Times New Roman", 1, 22));
		ftc.setSelected(true);
		bG.add(ftc);
		bG.add(ctf);
		panel1.add(ftc);
		panel1.add(ctf);
		add(panel1);

		JPanel panel2=new JPanel();
		JButton ok=new JButton("Convert");
		panel2.add(ok);
		add(panel2, BorderLayout.SOUTH);
		ok.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						input=Double.parseDouble(textArea.getText());
						setVisible(false);
						if (ftc.isSelected()){
							output=(input-32.00)/1.8;
							setChoice(1);
						}
						else if (ctf.isSelected()){
							output=input*1.8+32;
							setChoice(2);
						}
						else{
							//Print Error
						}

						Output out = new Output();
						out.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						out.setSize(450,150);
						out.setVisible(true);
						Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
						out.setLocation(dim.width/2-out.getSize().width/2, dim.height/2-out.getSize().height/2);


					}

				}
				);
	}

	public static double getOutput() {
		return output;
	}

	public static int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		Conversion.choice = choice;
	}


	class Output extends JFrame{
		private final JLabel label1;
		public Output(){
			
			super ("Output");
			int choice = Conversion.getChoice();
			String message="";
			
			
			if (choice==1){
				message ="Result: "+ Conversion.getOutput()+" degrees Celcius";
			}
			else if (choice == 2){
				message = "Result: "+ Conversion.getOutput()+" degrees Fahrenheit";
			}

			label1 = new JLabel(message,
	                JLabel.CENTER);
			label1.setFont(new java.awt.Font("Times New Roman", 1, 22));
			label1.setSize(375, 200);
			
			add(label1);
		
	}

}
}
