import java.awt.Point;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

class checker{
private static boolean isNumeric(String str)
{
try
{
Double.parseDouble(str);
return true;
}
catch(IllegalArgumentException e)
{
	return false;
}
}
}

public class InputFrame {

	
	public static void main(String [] args)
	{
		
		JFrame userFrame = new JFrame();
		userFrame.setBounds(600, 300, 300, 200);
		userFrame.setVisible(true);
		userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userFrame.setLayout(null);
		
		String name;
		String phoneNum;
		
		name = JOptionPane.showInputDialog("Give me your name!");
		boolean badInput = true;
		while(badInput)
		{
			name = JOptionPane.showInputDialog("Give me your phone number!");
			if(phoneNum.isNumeric())
			{
				
			}
		}
	}
}
