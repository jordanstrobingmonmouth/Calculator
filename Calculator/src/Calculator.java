import java.awt.event.*;
import java.awt.*;
import javax.swing.*;





public class Calculator extends JFrame implements ActionListener {
	

	
	private static JFrame frame;
	
	private static JPanel panel;
	
	static JTextField box;
	
	private static String input;
	
	private static String answer1, answer2, answer3;
	
	
	/*
	 *the main method creates the GUI and it's buttons
	 */
	public static void main(String[] args) {
		
		//this creates the calculator object
		Calculator calc = new Calculator();
		
		//this sets all the the inputs to empty
		answer1 = answer2 = answer3 = "";
		
		//this creates the frame
		frame = new JFrame();
		
		
		//this creates the buttons
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton add = new JButton("+");
		JButton subtract = new JButton("-");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		JButton decimal = new JButton(".");
		JButton clear = new JButton("C");
		JButton enter = new JButton("=");
		
		//this create
		box = new JTextField();
		box.setEditable(false);
		
		// this prints in the box box.setText();
		
		panel = new JPanel();
		//this adds the buttons to the panel, 'box' is where the input numbers go
		panel.add(box);
		panel.add(zero);
		panel.add(one);
		panel.add(two);
		panel.add(add);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(subtract);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);
		panel.add(multiply);
		panel.add(nine);
		panel.add(decimal);
		panel.add(clear);
		panel.add(divide);
		panel.add(enter);
		
		//this makes the background color and the size of the border, as well as orders the buttons
		panel.setBackground(Color.gray); 
		panel.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
		panel.setLayout(new GridLayout(0,4));
		
		//this create the frame
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.pack();
		frame.setVisible(true);
		

		
		//this makes the buttons in the calculator give input;
		zero.addActionListener(calc);
		one.addActionListener(calc);
		two.addActionListener(calc);
		three.addActionListener(calc);
		four.addActionListener(calc);
		five.addActionListener(calc);
		six.addActionListener(calc);
		seven.addActionListener(calc);
		eight.addActionListener(calc);
		nine.addActionListener(calc);
		add.addActionListener(calc);
		subtract.addActionListener(calc);
		multiply.addActionListener(calc);
		divide.addActionListener(calc);
		clear.addActionListener(calc);
		decimal.addActionListener(calc);
		enter.addActionListener(calc);
		
		
		
	}
	
	
	
		
	

	

	
public void actionPerformed(ActionEvent a) {
		
		input = a.getActionCommand();
		
		
		  
        // to check if input is a number or decimal
        if ((input.charAt(0) >= '0' && input.charAt(0) <= '9') || input.charAt(0) == '.') { 
        	
            //Check for input to answer2  
            if (!answer2.equals("")) 
            	
            	answer3 = answer3 + input; 
            else
            	answer1 = answer1 + input; 
  
            // add the answer to the white box
            box.setText(answer1 + answer2 + answer3); 
        } 
        else if (input.charAt(0) == 'C') { 
        	
            // If character is C, screen will be cleared
        	answer1 = answer2 = answer3 = ""; 
  
            // add the answer to the white box
            box.setText(answer1 + answer2 + answer3); 
        } 
            // If character is '='
        else if (input.charAt(0) == '=') { 
            // store final answer as x
            double x; 
  
            // If operator is addition, subtraction, multiplication, or division, final solution will change 
            // and convert to double to do operation.
            
            if (answer2.equals("+")) 
                x = (Double.parseDouble(answer1) + Double.parseDouble(answer3)); 
            else if (answer2.equals("-")) 
                x = (Double.parseDouble(answer1) - Double.parseDouble(answer3)); 
            else if (answer2.equals("/")) 
                x = (Double.parseDouble(answer1) / Double.parseDouble(answer3)); 
            else
                x = (Double.parseDouble(answer1) * Double.parseDouble(answer3)); 
  
            // add the answer to the white box
            box.setText(answer1 + answer2 +answer3 + "=" + x); 
  
            // Change answer1 to the final answer and makes answer 2 and 3 empty.
            answer1 = Double.toString(x); 
  
            answer2 = answer3 = ""; 
        } 
        else { 
            // Check to see if answer 2 or answer 3 is empty.
            if (answer2.equals("") || answer3.equals("")) 
            	answer2 = input; 
            // If it's not empty
            else { 
            	// x is final answer.
                double x; 
  
                // this does the operation.
                if (answer2.equals("+")) 
                    x = (Double.parseDouble(answer1) + Double.parseDouble(answer3)); 
                else if (answer2.equals("-")) 
                    x = (Double.parseDouble(answer1) - Double.parseDouble(answer3)); 
                else if (answer2.equals("/")) 
                    x = (Double.parseDouble(answer1) / Double.parseDouble(answer3)); 
                else
                    x = (Double.parseDouble(answer1) * Double.parseDouble(answer3)); 
  
                
                answer1 = Double.toString(x); 
  
                answer2 = input; 
                
                answer3 = ""; 
            } 
  
            // add the answer to the white box
            box.setText(answer1 + answer2 + answer3);
        } 	
    } 
}	
	