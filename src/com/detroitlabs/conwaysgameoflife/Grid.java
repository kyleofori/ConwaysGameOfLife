package com.detroitlabs.conwaysgameoflife;

/**
 * Created by kyleofori on 9/25/14.
 */
public class Grid {
    boolean[][] Grid = new boolean[5][5];

    public void setGrid(boolean[][] grid) {
        Grid = grid;
    }

    public boolean[][] getGrid(){
        return Grid;
    }
}
