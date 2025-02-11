package org.day1;

import java.util.*;

// Abstract class representing a Job Role
abstract class JobRole {
    String candidateName;
    String skills;

    public JobRole(String candidateName, String skills) {
        this.candidateName = candidateName;
        this.skills = skills;
    }

    abstract void displayRole();
}

// Specific job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    void displayRole() {
        System.out.println("Software Engineer: " + candidateName + ", Skills: " + skills);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    void displayRole() {
        System.out.println("Data Scientist: " + candidateName + ", Skills: " + skills);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    void displayRole() {
        System.out.println("Product Manager: " + candidateName + ", Skills: " + skills);
    }
}

// Generic Resume Processor
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing resume...");
        jobRole.displayRole();
    }
}

// Screening system handling multiple resumes
class ResumeScreeningSystem {
    public static void screenCandidates(List<? extends JobRole> candidates) {
        for (JobRole candidate : candidates) {
            candidate.displayRole();
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice", "Java, Spring Boot"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob", "Python, Machine Learning"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie", "Agile, Scrum"));

        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        List<JobRole> candidates = Arrays.asList(
                new SoftwareEngineer("Dave", "React, Node.js"),
                new DataScientist("Eve", "Deep Learning, TensorFlow"),
                new ProductManager("Frank", "Market Analysis, Roadmapping")
        );

        System.out.println("\nScreening multiple candidates:");
        screenCandidates(candidates);
    }
}