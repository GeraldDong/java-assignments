package namesurfer.chinese;
/*
 * File: VoteCounter.java
 * ---------------------
 * A sandcastle program that uses collections to tally votes
 */

import acm.program.ConsoleProgram;

import java.util.ArrayList;

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
        // TODO: 请完善和修改这个函数 //
    }
}
