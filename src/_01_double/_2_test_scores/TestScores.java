package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String test=JOptionPane.showInputDialog("what is your test score?");
		double score=Double.parseDouble(test);
		
		if(score==100) {
			JOptionPane.showMessageDialog(null, "great job!");
		}
		
		else if(score>90) {
			JOptionPane.showMessageDialog(null, "good job");
			
		}
		else if(score<90 && score>80) {
			JOptionPane.showMessageDialog(null, "ur fine ");
		
		}
		else if(score<80 && score>70) {
			JOptionPane.showMessageDialog(null, "eh");
		}
		else if(score<70) {
			JOptionPane.showMessageDialog(null, "U SUCK");
		}
	}
}
