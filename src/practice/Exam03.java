package practice;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputNetworkService = JOptionPane.showInputDialog("Enter your Network Service");
		String inputPN = JOptionPane.showInputDialog("Enter your Phone Number");
		String inputName = JOptionPane.showInputDialog("Enter your Name");
		
		String one = (inputName + "님은 " + inputNetworkService + "에 " + inputPN);
		
		JOptionPane.showMessageDialog(null, one +"로 가입되셨습니다.");
	}

}
