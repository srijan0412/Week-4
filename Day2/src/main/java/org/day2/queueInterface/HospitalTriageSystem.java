package org.day2.queueInterface;

import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        // PriorityQueue with custom comparator (higher severity first)
        PriorityQueue<Patient> queue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        // Adding patients to the queue
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Processing patients
        System.out.println("Treatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().name);
        }
    }
}