package variable;

import javax.swing.JOptionPane;

public class NextYearAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age = JOptionPane.showInputDialog("Enter your age of this year");
		
		int ageInt = Integer.parseInt(age);
		int nextyearage = ageInt + 1;
		
		
		JOptionPane.showMessageDialog(null, "Your next age is " + nextyearage);
	}

}
