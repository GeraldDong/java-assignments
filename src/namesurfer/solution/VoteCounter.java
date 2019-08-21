package namesurfer.solution;/*
 * File: namesurfer.solution.VoteCounter.java
 * ---------------------
 * A sandcastle program that uses collections to tally votes 
 */

import acm.program.*;
import java.util.*;

public class VoteCounter extends ConsoleProgram {
	public void run() {
		ArrayList<String> votes = new ArrayList<String>();
		votes.add("Zaphod Beeblebrox");
		votes.add("Arthur Dent");
		votes.add("Trillian McMillian");
		votes.add("Zaphod Beeblebrox");
		votes.add("Marvin");
		votes.add("Mr. Zarniwoop");
		votes.add("Trillian McMillian");
		votes.add("Zaphod Beeblebrox");
		printVoteCounts(votes);
		
	}
	
	/*
	 * Your job is to implement this method according to 
	 * the problem specification. 
	 */
	private void printVoteCounts(ArrayList<String> votes) {
		Map<String, Integer> stats = new HashMap<>();
		for(String name: votes) {
			if(stats.containsKey(name)) {
				stats.replace(name, stats.get(name) + 1);
			}
			else {
				stats.put(name, 1);
			}
		}

		for(String name: stats.keySet()) {
			println("Votes for " + name + ": " + stats.get(name));
		}
	}
}
