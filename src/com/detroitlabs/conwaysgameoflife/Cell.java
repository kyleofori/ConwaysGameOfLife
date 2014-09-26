package com.detroitlabs.conwaysgameoflife;

/**
 * Created by kyleofori on 9/25/14.
 */
public class Cell {
    //sticking with no cells for now, if it becomes clear that they're necessary, I'll make cell objects with states
    //alive and dead
    private boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }
}
