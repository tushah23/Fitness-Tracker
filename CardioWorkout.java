public class CardioWorkout extends Workout {
    private final int duration; // in minutes
    private final double distance; // in miles 

    public CardioWorkout(String initType, String initEquipment, String initIntensity, int initDuration, double initDistance) {
        super(initType, initEquipment, initIntensity);
        this.duration = initDuration;
        this.distance = initDistance;
    }

    @Override 
    public void showDetails() {
        System.out.println("Carido Workout Details: ");
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Distance: " + distance + " miles"); 
        System.out.println("Equipment: " + super.equipment);
        System.out.println("Intensity: " + super.intensity); 
    }
}
