import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	int count = 0;
	
	private JLabel label;
	
	private JFrame frame;
	
	private JPanel panel;
	
	static JTextField box;
	
	static Calculator calc = new Calculator();
	
	private String answer;
	
	private static String input;
	
	private static String solution1, solution2, solution3 = "";
	
	
	public Calculator(){
		
		frame = new JFrame();
		
		//JButton button = new JButton("Click");
		//button.addActionListener(this);
		
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
		
		//answer = (String) solution;
		
		box = new JTextField(answer);
		box.setEditable(false);
		
		// this prints in the box box.setText();
		
		panel = new JPanel();
		//panel.add(button);
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
		
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(60,60,40,60));
		panel.setLayout(new GridLayout(0,4));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Gui");
		frame.pack();
		frame.setVisible(true);
		
		
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

	

	@Override
	public void actionPerformed(ActionEvent e) {
		//count++;
		input = e.getActionCommand();
		//box.setText(input);
		
		  
        // if the value is a number 
        if ((input.charAt(0) >= '0' && input.charAt(0) <= '9') || input.charAt(0) == '.') { 
            // if operand is present then add to second no 
            if (!solution2.equals("")) 
                solution3 = solution3 + input; 
            else
                solution1 = solution1 + input; 
  
            // set the value of text 
            box.setText(solution1 + solution2 + solution3); 
        } 
        else if (input.charAt(0) == 'C') { 
            // clear the one letter 
            solution1 = solution2 = solution3 = ""; 
  
            // set the value of text 
            box.setText(solution1 + solution2 + solution3); 
        } 
        else if (input.charAt(0) == '=') { 
  
            double x; 
  
            // store the value in 1st 
            if (solution2.equals("+")) 
                x = (Double.parseDouble(solution1) + Double.parseDouble(solution3)); 
            else if (solution2.equals("-")) 
                x = (Double.parseDouble(solution1) - Double.parseDouble(solution3)); 
            else if (solution2.equals("/")) 
                x = (Double.parseDouble(solution1) / Double.parseDouble(solution3)); 
            else
                x = (Double.parseDouble(solution1) * Double.parseDouble(solution3)); 
  
            // set the value of text 
            box.setText(solution1 + solution2 + solution3 + "=" + x); 
  
            // convert it to string 
            solution1 = Double.toString(x); 
  
            solution2 = solution3 = ""; 
        } 
        else { 
            // if there was no operand 
            if (solution2.equals("") || solution3.equals("")) 
            	solution2 = input; 
            // else evaluate 
            else { 
                double x; 
  
                // store the value in 1st 
                if (solution2.equals("+")) 
                    x = (Double.parseDouble(solution1) + Double.parseDouble(solution3)); 
                else if (solution2.equals("-")) 
                    x = (Double.parseDouble(solution1) - Double.parseDouble(solution3)); 
                else if (solution2.equals("/")) 
                    x = (Double.parseDouble(solution1) / Double.parseDouble(solution3)); 
                else
                    x = (Double.parseDouble(solution1) * Double.parseDouble(solution3)); 
  
                // convert it to string 
                solution1 = Double.toString(x); 
  
                // place the operator 
                solution2 = input; 
  
                // make the operand blank 
                solution3 = ""; 
            } 
  
            // set the value of text 
            box.setText(solution1 + solution2 + solution3);
        } 
    } 
		
		
		
		
		
		
	
	
	/**public static void solve(String calculation) {
		char[] array = calculation.toCharArray();
		String stringFirst = "";
		String stringSecond = "";
		String stringThird = "";
		
		for(int i=0; i<array.length; i++) {
			if ((array[i] >= '0' && array[i] <= '9') || (array[i] == '.')) {
				if (stringThird.isEmpty()) {
					stringFirst += array[i];
				}
				else {
					stringSecond += array[i];
				}
				
			}
			if ((array[i] == '+') || (array[i] == '-') || (array[i] == '/') || (array[i] == '*')){
				stringThird += array[i];
			}
		}
		
		if (stringThird.equalsIgnoreCase("+")) {
			solution = Double.parseDouble(stringFirst) + Double.parseDouble(stringSecond);
		}
		
		else if (stringThird.equalsIgnoreCase("-")) {
			solution = Double.parseDouble(stringFirst) - Double.parseDouble(stringSecond);
		}
		
		else if (stringThird.equalsIgnoreCase("*")) {
			solution = Double.parseDouble(stringFirst) * Double.parseDouble(stringSecond);
		}
		
		else if (stringThird.equalsIgnoreCase("/")) {
			solution = Double.parseDouble(stringFirst) / Double.parseDouble(stringSecond);
		}
		
		System.out.println(solution);
	}*/
	public static void main(String[] args) {
		System.out.println(solution1+solution2+solution3);
	

	}
	}
