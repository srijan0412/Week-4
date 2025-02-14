package org.day2.votingSystem;

import java.util.*;

public class VotingSystem {
    private final HashMap<String, Integer> voteMap;
    private final LinkedHashMap<String, Integer> voteOrder;

    public VotingSystem() {
        voteMap = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
    }

    // Method to cast a vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteMap.get(candidate));
    }

    // Display votes in insertion order
    public void displayVotesInOrder() {
        System.out.println("Votes in order of casting:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display results in sorted order
    public void displayResultsSorted() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);
        System.out.println("Votes in sorted order:");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Alice");

        system.displayVotesInOrder();
        System.out.println();
        system.displayResultsSorted();
    }
}

