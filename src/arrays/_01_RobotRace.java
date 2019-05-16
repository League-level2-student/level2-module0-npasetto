package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Random rand = new Random();
	Robot[] array = new Robot[3];
	for (int i = 0; i < array.length; i++) {
		array[i]=new Robot();
		array[i].moveTo(i*100+100, 500);
		array[i].setSpeed(20);
	}
	boolean finished=false;
	while(finished==false) {
	for (int i =0; i<array.length; i++) {
		array[i].move(rand.nextInt(i+1));
		if(array[i].getY()<0) {
			finished=true;
			System.out.println("robot "+(i+1)+" won!");
			break;
		}
	}
	}
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
