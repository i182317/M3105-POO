package angeldevil;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class SwingObserverExample {
	JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Est-ce que je peux rater un cours ?");
		AngelListener angel = new AngelListener();
		DevilListener devil = new DevilListener();
		frame.getContentPane().add(BorderLayout.CENTER, button);
		// Set frame properties frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);frame.setVisible(true);
		button.addActionListener(angel);
		button.addActionListener(devil);
	}
	
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Ne fais pas ça, tu pourrais être un jour défaillant !");
		}
	}
	
	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Allez, vas-y, ce n'est qu'une petite absence non justifiée de rien du tout !");
		}
	}
}
