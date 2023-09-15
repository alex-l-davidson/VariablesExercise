import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Task 1: String Variables
//        String firstName = "Alex";
//        String lastName = "Davidson";
//        String name = firstName + lastName;
//        System.out.println(name);

//        Task 2: Numbers
//        int num1 = 23;
//        int num2 = 56;
//        System.out.println(num1 + num2);
//        float result = (float) num1 /num2;
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

//        Task 3: User Input
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println("Hello " + firstName + " " + lastName +"!");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
    }
}