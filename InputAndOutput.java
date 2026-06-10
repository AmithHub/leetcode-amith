import java.util.Scanner;
public class InputAndOutput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age");

        String name = sc.next();
        int age = sc.nextInt();
        System.out.println("My name is "+name + " and age is " + age);

    }
}