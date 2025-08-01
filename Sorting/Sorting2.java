import java.util.*;
class Student
{
        int rollno,marks;
        String branch,sname;
        double cgpa;

        Student(String sname,int rollno,String branch,int marks,double cgpa)
        {
            this.sname = sname;
            this.rollno = rollno;
            this.branch = branch;
            this.marks = marks;
            this.cgpa = cgpa;
        }

        public String toString() {
            return "Name: " + sname +
                   ", Roll No: " + rollno +
                   ", Branch: " + branch +
                   ", Marks: " + marks +
                   ", CGPA: " + cgpa;
        }

}
class SortByBranchDescending implements Comparator<Student>
{
    public int compare(Student s1, Student s2) 
    {
        return s2.branch.compareTo(s1.branch);
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
            String branch;
            int marks;
            double cgpa;

            System.out.println("ENTER THE OF NAME");
            sc.nextLine();
            sname = sc.nextLine();

                    System.out.println("ENTER THE OF ROLLNO");
            rollno =sc.nextInt();

                    System.out.println("ENTER THE OF Branch");
            sc.nextLine();
            branch = sc.nextLine();

                    System.out.println("ENTER THE OF MARKS");
            marks = sc.nextInt();

                    System.out.println("ENTER THE OF CGPA");
            cgpa = sc.nextDouble();

            Student s = new Student(sname,rollno,branch,marks,cgpa);
            al.add(s);
        }
        
        System.out.println("BEFORE SORTING");

        for(Student x : al)
        {
            System.out.println(x);
        }

        Collections.sort(al,new SortByBranchDescending());

        System.out.println("AFTER SORTING");
        
        for(Student x : al)
        {
            System.out.println(x);
        }
                sc.close();
    }
}