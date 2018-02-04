/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
    	Robot jimmy = new Robot();

        // 3. Put the robot's pen down
jimmy.hide();
    	jimmy.penDown();

        // 6. Make the robot move as fast as possible
jimmy.setSpeed(1000);
Random bob = new Random();
        // 5. Do everything below here 4 times
for (int i = 0; i < 360; i++) {
jimmy.setPenColor(bob.nextInt(256),bob.nextInt(256),bob.nextInt(256));
        //         2. Move your robot 200 pixels
jimmy.move(1);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
jimmy.turn(1);
}

    }
}
