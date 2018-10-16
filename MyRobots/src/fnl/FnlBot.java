package fnl;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.AdvancedRobot;
import java.awt.Color;

public class FnlBot extends Robot {
	
	public void run() {
		setColors(Color.green, Color.red, Color.yellow);
		turnLeft(getHeading() % 90);
		turnGunRight(90);
		while(true) {
			ahead(1000);
			turnRight(90);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}
	
}
