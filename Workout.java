public abstract class Workout {
    public String type; // cardio, strength, flexibility
    public String intensity; // low medium high
    public String equipment; // none, dumbells, barbell, machine, bodyweight

    public Workout(String initType, String initEquiptment, String initIntensity) {
        this.type = initType;
        this.equipment = initEquiptment;
        this.intensity = initIntensity;
    }
    public abstract void showDetails(); 
    
}
