import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//this class builds the gui for the temperature converter 
public class TempConvGui extends JFrame implements ActionListener {
	//attributes of the gui
		private JPanel panel;
		private JLabel label;
		private JTextField input;
		private JButton F2C;
		private JButton C2F;
		private JLabel response;
		private JTextField answer;
	
	//no args constructor
	public TempConvGui(){
		panel = new JPanel();
		label = new JLabel("Enter the temperature");
		input = new JTextField(15);
		F2C = new JButton("Convert to Celcius");
		C2F = new JButton("Convert to Farenheit");
		response = new JLabel("Converted temperature: ");
		answer = new JTextField(5);
		answer.setEditable(false);
		panel.add(label);
		panel.add(input);
		panel.add(F2C);
		panel.add(C2F);
		C2F.addActionListener(this);
		F2C.addActionListener(this);
		panel.add(response);
		panel.add(answer);
		add(panel);
		
		setTitle("Temperature Converter");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}//ends the constructor
	
	
	public void actionPerformed(ActionEvent e){
		String Input;
		double result = 0.0;
		if (e.getSource() == F2C){
			Input = input.getText();
			result = (Double.parseDouble(Input) - 32.0) * 5.0 / 9.0;
			answer.setText(String.format("%.2f", result));
		}
		else if (e.getSource() == C2F){
			Input = input.getText();
			result = Double.parseDouble(Input) * 9.0 / 5.0 + 32.0;
			answer.setText(String.format("%.2f", result));
		}
	}
	//main method implementing the gui
	public static void main(String[] args){
		TempConvGui gui = new TempConvGui();
	}//end main method
}//end class