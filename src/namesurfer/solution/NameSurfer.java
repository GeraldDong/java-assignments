package namesurfer.solution;/*
 * File: namesurfer.solution.NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class NameSurfer extends GraphicsProgram implements NameSurferConstants {

    /**
     * This method has the responsibility for reading in the data base
     * and initializing the interactors at the top of the window.
     */
    public void init() {
        // You fill this in, along with any helper methods //
        db = new NameSurferDataBase("res/names-data.txt");

        nameLable = new JLabel("Name:");
        nameInputField = new JTextField(TEXT_FIELD_WIDTH);
        graphButton = new JButton("Graph");
        clearButton = new JButton("Clear");

        nameInputField.setActionCommand("NameInputField");
        nameInputField.addActionListener(this);

        add(nameLable, NORTH);
        add(nameInputField, NORTH);
        add(graphButton, NORTH);
        add(clearButton, NORTH);

        addActionListeners();
    }

    /**
     * This class is responsible for detecting when the buttons are
     * clicked, so you will have to define a method to respond to
     * button actions.
     */
    public void actionPerformed(ActionEvent e) {
        // You fill this in //
        if (e.getActionCommand().equals("Graph") || e.getActionCommand() == "NameInputField") {
            tryAddEntry();
        } else if (e.getActionCommand().equals("Clear")) {
            plottedEntries.clear();
        }
        redraw();
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
        clear();
        decadeWidth = (int) (getWidth() / 11.0);

        drawHorizontalLines();
        drawVerticalLines();
        drawDecadeLabels();
        plotEntries();
    }

    /**
     * Plot all the name entries one by one
     */
    private void plotEntries() {
        int numColors = COLORS.length;
        double unitHeight = computeUnitRankHeight();
        for (int i = 0; i < plottedEntries.size(); i++) {
            plotEntry(plottedEntries.get(i), COLORS[i % numColors], unitHeight);
        }
    }

    /**
     * Plot one name entry with specified color and unit height (for one rank diff)
     * @param nameSurferEntry
     * @param color
     * @param unitHeight
     */
    private void plotEntry(NameSurferEntry nameSurferEntry, Color color, double unitHeight) {
        int[] xs = new int[11];
        int[] ys = new int[11];

        // compute the coords
        for (int i = 0; i < 11; i++) {
            xs[i] = i * decadeWidth;
            int rank = nameSurferEntry.getRank(i);
            if (rank == 0) {
                ys[i] = getHeight() - GRAPH_MARGIN_SIZE;
            } else {
                ys[i] = (int) ((rank - 1) * unitHeight + GRAPH_MARGIN_SIZE);
            }
        }

        plotEntryLabels(nameSurferEntry, xs, ys, color);
        plotEntryLine(xs, ys, color);
    }

    /**
     * Plot a line/curve with the data points and color provided
     * @param xs
     * @param ys
     * @param color
     */
    private void plotEntryLine(int[] xs, int[] ys, Color color) {
        for (int i = 0; i < 10; i++) {
            GLine l = new GLine(xs[i], ys[i], xs[i + 1], ys[i + 1]);
            l.setColor(color);
            add(l);
        }
    }

    /**
     * Plot labels with the color provided
     * @param nameSurferEntry
     * @param xs
     * @param ys
     * @param color
     */
    private void plotEntryLabels(NameSurferEntry nameSurferEntry, int[] xs, int[] ys, Color color) {
        for (int i = 0; i < 11; i++) {
            String label_text = nameSurferEntry.getName() + " " + nameSurferEntry.getRank(i);
            GLabel label = new GLabel(label_text, xs[i], ys[i]);
            label.setColor(color);
            add(label);
        }
    }

    /**
     * Compute the height for each rank. Note top is 1 and bottom is 1000, differing by only 999
     * @return
     */
    private double computeUnitRankHeight() {
        int plottableHeight = getHeight() - 2 * GRAPH_MARGIN_SIZE;
        double height = plottableHeight / 999.0;
        return height;
    }

    /**
     * Draw the text labels for each decade - step 3 of milestone 4
     */
    private void drawDecadeLabels() {
        int y = getHeight() - DECADE_LABEL_MARGIN_SIZE;
        for (int i = 0; i < 11; i++) {
            int decade = 1900 + i * 10;
            int x = decadeWidth * i;
            GLabel label = new GLabel(Integer.toString(decade), x, y);
            add(label);
        }
    }

    /**
     * Draw vertical lines of the background - step 2 of milestone 4
     */
    private void drawVerticalLines() {
        for (int i = 0; i < 11; i++) {
            GLine l = new GLine(i * decadeWidth, 0, i * decadeWidth, getHeight());
            add(l);
        }
    }

    /**
     * The callback of clicking "Graph" or pressing "Enter"
     */
    private void tryAddEntry() {
        String name = nameInputField.getText();
        NameSurferEntry entry = db.findEntry(name);
        if (entry == null) {
            println(name + " not found");
        } else {
            plottedEntries.add(entry);
        }
    }

    /**
     * Draw horizontal lines of the background - step 1 of milestone 4
     */
    private void drawHorizontalLines() {
        GLine topLine = new GLine(0, GRAPH_MARGIN_SIZE, getWidth(), GRAPH_MARGIN_SIZE);
        GLine bottomLine = new GLine(0, getHeight() - GRAPH_MARGIN_SIZE, getWidth(), getHeight() - GRAPH_MARGIN_SIZE);

        add(topLine);
        add(bottomLine);
    }

    private JLabel nameLable;
    private JTextField nameInputField;
    private JButton graphButton;
    private JButton clearButton;
    private int decadeWidth;

    private NameSurferDataBase db;
    private ArrayList<NameSurferEntry> plottedEntries = new ArrayList<>();

    private final static Color[] COLORS = {Color.BLACK, Color.RED, Color.BLUE, Color.MAGENTA};
}
