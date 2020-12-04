import java.awt.BorderLayout;
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
		JButton clear = new JButton("CLEAR");
		JButton enter = new JButton("ENTER");
		
		box = new JTextField();
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
	}

	public static void main(String[] args) {
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
		
	}

}
