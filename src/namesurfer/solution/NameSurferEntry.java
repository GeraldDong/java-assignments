package namesurfer.solution;/*
 * File: namesurfer.solution.NameSurferEntry.java
 * --------------------------
 * This class represents a single entry in the database.  Each
 * namesurfer.solution.NameSurferEntry contains a name and a list giving the popularity
 * of that name for each decade stretching back to 1900.
 */

public class NameSurferEntry implements NameSurferConstants {

	private String name;
	private int[] ranks;

	/**
	 * Constructor: namesurfer.solution.NameSurferEntry(line)
	 * Creates a new namesurfer.solution.NameSurferEntry from a data line as it appears
	 * in the data file.  Each line begins with the name, which is
	 * followed by integers giving the rank of that name for each
	 * decade.
	 */
	public NameSurferEntry(String line) {
		// You fill this in //
		String[] columns = line.split(" ");
		ranks = new int[11];

		name = columns[0];
		for(int i = 0; i < 11; i++) {
			ranks[i] = Integer.parseInt(columns[i+1]);
		}
	}

	/**
	 * Public Method: getName()
	 * Returns the name associated with this entry.
	 */
	public String getName() {
		// You need to turn this stub into a real implementation //
		return name;
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
		// You need to turn this stub into a real implementation //
		if (decade < 0 || decade > 10) {
			return -1;
		}
		return ranks[decade];
	}

	/**
	 * Public Method: toString()
	 * Returns a string that makes it easy to see the value of a
	 * namesurfer.solution.NameSurferEntry.
	 */
	public String toString() {
		// You need to turn this stub into a real implementation //
		StringBuffer sb = new StringBuffer(name);
		sb.append(" [");
		for(int i = 0; i < 10; i++) {
			sb.append(ranks[i]);
			sb.append(", ");
		}
		sb.append(ranks[10]);
		sb.append(']');
		return sb.toString();	}
}

