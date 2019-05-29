package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot robo[] = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robo.length; i++) {
			robo[i] = new Robot();
			robo[i].setX(50 + 200 * i);
			robo[i].setY(550);
			robo[i].setSpeed(15);
			System.out.println("new robot");
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		boolean quit = false;
		while (quit == false) {
			for (int i = 0; i < robo.length; i++) {
				robo[i].move(rand.nextInt(50));
				if (robo[i].getY() < 70) {
					quit = true;
					robo[i].sparkle();
					robo[i].turn(360);
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		// 7. declare that robot the winner and throw it a party!

	}
}
