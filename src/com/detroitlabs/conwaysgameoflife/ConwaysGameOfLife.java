package com.detroitlabs.conwaysgameoflife;

/**
 * Created by kyleofori on 9/25/14.
 */
public class ConwaysGameOfLife {
    public static void main(String[] args) {

        //This is definitely in experimental stages right now.
        //Two things going on: one is this boolean 2-D array theSetup,
        //and the other is the Grid ConwayGrid / Cell[][] theStartGrid.
        //The latter doesn't need to be two separate things to set,
        //and the former is currently only for display purposes.
        //Work on these next time you work on ConwaysGameOfLife.

        Grid ConwayGrid = new Grid();

        boolean[][] theSetup = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false}
        };

        Cell[][] theStartGrid = new Cell[5][5];


        for(Cell x: theStartGrid[1]) {
            x.setAlive(false);
        }

        for(Cell[] x: theStartGrid) {
            for (Cell y : x) {
                y.setAlive(false);
            }
            theStartGrid[1][2].setAlive(true);
            theStartGrid[2][2].setAlive(true);
            theStartGrid[3][2].setAlive(true);
        }

        for(int i=0; i<3; )

        ConwayGrid.setGrid(theStartGrid);

        int t, i;
        for (t=0; t<5; t++) {
            for (i=0; i<5; i++) {
                if (theSetup[t][i])
                {
                    System.out.print("\u2b1b");
                }
                else
                {
                    System.out.print("\u2b1c");
                }
            }
            System.out.println();
        }
    }
}


