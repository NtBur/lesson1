package com.shpp.p2p.cs.nburianovata.assignment1;


public class Assignment1Part1 extends Karel {

    /*
     * Before: Karel is on the start
     * After: Karel with newspaper on the start
     */
    public void run() throws Exception {

        /* Karel goes to the newspaper */
        goToNewspaper();

        /* Karel picks up the newspaper */
        pickUpNewspaper();

        /* Karel happily returns */
        goBack();
    }

    /*
     * Before: Karel stands in the northwest
     * After: Karel stands in front of the newspaper
     */
    private void goToNewspaper() throws Exception {
        goToForward();//moving forward
        turnRight();//turned right
        oneStepAndLeft();//took a step and turned left
        goToForward();//moving forward
    }


    /*
     * Before: any
     * After: Karel goes two steps
     */
    private void goToForward() throws Exception {
        move();
        move();
    }


    /*
     * Before: any
     * After: Karel goes one step and turned 90 degrees counterclockwise
     */
    private void oneStepAndLeft() throws Exception {
        move();
        turnLeft();
    }

    /*
     * Before: Karel stands in front of the newspaper
     * After: Karel with newspaper
     */
    private void pickUpNewspaper() throws Exception {
        /* pick up if there is a newspaper */
        if (beepersPresent()) {
            pickBeeper();
        }
    }

    /*
     * Before: Karel looks to the east
     * After: Karel stands in the northwest and looks to the east
     */
    private void goBack() throws Exception {
        turnAround();//turned around
        goToForward();//moving forward
        turnRight();//turned right
        oneStepAndLeft();//took a step and turned left
        goToForward();//moving forward
        turnAround();//turned around
    }


}
