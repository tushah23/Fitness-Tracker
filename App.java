import java.util.*;
public class StrengthWorkout extends Workout {
    private final double sets;
    private final double reps; // per set (hopfully its the same for each set)
    private final double weight; // in lbs
    private final String exerciseName; 
    private final Map<String, List<Double>> liftLog = new HashMap<>();

    public StrengthWorkout(String initType, String initEquipment, String initIntensity, double initSets, double initReps, double initWeight, String initExerciseName) {
        super(initType, initEquipment, initIntensity);
        this.sets = initSets;
        this.reps = initReps;
        this.weight = initWeight;
        this.exerciseName = initExerciseName;
    }

    public void addExercise(String newExerciseName, double newSets, double newReps, double newWeight) {
        List<Double> newSetRepWeight = new ArrayList<>();
        newSetRepWeight.add(newSets); 
        newSetRepWeight.add(newReps);
        newSetRepWeight.add(newWeight);
        liftLog.put(newExerciseName, newSetRepWeight); 
    }

    @Override
    public void showDetails() {
        System.out.println("Strength Workout Details: ");
        for (String key : liftLog.keySet()) {
            System.out.println("Exercise: " + key); 
            System.out.println("Sets " + liftLog.get(key).get(0));
            System.out.println("Reps per set" + liftLog.get(key).get(1));
            System.out.println("Weight: " + liftLog.get(key).get(2));
            System.out.println("Equipment: " + super.equipment); 
        }
        System.out.println("Intensity: " + super.intensity);

    }

    
}

    }
}

