import java.util.Arrays;

public class GradeManager {

    private double[] grades;

    public GradeManager(int size) {
        grades = new double[size];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = -1.0;
        }
    }

    // Adding grades
    public void addGrade(double grade){
        if (grade < 0.0 || grade > 100.0) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == -1.0) {
                grades[i] = grade;
                System.out.println("Grade added: " + grade);
                return;
            }
        }

        System.out.println("No space left to add grade.");
    }

    // Sorting grades
    public void sortGrades() {
        Arrays.sort(grades);
        System.out.println("------Grades sorted------");
        System.out.println(Arrays.toString(grades));
    }

    // Searching for a grade
    public void searchGrade(double grade) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == grade) {
                System.out.println("Grade found at position: " + i);
                return;
            }
        }
        System.out.println("Grade not found.");
    }

    // Calculating the average grade
    public double getAverage() {
        double sum = 0.0;
        int total = 0;

        for (double grade : grades) {
            if (grade != -1.0) {
                sum += grade;
                total++;
            }
        }

        return sum / total;
    }

    // Getting the highest grade
    public double getHighest() {
        double highest = -1.0;

        for (double grade : grades) {
            if (grade != -1.0 && grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Getting the lowest grade
    public double getLowest() {
        double lowest = 101.0;

        for (double grade : grades) {
            if (grade != -1.0 && grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
