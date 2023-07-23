package hw3; 
import hw3.main.CourseGrade; 
import hw3.main.Transcript; 
import hw3.util.Grade; 
import hw3.util.GradeTest;

public class Main {
    public static void main(String[] args) {
        Transcript transcript = new Transcript(21632844);
        transcript.addCourseTaken(new CourseGrade("CENG", 201, 4, Grade.B));
        transcript.addCourseTaken(new CourseGrade("MATH", 205, 5, Grade.A));
        transcript.addCourseTaken(new CourseGrade("COMP", 205, 5, Grade.D));
        transcript.addCourseTaken(new CourseGrade("DTA", 128, 3, Grade.A));
        transcript.addCourseTaken(new CourseGrade("PHY", 61, 2, Grade.C));

        System.out.println(transcript);
    }
}
