import java.util.*;

class Student {
    String name, branch;
    int marks, rollno;
    double cgpa;

    Student(String name, String branch, int rollno, int marks, double cgpa) {
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;
        this.marks = marks;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "NAME :" + name + "BRANCH :" + branch + "ROLLNO :" + rollno + "MARKS :" + marks + "CGPA:" + cgpa;
    }
}

public class Sorting14 implements Comparator<Student> {
    public int compare(Student s1, Student s2) 
    {
        if (s2.cgpa > s1.cgpa) return 1;
        else if (s1.cgpa > s2.cgpa) return -1;
        else return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("ENTER NO OF RECORDS");
        n = sc.nextInt();
        sc.nextLine(); 

        Student arr[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER NAME");
            String name = sc.nextLine();
            System.out.println("ENTER BRANCH");
            String branch = sc.nextLine();
            System.out.println("ENTER ROLLNO");
            int rollno = sc.nextInt();
            System.out.println("ENTER MARKS");
            int marks = sc.nextInt();
            System.out.println("ENTER CGPA");
            double cgpa = sc.nextDouble();
            sc.nextLine(); 

            arr[i] = new Student(name, branch, rollno, marks, cgpa);
        }

        System.out.println("BEFORE SORTING");
        for (Student x : arr) {
            System.out.println(x);
        }

        Arrays.sort(arr, new Sorting14());

        System.out.println("AFTER SORTING");
        for (Student x : arr) {
            System.out.println(x);
        }
        sc.close();
    }
}