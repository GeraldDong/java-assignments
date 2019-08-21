package namesurfer.solution;/*
 * File: namesurfer.solution.NameSurferDataBase.java
 * -----------------------------
 * This class keeps track of the complete database of names.
 * The constructor reads in the database from a file, and
 * the only public method makes it possible to look up a
 * name and get back the corresponding namesurfer.solution.NameSurferEntry.
 * Names are matched independent of case, so that "Eric"
 * and "ERIC" are the same names.
 */

import java.util.*;
import java.io.*;

public class NameSurferDataBase implements NameSurferConstants {

	private Map<String, NameSurferEntry> database;
	
	/**
	 * Constructor: namesurfer.solution.NameSurferDataBase(filename)
	 * Creates a new namesurfer.solution.NameSurferDataBase and initializes it using the
	 * data in the specified file.  The constructor throws an error
	 * exception if the requested file does not exist or if an error
	 * occurs as the file is being read.
	 */
	public NameSurferDataBase(String filename) {
		// You fill this in //
		database = new HashMap<>();
		try {
			BufferedReader rd = new BufferedReader(new FileReader(filename));
			while(true) {
				String line = rd.readLine();
				if (line == null) {
					break;
				}
				NameSurferEntry entry = new NameSurferEntry(line);
				database.put(entry.getName(), entry);
			}
		} catch (IOException ex) {
			// TODO: exception handling
		}
	}

	/**
	 * Public Method: findEntry(name)
	 * Returns the namesurfer.solution.NameSurferEntry associated with this name, if one
	 * exists.  If the name does not appear in the database, this
	 * method returns null.
	 */
	public NameSurferEntry findEntry(String name) {
		// You need to turn this stub into a real implementation //
		name = normalizeName(name);
		if(database.containsKey(name)) {
			return database.get(name);
		}
		return null;
	}

	/**
	 * Capitalize the first letter of a name and lowercase all others
	 * @param name
	 * @return
	 */
	private String normalizeName(String name) {
		char[] s = name.toLowerCase().toCharArray();
		s[0] = Character.toUpperCase(s[0]);
		return new String(s);
	}
}

