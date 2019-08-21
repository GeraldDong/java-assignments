package namesurfer.simplification;
/*
 * File: namesurfer.solution.NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.ConsoleProgram;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NameSurfer extends ConsoleProgram implements NameSurferConstants {

    /**
     * This method has the responsibility for reading in the data base
     * and initializing the interactors at the top of the window.
     */
    public void init() {
        ArrayList<String> lines = readLinesFromFile("res/names-data.txt");
        db = new NameSurferDataBase(lines);

        // You fill this in, along with any helper methods //
    }

    /**
     * A helper method
     * DO NOT MODIFY THIS METHOD
     */
    private ArrayList<String> readLinesFromFile(String filename) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader rd = new BufferedReader(new FileReader(filename));
            while (true) {
                String line = rd.readLine();
                if (line == null) {
                    break;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return lines;
    }

    /**
     * This class is responsible for detecting when the buttons are
     * clicked, so you will have to define a method to respond to
     * button actions.
     */
    public void actionPerformed(ActionEvent e) {
        // You fill this in //
    }

    /**
     * This class is responsible for detecting when the the canvas
     * is resized. This method is called on each resize!
     */
    public void componentResized(ComponentEvent e) {
        redraw();
    }

    /**
     * A helper method that we *strongly* recommend. Redraw clears the
     * entire display and repaints it. Consider calling it when you change
     * anything about the display.
     */
    private void redraw() {
        // You fill this in //
        drawHorizontalLines();
        drawVerticalLines();
        drawDecadeLabels();
        plotEntries();
    }

    /**
     * Plot all the name entries one by one
     */
    private void plotEntries() {

    }

    /**
     * Plot one name entry with specified color and unit height (for one rank diff)
     *
     * @param nameSurferEntry
     * @param color
     * @param unitHeight
     */
    private void plotEntry(NameSurferEntry nameSurferEntry, Color color, double unitHeight) {
    }

    /**
     * Plot a line/curve with the data points and color provided
     *
     * @param xs
     * @param ys
     * @param color
     */
    private void plotEntryLine(int[] xs, int[] ys, Color color) {
    }

    /**
     * Plot labels with the color provided
     *
     * @param nameSurferEntry
     * @param xs
     * @param ys
     * @param color
     */
    private void plotEntryLabels(NameSurferEntry nameSurferEntry, int[] xs, int[] ys, Color color) {
    }

    /**
     * Draw the text labels for each decade - step 3 of milestone 4
     */
    private void drawDecadeLabels() {
    }

    /**
     * Draw vertical lines of the background - step 2 of milestone 4
     */
    private void drawVerticalLines() {
    }

    /**
     * Draw horizontal lines of the background - step 1 of milestone 4
     */
    private void drawHorizontalLines() {
    }

    private NameSurferDataBase db;

    private final static Color[] COLORS = {Color.BLACK, Color.RED, Color.BLUE, Color.MAGENTA};
}
