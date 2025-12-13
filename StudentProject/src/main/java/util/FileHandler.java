
package util;

import model.Student;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
  
    private final String FILENAME = "resources/students.dat"; 

   
    @SuppressWarnings("unchecked")
    public List<Student> loadRecords() {
        List<Student> students = new ArrayList<>();
        
        File dataFile = new File(FILENAME);
        if (!dataFile.exists()) {
            System.out.println("Data file not found. Starting with an empty list.");
            return students;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFile))) {
            students = (List<Student>) ois.readObject();
            System.out.println("Records loaded successfully from " + FILENAME);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading records. File might be corrupted: " + e.getMessage());
        }
        return students;
    }


    public void saveRecords(List<Student> students) {
        try {
        
            File dataDir = new File("resources");
            if (!dataDir.exists()) {
                dataDir.mkdirs();
            }
            
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
                oos.writeObject(students);
                System.out.println("Records saved successfully to " + FILENAME);
            }
        } catch (IOException e) {
            System.err.println("Error saving records: " + e.getMessage());
        }
    }
}