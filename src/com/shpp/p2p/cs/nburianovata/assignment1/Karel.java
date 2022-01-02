package com.shpp.p2p.cs.nburianovata.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Karel extends KarelTheRobot {

    /*
     * Before: any
     * After: Karel turned 180 degrees counterclockwise
     */
    public void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    /*
     * Before: any
     * After: Karel turned 90 degrees clockwise
     */
    public void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /*
     * Before: any
     * After: Karel turned 180 degrees counterclockwise
     */
    public void turnBack() throws Exception {
        turnLeft();
        turnLeft();
    }
}
