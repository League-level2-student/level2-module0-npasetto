/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	//2 create an hint variable called hiddenButton
	int hiddenButton;
	int wrongs=0;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		Random rand = new Random();
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		int numberOfButtons=Integer.parseInt(JOptionPane.showInputDialog("Enter a positive number."));
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		buttons=new JButton[numberOfButtons];
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < buttons.length; i++) {
			buttons[i]=new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
			buttons[i].setPreferredSize(new Dimension(75,30));
		}
	
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		System.out.println("Hit the button with . on it. . will dissapear after a second.");
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		hiddenButton=rand.nextInt(numberOfButtons);
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		buttons[hiddenButton].setText(".");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked==buttons[hiddenButton]) {
			System.out.println("You win!");
			System.out.println("You got "+wrongs+" buttons wrong.");
			System.exit(0);
		}else {
			System.out.println("Try again.");
			wrongs++;
		}
		//18. else tell them to try again
	}
}
