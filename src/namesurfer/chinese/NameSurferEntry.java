package namesurfer.chinese;
/*
 * File: namesurfer.solution.NameSurferEntry.java
 * --------------------------
 * This class represents a single entry in the database.  Each
 * namesurfer.solution.NameSurferEntry contains a name and a list giving the popularity
 * of that name for each decade stretching back to 1900.
 */

public class NameSurferEntry implements NameSurferConstants {


    /**
     * Constructor: namesurfer.solution.NameSurferEntry(line)
     * Creates a new namesurfer.solution.NameSurferEntry from a data line as it appears
     * in the data file.  Each line begins with the name, which is
     * followed by integers giving the rank of that name for each
     * decade.
     */
    public NameSurferEntry(String line) {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * Public Method: getName()
     * Returns the name associated with this entry.
     */
    public String getName() {
        // TODO: 请完善和修改这个函数 //
        return null;
    }

    /**
     * Public Method: getRank(decade)
     * Returns the rank associated with an entry for a particular
     * decade.  The decade value is an integer indicating how many
     * decades have passed since the first year in the database,
     * which is given by the constant START_DECADE.  If a name does
     * not appear in a decade, the rank value is 0.
     */
    public int getRank(int decade) {
        // TODO: 请完善和修改这个函数 //
        return -1;
    }

    /**
     * Public Method: toString()
     * Returns a string that makes it easy to see the value of a
     * namesurfer.solution.NameSurferEntry.
     */
    public String toString() {
        // TODO: 请完善和修改这个函数 //
        return null;
    }
}

