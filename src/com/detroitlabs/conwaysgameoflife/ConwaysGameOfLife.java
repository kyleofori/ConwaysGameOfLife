package com.detroitlabs.conwaysgameoflife;

/**
 * Created by kyleofori on 9/25/14.
 */
public class ConwaysGameOfLife {
    public static void main(String[] args) {

        Grid ConwayGrid = new Grid();

        boolean[][] theSetup = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false}
        };

        ConwayGrid.setGrid(theSetup);
    }
}
