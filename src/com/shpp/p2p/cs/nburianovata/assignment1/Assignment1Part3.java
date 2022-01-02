package com.shpp.p2p.cs.nburianovata.assignment1;


public class Assignment1Part3 extends Karel {

    /*
     * Before: Karel looks to the east
     * After: Karel found the middle on the south line
     */
    public void run() throws Exception {

        putBeeperInEachCell();

        /* collect extra beeper */
        while (beepersPresent()) {
            goToForward();//move to the wall
            goToForwardPick();//pick up the first beeper
            oneStepToForward();//go one step with beeper
        }

        putLastBeeper();

    }

    /*
     * Before: Karel looks to the east
     * After: Karel put all beepers  on the south line and looks to the west
     */
    private void putBeeperInEachCell() throws Exception {
        goToForwardPut();
        turnBack();
    }

    /*
     * Before: Karel collected all the beeper
     * After: Karel turned around and put  last beeper
     */
    private void putLastBeeper() throws Exception {
        turnBack();//turned around
        oneStepToForward();//one step
        putBeeper();//put where pick
    }

    /*
     * Before: any
     * After: Karel moves one step
     */
    private void oneStepToForward() throws Exception {
        if (frontIsClear()) {
            move();
        }
    }


    /*
     * Before: any
     * After: Karel moves to the wall and turned around
     */
    private void goToForward() throws Exception {

        while (frontIsClear()) {
            move();
        }
        turnBack();
    }

    /*
     * Before: Karel looks at the line with beepers
     * After: Karel picks the first beeper
     */
    private void goToForwardPick() throws Exception {

        /* if there are no beepers then move */
        while (noBeepersPresent()) {
            move();
        }

        /* if there is beeper then pick first beeper */
        if (beepersPresent()) {
            pickBeeper();
        }
    }

    /*
     * Before: any
     * After: Karel put all beepers  on the south line to the wall
     */
    private void goToForwardPut() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            move();
            putBeeper();
        }
    }

}
