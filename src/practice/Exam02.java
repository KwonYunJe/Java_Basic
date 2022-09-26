package practice;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		String inputHeight = JOptionPane.showInputDialog("Enter your height");
		double height = Double.parseDouble(inputHeight);
		double weight = (height - 100) * 0.9;
		
		System.out.println("Your height " + height + " appropriate weight is " + weight);

	}

}
