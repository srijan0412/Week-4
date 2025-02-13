package org.day3.dataStreams;

import java.io.*;

class Student {
    int rollNumber;
    String name;
    double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }
}

public class DataStreamsExample {
    private static final String FILE_NAME = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\dataStreams\\students.dat";

    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student(101, "Alice", 3.8);
        Student student2 = new Student(102, "Bob", 3.6);

        // Writing student details to file
        writeStudentData(student1);
        writeStudentData(student2);

        // Reading student details from file
        readStudentData();
    }

    public static void writeStudentData(Student student) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            dos.writeInt(student.rollNumber);
            dos.writeUTF(student.name);
            dos.writeDouble(student.gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}