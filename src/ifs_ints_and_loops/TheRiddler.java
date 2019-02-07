package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		JOptionPane.showMessageDialog(null, "Welcome to The Riddler");
		String play = JOptionPane.showInputDialog("Are you ready to play?");
		if (play.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Get Ready");
		}
		
		String america = JOptionPane.showInputDialog("What was the name of the first president of the United States of America?");
		if (america.contentEquals("George Washington")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
			JOptionPane.showMessageDialog(null, "Your Score = "+score);
			}
		else {
			JOptionPane.showMessageDialog(null, "Wrong"
					+ "The correct answer is George washington");
		}
		String Loteria=JOptionPane.showInputDialog("What is the name of the current President on the Loteria cards?");
		if (Loteria.equals("El Pendejo")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is = "+score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. You dum as Shit");
			JOptionPane.showMessageDialog(null, "Your score is = "+score);
		}
		JOptionPane.showMessageDialog(null, "Your Final Score Is "+score);
	}
}
