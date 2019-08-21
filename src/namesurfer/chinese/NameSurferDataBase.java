package namesurfer.chinese;
/*
 * File: namesurfer.solution.NameSurferDataBase.java
 * -----------------------------
 * This class keeps track of the complete database of names.
 * The constructor reads in the database from a file, and
 * the only public method makes it possible to look up a
 * name and get back the corresponding namesurfer.solution.NameSurferEntry.
 * Names are matched independent of case, so that "Eric"
 * and "ERIC" are the same names.
 */

import java.util.ArrayList;
import java.util.Map;

public class NameSurferDataBase implements NameSurferConstants {

    private Map<String, NameSurferEntry> database;

    /**
     * Constructor: namesurfer.solution.NameSurferDataBase(filename)
     * Creates a new namesurfer.solution.NameSurferDataBase and initializes it using the
     * data provided.  The constructor throws an error
     * exception if the requested file does not exist or if an error
     * occurs as the file is being read.
     */
    public NameSurferDataBase(ArrayList<String> lines) {
        // TODO: 请完善和修改这个函数 //
    }

    /**
     * Public Method: findEntry(name)
     * Returns the namesurfer.solution.NameSurferEntry associated with this name, if one
     * exists.  If the name does not appear in the database, this
     * method returns null.
     */
    public NameSurferEntry findEntry(String name) {
        // TODO: 请完善和修改这个函数 //
        return null;
    }

    /**
     * Capitalize the first letter of a name and lowercase all others
     */
    private String normalizeName(String name) {
        // TODO: 请完善和修改这个函数 //
        return null;
    }
}

