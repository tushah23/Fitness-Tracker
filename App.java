import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            //Create the usar profile 
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

            //create the tyep of workout baised on the user input 

            System.out.println("Do you want to create a Strength or Carido workout? (Enter 'Strength' or 'Cardio')");
            String workoutType = sc.nextLine().trim().toLowerCase();

            if (workoutType.equals("strength")) {
                createStrengthWorkout(sc);
            } else if (workoutType.equals("cardio")) {
                createCardioWorkout(sc);
            } else {
                System.out.println("Invalid workout type. Please restart the application."); 
            }
        }

    }


    //method to create a strenght workout 
    public static void createStrengthWorkout(Scanner sc) {
        System.out.println("Enter equiptement: "); 
        String equiptment = sc.nextLine(); 

        System.out.println("Enter intensity (low, medium, hight): "); 
        String intensity = sc.nextLine(); 

        StrengthWorkout strengthWorkout = new StrengthWorkout("Strength", equiptment, intensity, 0, 0, 0, ""); 

        boolean adding = true; 

        while (adding) {
            System.out.println("\nExersice nameL "); 
            String exerciseName = sc.nextLine();

            System.out.println("Sets: "); 
            double sets = sc.nextDouble(); 

            System.out.println("Reps per set: ");
            double reps = sc.nextDouble(); 

            System.out.println("Weight (lbs): "); 
            double weight = sc.nextDouble();

            strengthWorkout.addExercise(exerciseName, sets, reps, weight); 

            System.out.println("Do you want to add another exercise? (yes/no)"); 
            String response = sc.nextLine().trim().toLowerCase();

            if (response.equals("no")) {
                adding = false; 
                strengthWorkout.showDetails();
            } else if (response.equals("yes")) {
                sc.nextLine();
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'."); 
                sc.nextLine();
            }

        }


    }
}


