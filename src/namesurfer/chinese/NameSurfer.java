package namesurfer.chinese;
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

    // TODO: 请添加必要的成员变量
    private NameSurferDataBase db;
    private final static Color[] COLORS = {Color.BLACK, Color.RED, Color.BLUE, Color.MAGENTA};


    /**
     * 该函数主要负责初始化，包括创建一个NameSurferDatabase数据库，以及设置好GUI元素。
     */
    public void init() {
        ArrayList<String> lines = readLinesFromFile("res/names-data.txt");
        db = new NameSurferDataBase(lines);

        // TODO: 请完善和修改这个函数 //
    }

    /**
     * 该函数主要处理用户对按钮的点击
     */
    public void actionPerformed(ActionEvent e) {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * 该函数将整个画面清除，然后重新绘制所有数据点
     */
    private void redraw() {
        // TODO: 请完善和修改这个函数 //
        drawHorizontalLines();
        drawVerticalLines();
        drawDecadeLabels();
        plotEntries();
    }

    /**
     * 该函数绘制所有用户输入的NameSurferEntry
     */
    private void plotEntries() {
        // TODO: 请完善和修改这个函数 //

    }

    /**
     * 该函数根据用户提供的参数，用指定颜色绘制一个NameSurferEntry
     */
    private void plotEntry(NameSurferEntry nameSurferEntry, Color color) {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * 该函数根据用户提供的参数，用指定颜色绘制一条线
     */
    private void plotEntryLine(int[] xs, int[] ys, Color color) {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * 该函数根据用户提供的参数，用指定颜色绘制人名标签
     */
    private void plotEntryLabels(NameSurferEntry nameSurferEntry, int[] xs, int[] ys, Color color) {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * 该函数绘制十年标签
     */
    private void drawDecadeLabels() {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * 该函数绘制背景竖线
     */
    private void drawVerticalLines() {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * 该函数绘制背景横线
     */
    private void drawHorizontalLines() {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * 注意：请不要修改此函数！！
     */
    public void componentResized(ComponentEvent e) {
        redraw();
    }

    /**
     * 注意：请不要修改此函数！！
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
}
