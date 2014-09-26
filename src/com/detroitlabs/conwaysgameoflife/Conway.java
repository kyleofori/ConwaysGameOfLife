package com.detroitlabs.conwaysgameoflife;

import java.util.ArrayList;

/**
 * Created by kyleofori on 9/26/14.
 */
public class Conway {
    private int generationNumber;
    Grid gridOnDeck = new Grid();

    //the method updateGrid() will accept a Grid argument and return a Grid.
    //the accepted grid should be the ConwayGrid.
    public Grid updateGrid(Grid grid) {
        //for(boolean x: ConwaysGameOfLife.ConwayGrid.getGrid()) {   //<--Why isn't this working??
        //see chapter on arrays for rules on for-each loops of multidimensional arrays
            //change grid according to the rules
        int t,i;
        for(t=0; t<5; t++) {
            for (i=0; i<5; i++) {
                if(grid.getGrid()[t][i]) {
                    if(/*has 0, 1, or 4-8 living neighbors*/)
                    {
                        //cell should die
                        grid.getGrid()[t][i] = false;
                    } //otherwise the cell stays alive
                }
                else
                {
                    if(/*has 3 living neighbors*/)
                    {
                        //cell comes to life
                        grid.getGrid()[t][i] = true;
                    } // otherwise the cell stays dead
                }
            }
            //add the new boolean value into gridOnDeck
        }
        //take in the current grid, update it to the next grid
        return gridOnDeck;
    }

    public boolean getECell(Grid grid, int t, int i) {
        return grid.getGrid()[t][i+1];
    }

    public boolean getNECell(Grid grid, int t, int i) {
        return grid.getGrid()[t-1][i+1];
    }

    public boolean getNCell(Grid grid, int t, int i) {
        return grid.getGrid()[t-1][i];
    }

    public boolean getNWCell(Grid grid, int t, int i) {
        return grid.getGrid()[t-1][i-1];
    }

    public boolean getWCell(Grid grid, int t, int i) {
        return grid.getGrid()[t][i-1];
    }

    public boolean getSWCell(Grid grid, int t, int i) {
        return grid.getGrid()[t+1][i-1];
    }

    public boolean getSCell(Grid grid, int t, int i) {
        return grid.getGrid()[t+1][i];
    }

    public boolean getSECell(Grid grid, int t, int i) {
        return grid.getGrid()[t+1][i+1];
    }

    public ArrayList makeNeighborCellsList(boolean currentCell) {
        ArrayList<boolean> neighborCells = new ArrayList<boolean> //You can't make an arraylist of primitive types, can you? Snap!!
    }
}
