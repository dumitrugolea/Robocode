package eagle;

import robocode.*;
// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Eagle - a robot by (your name here)
 */
public class Eagle extends AdvancedRobot {
	private byte moveDirection = 1;

	/**
	 * run: Eagle's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Robot main loop
		while (true) {
			// Replace the next 4 lines with any behavior you would like
			turnGunRight(99999);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like

		if (getTime() % 5 == 0) {
			moveDirection *= -1;
			setAhead(150 * moveDirection);
		}
	
		if (e.getDistance() < 200) {
			fire(3);
		} 
		else {
			
			fire(1);
		}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(45);
		back(100);
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		moveDirection *= -1;
	}

	public void onHitRobot(HitRobotEvent event) {
		moveDirection *= -1;
		back(50);
		ahead(100);	    
	}

	public void goCorner() {
		back(100);
		turnRight(45);
	}
}
