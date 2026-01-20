/*
class Main{
    public static void main(String arg[]) {
        int result = 0;
        int a = Integer.parseInt(arg[0]);
        int b = Integer.parseInt(arg[1]);
        switch (arg[2]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "s":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;

        }
        System.out.println("ans"+result);
    }

}
*/
/*
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        int rev=0;
        while (n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("reverse:"+rev);
    }
}
*/
/*
import java.util.*;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter"+n+"numbers");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<n;i++){
            int num =arr[i];
            int rev=0;
            while(num>0){
                int d=num%10;
                rev=rev*10+d;
                num=num/10;
            }

            System.out.println("Rev="+rev);

        }
    }
}
*/
/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int m = sc.nextInt();

        int[][] marks = new int[n][m];
        int topperIndex = 0;
        int maxTotal = 0;

        for (int i = 0; i < n; i++) {
            int total = 0;
            System.out.println("Enter marks for Student " + (i + 1));

            for (int j = 0; j < m; j++) {
                marks[i][j] = sc.nextInt();
                total += marks[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                topperIndex = i;
            }
        }
        System.out.println("Topper is Student " + (topperIndex + 1));
        System.out.println("Total Marks = " + maxTotal);
        sc.close();
    }
}
*/
/*
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> salaryList = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        System.out.println("Enter employee salaries:");
        for (int i = 0; i < n; i++) {
            salaryList.add(sc.nextInt());
        }

        int sum = 0;
        for (int sal : salaryList) {
            sum += sal;
        }

        double average = (double) sum / salaryList.size();

        System.out.println("Average salary = " + average);
    }
}
*/
/*
class Main {
    public static void main(String[] args) {

        int result = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println("Factorial value: " + result);
    }
}
 */
/// linked list program
/*
import java.util.*;
public class Main{
    public static void main(String []args){
        LinkedList<Integer>list=new LinkedList<>();
        list.add(10);
        list.addFirst(5);
        list.addLast(20);
        list.add(25);
        System.out.println(list);
    }
}
*/
///comparable object
/// one to one
/*
class Passport{
    int passportNo;
    String nationality;
    Passport(int passportNo,String nationality){
        this.passportNo=passportNo;
        this.nationality=nationality;

    }
}
class person{
    int id;
    String name;
    Passport pass;
    person(int id,String name,Passport pass){
        this.id=id;
        this.name=name;
        this.pass=pass;
    }
}
public class Main {
    public static void main(String[] args){
        Passport pass=new Passport(987654,"indian");
        person m=new person(1,"Krishna",pass);
        System.out.println("person name:"+m.name);
        System.out.println("passportNo"+m.pass.passportNo);

    }
}
*/
///one to many
/*
import java.util.*;
class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Department{
    int deptID;
    String deptname;
    List<Employee>empList;
    Department(int deptID,String deptname,List<Employee>empList){
        this.deptID=deptID;
        this.deptname=deptname;
        this.empList=empList;

    }

}
public class Main{
    public static void main(String[] args){
        Employee e1=new Employee(1,"ravi");
        Employee e2=new Employee(2,"Anitha");
        List<Employee>empList=new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        Department dept=new Department(101,"cse",empList);
        System.out.println("Department:"+dept.deptname);
        for(Employee e:dept.empList){
            System.out.println(e.id+" "+e.name);
        }
    }
}
*/
///Many to one
/*
class Department {
    int deptId;
    String deptName;

    Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}

class Employee {
    int id;
    String name;
    Department dept;  // MANY employees → ONE department

    Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}

public class Main {
    public static void main(String[] args) {

        Department d = new Department(101, "CSE");

        Employee e1 = new Employee(1, "Ravi", d);
        Employee e2 = new Employee(2, "Anitha", d);

        System.out.println(e1.name + " works in " + e1.dept.deptName);
        System.out.println(e2.name + " works in " + e2.dept.deptName);
    }
}
*/
/// Many to many
import java.util.*;

class Student {
    int id;
    String name;
    List<Course> courses;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }
}

class Course {
    int courseId;
    String courseName;
    List<Student> students;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Ravi");
        Student s2 = new Student(2, "Anitha");

        Course c1 = new Course(101, "Java");
        Course c2 = new Course(102, "Python");


        s1.courses.add(c1);
        s1.courses.add(c2);

        s2.courses.add(c1);

        c1.students.add(s1);
        c1.students.add(s2);

        c2.students.add(s1);

        System.out.println("Courses of " + s1.name);
        for (Course c : s1.courses) {
            System.out.println(c.courseName);
        }

        System.out.println("\nStudents in " + c1.courseName);
        for (Student s : c1.students) {
            System.out.println(s.name);
        }
    }
}

