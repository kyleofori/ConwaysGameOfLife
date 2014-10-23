package com.detroitlabs.conwaysgameoflife;

/**
 * Created by kyleofori on 9/25/14.
 */
public class Cell {

    private boolean alive;

    private Cell(boolean alive) {
        this.alive = alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean getAlive() {
        return alive;
    }
}
