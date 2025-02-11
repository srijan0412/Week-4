package org.day1;

import java.util.ArrayList;

abstract class CourseType {
    // Attributes
    private String courseName;
    private int courseDuration; //in months

    // Constructors
    public CourseType(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration);
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
        System.out.println("Course Name: " + getCourseName() + ", Course Duration: " + getCourseDuration() + " & Course Type: " + courseType);
    }
}

class AssignmentCourse extends CourseType {
    // Attributes
    private static String courseType = "Assignment Course";
    // Constructor
    public AssignmentCourse(String courseName, int courseDuration) {
        super(courseName, courseDuration);
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Course Name: " + getCourseName() + ", Course Duration: " + getCourseDuration() + " & Course Type: " + courseType);
    }
}

class ResearchCourse extends CourseType {
    // Attributes
    private static String courseType = "Research Course";
    // Constructor
    public ResearchCourse(String courseName, int courseDuration) {
        super(courseName, courseDuration);
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Course Name: " + getCourseName() + ", Course Duration: " + getCourseDuration() + " & Course Type: " + courseType);
    }
}

class Courses <T extends CourseType> {
    // Attributes
    ArrayList<T> courses;

    // Constructor
    public Courses() {
        courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(T course) {
        courses.add(course);
    }

    public ArrayList<T> getCourses() {
        return courses;
    }

    // Method to display all courses using wildcards
    public void displayCourses(ArrayList<? extends CourseType> courseList) {
        for (CourseType course : courseList) {
            course.displayDetails();
        }
    }
}

public class MultiLevelUniversityCourseManagementSystem {
    public static void main(String[] args) {
        // Create a Course manager for ExamCourses
        Courses<ExamCourse> examCourseManager = new Courses<>();
        examCourseManager.addCourse(new ExamCourse("Mathematics", 70));
        examCourseManager.addCourse(new ExamCourse("Physics", 80));

        // Create a Course manager for AssignmentCourses
        Courses<AssignmentCourse> assignmentCourseManager = new Courses<>();
        assignmentCourseManager.addCourse(new AssignmentCourse("Literature", 60));
        assignmentCourseManager.addCourse(new AssignmentCourse("Computer Science", 75));

        // Create a Course manager for ResearchCourses
        Courses<ResearchCourse> researchCourseManager = new Courses<>();
        researchCourseManager.addCourse(new ResearchCourse("Artificial Intelligence", 90));
        researchCourseManager.addCourse(new ResearchCourse("Quantum Computing", 85));

        // Display all courses in each category
        System.out.println("Exam Courses:");
        examCourseManager.displayCourses(examCourseManager.getCourses());

        System.out.println("\nAssignment Courses:");
        assignmentCourseManager.displayCourses(assignmentCourseManager.getCourses());

        System.out.println("\nResearch Courses:");
        researchCourseManager.displayCourses(researchCourseManager.getCourses());
    }
}
