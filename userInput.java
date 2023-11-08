import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, What's your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " +name +"!");

        System.out.println("In what year were you born? ");
        int dob = sc.nextInt();
        int year = 2023;
        int age = year - dob;

        System.out.println("Your name is " +name +" and you are " +age + " years old");
    }
}