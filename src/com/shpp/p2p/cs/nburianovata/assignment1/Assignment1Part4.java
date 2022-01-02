package com.shpp.p2p.cs.nburianovata.assignment1;


public class Assignment1Part4 extends Karel {

    /*
     * Before: Karel looks to the east
     * After: Karel built a chessboard
     */
    public void run() throws Exception {
        /* if one cell is the whole world */
        forSmallWorld();
        forThinWorld();

        while (frontIsClear()) {
            putBeeper();//put beeper in first cell
            firstLine();//put beepers in first line
            goToFirstCell();//return to the first cell
            goToNextLine();//go to a new line
            secondLine();//put beepers in second line
            goToFirstCell();//return to the first cell
            goToNextLine();//go to a new line
        }
    }

    /*
     * Before: Karel looks to the west
     * After: Karel on the new line and looks to the east
     */
    private void goToNextLine() throws Exception {
        turnRight();
        if (frontIsClear()) {
            move();
            turnRight();
        }
    }

    /*
     * Before: Karel looks to the east
     * After: Karel built the first line and looks to the west
     */
    private void firstLine() throws Exception {
        while (frontIsClear()) {
            StepNotBeeper();
            StepWithBeeper();
        }
        turnBack();
    }

    /*
     * Before: any
     * After: Karel goes to one cell
     */
    private void StepNotBeeper() throws Exception {
        if (frontIsClear()) {
            move();
        }
    }

    /*
     * Before: any
     * After: Karel goes to one cell and put beeper
     */
    private void StepWithBeeper() throws Exception {
        if (frontIsClear()) {
            move();
            putBeeper();
        }
    }

    /*
     * Before: Karel looks to the east
     * After: Karel built the second line and looks to the west
     */
    private void secondLine() throws Exception {
        while (frontIsClear()) {
            StepWithBeeper();
            StepNotBeeper();
        }
        turnBack();
    }


    /*
     * Before: Karel looks to the west and behind  wall front wall
     * After: Karel looks to the west and front wall
     */
    private void goToFirstCell() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }

    /*
     * Before: Karel has one cell
     * After: Karel built a one beeper
     */
    private void forSmallWorld() throws Exception {
        if (frontIsBlocked()) {
            if (leftIsBlocked()) {
                putBeeper();
            }
        }
    }

    private void forThinWorld() throws Exception {
        if (frontIsBlocked()) {
            turnLeft();
        }
    }
}
