package report;

import manager.StudentManager;
import model.Student;
import java.util.List;

public class GPAReport extends Report {

    public GPAReport() {
        super("GPA Report");
    }

    @Override
    public void generate(StudentManager manager) {

        // get a copy of all students
        List<Student> students = manager.getAllStudents();

        // sort from highest gpa
        for (int i = 0; i < students.size() - 1; i++) {
            int maxIndex = i; // assume this is the highest GPA

            // find index of student with highest GPA in the rest of the list
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(j).getGpa() > students.get(maxIndex).getGpa()) {
                    maxIndex = j;
                }
            }

            // swap students[i] with students[maxIndex]
            Student temp = students.get(i);
            students.set(i, students.get(maxIndex));
            students.set(maxIndex, temp);
        }

        System.out.println("\n GPA REPORT ");
        for (Student s : students) {
            System.out.println(s.getName() + s.getDepartment() + "  GPA: " + s.getGpa());
        }
    }
}