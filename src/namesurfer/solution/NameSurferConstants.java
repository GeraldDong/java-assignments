package namesurfer.solution;/*
 * File: namesurfer.solution.NameSurferConstants.java
 * ------------------------------
 * This file declares several constants that are shared by the
 * different modules in the namesurfer.solution.NameSurfer application.  Any class
 * that implements this interface can use these constants.
 */

public interface NameSurferConstants {

/** The width of the application window */
	public static final int APPLICATION_WIDTH = 800;

/** The height of the application window */
	public static final int APPLICATION_HEIGHT = 600;

/** The name of the file containing the data */
	public static final String NAMES_DATA_FILE = "names-data.txt";

/** The width of the text field in the NORTH of the window */
	public static final int TEXT_FIELD_WIDTH = 16;

/** The first decade in the database */
	public static final int START_DECADE = 1900;

/** The number of decades */
	public static final int NDECADES = 11;

/** The maximum rank in the database */
	public static final int MAX_RANK = 1000;

/** The number of pixels to reserve at the top and bottom */
	public static final int GRAPH_MARGIN_SIZE = 20;

/** The number of pixels between the baseline of the decade labels and the bottom of the window */
	public static final int DECADE_LABEL_MARGIN_SIZE = GRAPH_MARGIN_SIZE / 4;

}
