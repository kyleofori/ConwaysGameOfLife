package com.detroitlabs.conwaysgameoflife;

/**
 * Created by kyleofori on 9/25/14.
 */
public class ConwaysGameOfLife {
    public static void main(String[] args) {


        Grid ConwayGrid = new Grid();
//        final boolean _ = false;


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


