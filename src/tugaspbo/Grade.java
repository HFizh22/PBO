package tugaspbo;
public class Grade {
    private String subjectName;
    private double score;

    // Constructor 1: Default
    public Grade() {
        this.subjectName = "Unknown";
        this.score = 0.0;
    }

    // Constructor 2: Overloading
    public Grade(String subjectName, double score) {
        this.subjectName = subjectName;
        setScore(score); // Menggunakan setter agar validasi berjalan
    }

    // Setter dengan Validation Logic 1
    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("[Error] Nilai untuk " + subjectName + " harus antara 0-100. Diset ke 0.");
            this.score = 0;
        }
    }

    public String getSubjectName() { return subjectName; }
    public double getScore() { return score; }
}