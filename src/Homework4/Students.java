package Homework4;

public class Students {
    private String name;
    private double grade;

    private static int sumOfGrades = 0;
    private static int numberOfStudents = 0;

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Students(String name, double grade) {
        this.name = name;
        this.grade = grade;

        sumOfGrades += grade;
        numberOfStudents += 1;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static double sumOgGrades() {
        return (double) sumOfGrades / numberOfStudents;
    }
}
