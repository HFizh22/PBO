package tugaspbo;


public class TugasPBO {

    public class GradeSystemApp {
     public static void main(String[] args) {
         System.out.println("=== Student Grade System ===");

         // Inisialisasi Objek
         Student mhs1 = new Student("1030122209232", "Asep Kuplang");

         // Menambah nilai dengan objek Grade
         mhs1.addGrade(new Grade("Pemrograman Java", 87.5));
         mhs1.addGrade(new Grade("Basis Data", 92.0));

         // Contoh input benar 
         mhs1.addGrade(new Grade("Matematika", 85.0)); 

         // Output Informasi
         displayStudentInfo(mhs1);
         
        System.out.println("=== Student Grade System ===");

         // Inisialisasi Objek
         Student mhs2 = new Student("103013212341231", "Jamal");

         // Menambah nilai dengan objek Grade
         mhs2.addGrade(new Grade("Pemrograman Java", 76.5));
         mhs2.addGrade(new Grade("Basis Data", 72.0));

         // Contoh input salah untuk memicu validasi
         mhs2.addGrade(new Grade("Matematika", 120)); 

         // Output Informasi
         displayStudentInfo(mhs2);
     }

     // Method tambahan untuk menampilkan data
     public static void displayStudentInfo(Student s) {
         System.out.println("\n--- Laporan Hasil Studi ---");
         System.out.println("ID Mahasiswa : " + s.getStudentID());
         System.out.println("Nama         : " + s.getName());
         System.out.println("Rata-rata    : " + String.format("%.2f", s.calculateAverage()));
         System.out.println("Status       : " + s.getAcademicStatus());
         System.out.println("---------------------------");
     }
    }
}    


