
package report;

import manager.StudentManager;
import model.Student;
import java.util.List;

public class DepartmentReport extends Report {

    public DepartmentReport() {
        super("Department Report");
    }

    @Override
    public void generate(StudentManager manager) {

        // Get a copy of all students
        List<Student> students = manager.getAllStudents();

        // sort department by names 
        for (int i = 0; i < students.size() - 1; i++) {
            int minIndex = i; 

            for (int j = i + 1; j < students.size(); j++) {
                String dept1 = students.get(j).getDepartment();
                String dept2 = students.get(minIndex).getDepartment();

                // if dept1 comes before dept2 alphabetically
                if (dept1.compareTo(dept2) < 0) {
                    minIndex = j;
                }
            }

            // swap students[i] with students[minIndex]
            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }

        System.out.println("\nDEPARTMENT REPORT ");

        String currentDept = ""; // to detect when department changes

        for (Student s : students) {

            // if new department, print header
            if (!s.getDepartment().equals(currentDept)) {
                currentDept = s.getDepartment();
                System.out.println("\nDepartment: " + currentDept);
            }

            System.out.println(" - " + s.getName() + " GPA: " + s.getGpa());
        }
    }
}