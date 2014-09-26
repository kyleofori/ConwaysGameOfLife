package com.detroitlabs.conwaysgameoflife;

/**
 * Created by kyleofori on 9/25/14.
 */
public class ConwaysGameOfLife {
    public static void main(String[] args) {


        Grid ConwayGrid = new Grid();
        final boolean _ = false;
        final boolean X = true;


        boolean[][] theSetup = {
                {_, _, _, _, _},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false}
        };

        ConwayGrid.setGrid(theSetup);

        int t, i;
        for (t=0; t<5; ++t) {
            for (i=0; i<5; ++i) {
                if (theSetup[t][i] = true)
                System.out.print(theSetup[t][i] + " ");
            }
            System.out.println();
        }
    }
}


