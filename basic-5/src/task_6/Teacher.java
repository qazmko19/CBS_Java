package task_6;

public class Teacher {
    String name;
    int grade;

    public Teacher(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Teacher name is " + name + " and grade is " + grade + ". ";
    }
}
