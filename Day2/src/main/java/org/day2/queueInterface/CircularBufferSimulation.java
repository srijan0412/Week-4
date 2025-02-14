package org.day2.queueInterface;

import java.util.Arrays;

public class CircularBufferSimulation {
    private int[] buffer;
    private int size, front, rear, count;

    public CircularBufferSimulation(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Insert element into buffer (overwrite if full)
    public void insert(int value) {
        rear = (rear + 1) % size;
        buffer[rear] = value;
        if (count < size) {
            count++;  // Increase count if not full
        } else {
            front = (front + 1) % size; // Overwrite: Move front forward
        }
    }

    // Get the current state of the buffer
    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBufferSimulation cb = new CircularBufferSimulation(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // Output: [1, 2, 3]

        cb.insert(4); // Overwrites 1
        cb.display(); // Output: [2, 3, 4]

        cb.insert(5); // Overwrites 2
        cb.display(); // Output: [3, 4, 5]
    }
}
