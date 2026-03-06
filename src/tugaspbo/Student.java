package tugaspbo;
import java.util.ArrayList;
import java.util.List;

public class Student {
    // Atribut Private (Encapsulation)
    private String studentID;
    private String name;
    private List<Grade> grades;

    public Student(String studentID, String name) {
        setStudentID(studentID); // Validation Logic
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Validation Logic 2: ID harus minimal 5 karakter
    public void setStudentID(String studentID) {
        if (studentID != null && studentID.length() >= 5) {
            this.studentID = studentID;
        } else {
            this.studentID = "ST-DEFAULT";
            System.out.println("[Error] ID Mahasiswa tidak valid!");
        }
    }

    // Method untuk menambah nilai
    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    // Method untuk menghitung rata-rata
    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        double total = 0;
        for (Grade g : grades) {
            total += g.getScore();
        }
        return total / grades.size();
    }

    // Validation Logic 3: Menentukan status kelulusan berdasarkan rata-rata
    public String getAcademicStatus() {
        double avg = calculateAverage();
        if (avg >= 85) return "Lulus (Sangat Baik)";
        if (avg >= 75) return "Lulus (Baik)";
        if (avg >= 60) return "Lulus (Cukup)";
        return "Tidak Lulus";
    }

    // Getters
    public String getName() { return name; }
    public String getStudentID() { return studentID; }
}