 package JAVA.lab9;

// import java.util.Scanner;

// class student{
//     int id_no;
//     int subreg;
//     int subcode;
//     int subcredit;
//     char grade;
//     double spi;
//     student(int id_no,int subreg,int subcode,int subcredit,double spi){
//         this.id_no=id_no;
//         this.subcode=subcode;
//         this.subcredit=subcredit;
//         this.subreg=subreg;
//         this.spi=spi;
//     }
//     void getter(){

//     }
// }
// public class lab9a1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         student[] s=new student[size];
//         for(int i=0;i<size;i++){
//             System.out.println("enter id");
//             s[i].id_no=sc.nextInt();
//             System.out.println("enter grade for s1");
//         }

//         sc.close();
//     }
// }
import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    double[] grade_obtained;
    double spi;

    Student(int id_no, int no_of_subjects_registered) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = new String[no_of_subjects_registered];
        this.subject_credits = new int[no_of_subjects_registered];
        this.grade_obtained = new double[no_of_subjects_registered];
    }

    void calculate_spi() {
        double totalCredits = 0;
        double totalPoints = 0;
        for (int i = 0; i < no_of_subjects_registered; i++) {
            totalCredits += subject_credits[i];
            totalPoints += grade_obtained[i] * subject_credits[i];
        }
        if (totalCredits != 0) {
            spi = totalPoints / totalCredits;
        } else {
            spi = 0;
        }
    }

    void display() {
        System.out.println("Student ID: " + id_no);
        System.out.println("SPI: " + spi);
    }
}

public class lab9a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("ID number: ");
            int id = sc.nextInt();

            System.out.print("Number of subjects registered: ");
            int subjects = sc.nextInt();

            students[i] = new Student(id, subjects);

            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject code: ");
                students[i].subject_code[j] = sc.next();

                System.out.print("Subject credits: ");
                students[i].subject_credits[j] = sc.nextInt();

                System.out.print("Grade obtained (as numeric value): ");
                students[i].grade_obtained[j] = sc.nextDouble();
            }

            students[i].calculate_spi();
        }

        System.out.println("\nAll Students SPI:");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
