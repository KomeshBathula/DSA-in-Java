import java.util.*;
class Student
{
        int rollno,marks;
        String section,sname;
        double cgpa;

        Student(String sname,int rollno,String section,int marks,double cgpa)
        {
            this.sname = sname;
            this.rollno = rollno;
            this.section = section;
            this.marks = marks;
            this.cgpa = cgpa;
        }

        public String toString() {
            return "Name: " + sname +
                   ", Roll No: " + rollno +
                   ", Section: " + section +
                   ", Marks: " + marks +
                   ", CGPA: " + cgpa;
        }

}
class SortByCgpaDescending implements Comparator<Student>
{
    public int compare(Student s1, Student s2) 
    {
        if (s2.cgpa > s1.cgpa) return 1;
        else if (s1.cgpa > s2.cgpa) return -1;
        else return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=0;
        System.out.println("ENTER NO OF RECORDS");
        n=sc.nextInt();

        ArrayList<Student> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String sname;
            int rollno;
            String section;
            int marks;
            double cgpa;

            System.out.println("ENTER THE OF NAME");
            sc.nextLine();
            sname = sc.nextLine();

                    System.out.println("ENTER THE OF ROLLNO");
            rollno =sc.nextInt();

                    System.out.println("ENTER THE OF SECTION");
            sc.nextLine();
            section = sc.nextLine();

                    System.out.println("ENTER THE OF MARKS");
            marks = sc.nextInt();

                    System.out.println("ENTER THE OF CGPA");
            cgpa = sc.nextDouble();

            Student s = new Student(sname,rollno,section,marks,cgpa);
            al.add(s);
        }
        
        System.out.println("BEFORE SORTING");

        for(Student x : al)
        {
            System.out.println(x);
        }

        Collections.sort(al,new SortByCgpaDescending());

        System.out.println("AFTER SORTING");
        
        for(Student x : al)
        {
            System.out.println(x);
        }
                sc.close();
    }
}