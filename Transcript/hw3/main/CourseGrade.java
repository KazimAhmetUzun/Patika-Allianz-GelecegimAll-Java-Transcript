package hw3.main;

import hw3.util.Grade;

public class CourseGrade {
    private String courseDepartment;
    private int courseCode;
    private int courseCredit;
    private Grade gradeTaken;

    public CourseGrade(String courseDepartment) {
        this(courseDepartment, 100, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode) {
        this(courseDepartment, courseCode, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit) {
        this(courseDepartment, courseCode, courseCredit, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, Grade gradeTaken) {
        setCourseDepartment(courseDepartment);
        setCourseCode(courseCode);
        setCourseCredit(courseCredit);
        setGradeTaken(gradeTaken);
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        if (courseDepartment != null && courseDepartment.matches("[A-Z]{4}")) {
            this.courseDepartment = courseDepartment;
        } else {
            this.courseDepartment = "CENG"; 
        }
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        if (courseCode >= 100 && courseCode <= 599) {
            this.courseCode = courseCode;
        } else {
            this.courseCode = 100; 
        }
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        if (courseCredit == 3 || courseCredit == 4) {
            this.courseCredit = courseCredit;
        } else {
            this.courseCredit = 4; 
        }
    }

    public Grade getGradeTaken() {
        return gradeTaken;
    }

    public void setGradeTaken(double val) {
        if (val >= 0 && val <= 4.0) {
            int numericValue = (int) Math.round(val);
            switch (numericValue) {
                case 4:
                    gradeTaken = Grade.A;
                    break;
                case 3:
                    gradeTaken = Grade.B;
                    break;
                case 2:
                    gradeTaken = Grade.C;
                    break;
                case 1:
                    gradeTaken = Grade.D;
                    break;
                default:
                    gradeTaken = Grade.F;
                    break;
            }
        } else {
            gradeTaken = Grade.F;
        }
    }

    public void setGradeTaken(Grade g) {
        gradeTaken = g;
    }

    @Override
    public String toString() {
    return "Department: " + courseDepartment + " Code: " + courseCode +
            " Credit: " + courseCredit + " Grade: " + gradeTaken.stringValue;
}


}
