package Homework4;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("George",52);
        Students s2 = new Students("Alex", 73);
        Students s3 = new Students("Andreea", 75.4);
        Students s4 = new Students("Marcel", 15);
        Students s5 = new Students("Cosmi", 42);

        System.out.println("Average grade: " + Students.sumOgGrades() + " Pentru un numar de " + Students.getNumberOfStudents() + " studenti ");

    }
}
