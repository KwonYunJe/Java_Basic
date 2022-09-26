package practice;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = JOptionPane.showInputDialog("Enter height cm");
		String width = JOptionPane.showInputDialog("Enter width cm");
		
		int heightInt = Integer.parseInt(height);
		int widthInt = Integer.parseInt(width);
		
		int area = heightInt * widthInt ;
		
		System.out.println("Height is " +heightInt + " width is " + widthInt + " Area is " + area);
		
	}

}
