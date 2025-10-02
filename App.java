import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter your name: "); 
       String name = sc.nextLine(); 

       System.out.println("Enter your age: "); 
       int age = sc.nextInt(); 

       System.out.println("Enter your weight (lbs): "); 
       double weight = sc.nextDouble(); 

       System.out.println("Enter your height (inches): "); 
       double height = sc.nextDouble(); 

       System.out.println("Enter your goal: ");
       String goal = sc.nextLine(); 

       User user = new User(name, age, weight, height, goal); 

       System.out.println("\nProfile created successfully!");
       System.out.println(user); 

       sc.close();

    }
}
