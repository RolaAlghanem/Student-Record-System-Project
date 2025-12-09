package manager;

import model.Student;
import util.FileHandler;
import java.util.ArrayList;
import java.util.List;


public class StudentManager {
    private List<Student> students;
    private FileHandler fileHandler;

    public StudentManager() {
        this.fileHandler = new FileHandler();
        this.students = fileHandler.loadRecords();
    }


    public boolean addStudent(Student student) {

        for (Student s : students) {
            if (s.getId().equals(student.getId())) {
                return false; 
            }
        }
        
        students.add(student);
        fileHandler.saveRecords(students); 
        return true;
    }

   
    public Student findStudentById(String id) {
  
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s; 
            }
        }
        return null; 
    }

    public List<Student> getAllStudents() {
        return new ArrayList<Student>(students);
    }

  
    public boolean updateStudent(String id, String name, String department, double gpa) {
        Student student = findStudentById(id);
        
       
        if (student != null) { 
            student.setName(name);
            student.setDepartment(department);
            student.setGpa(gpa);
            fileHandler.saveRecords(students); 
            return true;
        }
        return false;
    }

   
    public boolean removeStudent(String id) {
       
        Student studentToRemove = null;
        for (Student s : students) {
            if (s.getId().equals(id)) {
                studentToRemove = s;
                break;
            }
        }
        
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            fileHandler.saveRecords(students); 
            return true;
        }
        return false;
    }
    public synchronized void saveAll() {
    fileHandler.saveRecords(students);
    System.out.println("Auto-save done.");
}

} 

