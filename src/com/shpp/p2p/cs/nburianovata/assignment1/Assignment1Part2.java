package com.shpp.p2p.cs.nburianovata.assignment1;


public class Assignment1Part2 extends Karel {

    /*
     * Before: Karel is on the start
     * After: Karel completed the columns
     */
    public void run() throws Exception {
        goToWorldOneColumn();

        while (frontIsClear()) {
            turnLeft();
            goToForwardChecksBeeper();//Karel put the beeper
            turnBack();//turned around
            goToForwardChecksBeeper();//go to back and checks beeper
            turnLeft();//turned left
            betweenColumn();//went between the columns
            goForLastColumn();
        }
    }

    /*
     * Before: Karel looks at the east, right wall
     * After: Karel looks at the north, left a new column
     */
    private void betweenColumn() throws Exception {

        /* between the columns 4 steps*/
        if (frontIsClear()) {
            for (int i = 0; i < 4; i++) {
                move();
            }
        }
    }

    /*
     * Before: any
     * After: Karel moves while the front is clean and put beeper
     */
    private void goToForwardChecksBeeper() throws Exception {

        if (noBeepersPresent()) {
            putBeeper();
        }
        /*for a wall with one stone*/
        if (frontIsBlocked()) {
            if (rightIsBlocked()) {
                turnLeft();
            }
        }
        while (frontIsClear()) {

            /* Karel puts beeper */
            putBeeperIfNotBeeper();

            /* Karel moves if there are beeper */
            move();
        }

    }

    /*
     * Before: any
     * After: Karel puts beeper where there is none
     */
    private void putBeeperIfNotBeeper() throws Exception {

        if (noBeepersPresent()) {
            putBeeper();
        }
    }


    /*put the beeper if the last Column*/
    private void goForLastColumn() throws Exception {
        if (frontIsBlocked()) {
            if (rightIsBlocked()) {
                turnLeft();
                goToForwardChecksBeeper();
            }
        }
    }

    private void goToWorldOneColumn() throws Exception {
        if (frontIsBlocked()) {
            if (rightIsBlocked()) {
                turnLeft();
            }
        }
    }
}
