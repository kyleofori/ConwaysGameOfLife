package com.detroitlabs.conwaysgameoflife;

import com.sun.tools.javac.util.List;

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
        int t = 0, i = 0;
        int cTL = countTheLiving(makeNeighborCellsList(grid, t, i));
        for(t=0; t<5; t++) {
            for (i=0; i<5; i++) {
                if(grid.getGrid()[t][i].getAlive()) {
                    if(cTL==0 || cTL==1 || cTL>4/*has 0, 1, or 4-8 living neighbors*/)
                    {
                        //cell should die
                        grid.getGrid()[t][i].setAlive(false);
                    } //otherwise the cell stays alive
                }
                else
                {
                    if(cTL == 3)
                    {
                        //cell comes to life
                        grid.getGrid()[t][i].setAlive(true);
                    } // otherwise the cell stays dead
                }
            }
            //add the new boolean value into gridOnDeck
        }
        //take in the current grid, update it to the next grid
        return gridOnDeck;
    }

    public Cell getECell(Grid grid, int t, int i) {
        return grid.getGrid()[t][i+1];
    }

    public Cell getNECell(Grid grid, int t, int i) {
        return grid.getGrid()[t-1][i+1];
    }

    public Cell getNCell(Grid grid, int t, int i) {
        return grid.getGrid()[t-1][i];
    }

    public Cell getNWCell(Grid grid, int t, int i) {
        return grid.getGrid()[t-1][i-1];
    }

    public Cell getWCell(Grid grid, int t, int i) {
        return grid.getGrid()[t][i-1];
    }

    public Cell getSWCell(Grid grid, int t, int i) {
        return grid.getGrid()[t+1][i-1];
    }

    public Cell getSCell(Grid grid, int t, int i) {
        return grid.getGrid()[t+1][i];
    }

    public Cell getSECell(Grid grid, int t, int i) {
        return grid.getGrid()[t+1][i+1];
    }

    public ArrayList makeNeighborCellsList(Grid grid, int t, int i) {
        ArrayList<Cell> neighborCells = new ArrayList<Cell>();
        neighborCells.add(getECell(grid, t, i));  //arguments: grid, int t, int i (last two for cell position).
        neighborCells.add(getNECell(grid, t, i));
        neighborCells.add(getNCell(grid, t, i));
        neighborCells.add(getNWCell(grid, t, i));
        neighborCells.add(getWCell(grid, t, i));
        neighborCells.add(getSWCell(grid, t, i));
        neighborCells.add(getSCell(grid, t, i));
        neighborCells.add(getSECell(grid, t, i));
        return neighborCells;
    }

    public int countTheLiving(ArrayList<Cell> makeNeighborCellsList) {
        int i = 0;
        for (Cell x: makeNeighborCellsList) {
            x.getAlive();
            i++;
        }
        return i;
    }
}
