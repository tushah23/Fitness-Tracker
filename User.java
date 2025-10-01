public class User {
    private String name; // frist and last
    private int age; // in years
    private double weight; // in lb 
    private double height; // in inches but will be converted to feet
    private String goal; // could be one of four, weight loss, weight gain, muscle gain, or maintain weight 

    public User(String name, int age, double weight, double height, String goal) {
        this.name = name;
        this.age = age; 
        this.weight = weight;
        this.height = height;
        this.goal = goal; 
    }

    @Override
    public String toString() {
        return "User: " + name +
                "\nAge: " + age +
                "\nWeight: " + weight + " lbs" +
                "\nHeight: " + height + " inches" +
                "\nGoal: " + goal;
    }
}
