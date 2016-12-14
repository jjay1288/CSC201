	import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private final JButton[] buttons;
	private static final String[] names={"7", "8", "9","/", "4", "5", "6","*", "1", "2", "3", "-", "0",".","=","+"};

	private final GridLayout gridlayout;

	private final JTextField textArea;

	private final JPanel panel2;
	
	public Calculator(){
		
		super ("Calculator");
		
		setResizable(true);
		textArea=new JTextField();
		textArea.setEditable(true);
		Font bigFont = textArea.getFont().deriveFont(Font.PLAIN, 40f);
        textArea.setFont(bigFont);




		add(textArea, BorderLayout.NORTH);


		
		gridlayout=new GridLayout(4,4,5,5);
		panel2=new JPanel(gridlayout);

		buttons=new JButton[names.length];
		for (int count=0;count<names.length;count++){

			buttons[count]=new JButton(names[count]);
			panel2.add(buttons[count]);
				}

		add(panel2, BorderLayout.CENTER);
		}



		
		}
		
		
	

