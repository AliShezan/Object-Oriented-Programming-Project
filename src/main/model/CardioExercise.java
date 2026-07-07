package main.model;

public class CardioExercise extends Exercise {
    private int durationMinutes;
    private double distanceMiles;

    public CardioExercise(String name, String muscleGroup, int durationMinutes, double distanceMiles) {
        super(name, muscleGroup);
        this.durationMinutes = durationMinutes;
        this.distanceMiles = distanceMiles;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getDistanceMiles() {
        return distanceMiles;
    }

    @Override
    public String getType() {
        return "Cardio";
    }

    @Override
    public String getDetails() {
        return durationMinutes + " minutes, " + distanceMiles + " miles";
    }
}
