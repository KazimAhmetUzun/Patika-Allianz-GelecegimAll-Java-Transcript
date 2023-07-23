package hw3.main;

import java.util.ArrayList;
import hw3.util.Grade;

public class Transcript {
    private int studentID;
    private ArrayList<CourseGrade> courses;
    private double GPA;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.GPA = 0.0;
        this.courses = new ArrayList<>();
    }

    public void addCourseTaken(CourseGrade courseGrade) {
        if (courseGrade != null) {
            courses.add(courseGrade);
            calculateGPA();
        } else {
            System.out.println("Error: CourseGrade object is null.");
        }
    }

    private void calculateGPA() {
        int totalCredits = 0;
        double totalGradePoints = 0.0;
        for (CourseGrade course : courses) {
            totalCredits += course.getCourseCredit();
            totalGradePoints += course.getGradeTaken().getNumericValue() * course.getCourseCredit();
        }
        if (totalCredits > 0) {
            GPA = totalGradePoints / totalCredits;
        } else {
            GPA = 0.0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append("\n");
        for (CourseGrade course : courses) {
            sb.append(course).append("\n");
        }
        sb.append("GPA: ").append(GPA);
        return sb.toString();
    }
}
