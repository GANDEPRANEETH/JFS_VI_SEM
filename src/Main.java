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



