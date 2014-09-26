package com.detroitlabs.conwaysgameoflife;

/**
 * Created by kyleofori on 9/25/14.
 */
public class Grid {
    Cell[][] Grid = new Cell[5][5];

    public void setGrid(Cell[][] grid) {
        Grid = grid;
    }

    public Cell[][] getGrid(){
        return Grid;
    }
}
