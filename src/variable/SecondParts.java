package variable;

import javax.swing.JOptionPane;

public class SecondParts {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input Your Name");
		
		JOptionPane.showMessageDialog(null, "Your name is " + name + "!");
		
		System.out.println("Your name is " + name + "!");

	}

}
