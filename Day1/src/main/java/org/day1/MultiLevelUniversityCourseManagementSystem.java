package org.day1;

abstract class CourseType {
    // Attributes
    private String courseName;
    private int courseDuration; //in months

    // Constructors
    public CourseType(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    // Setters and getters
    public String getCourseName() {
        return courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }
}

class ExamCourse extends CourseType {
    // Attributes
    private static String courseType = "Exam Course";
    // Constructor
    public ExamCourse(String courseName, int courseDuration) {
        super(courseName, courseDuration);
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Course Name: " + getCourseName() + ", Course Duration: " + getCourseDuration() + " & Course");
    }
}
public class MultiLevelUniversityCourseManagementSystem {
    public static void main(String[] args) {

    }
}
