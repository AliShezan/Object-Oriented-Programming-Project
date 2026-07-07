package main.model;

public class StrengthExercise extends Exercise {
    private int sets;
    private int reps;
    private double weight;

    public StrengthExercise(String name, String muscleGroup, int sets, int reps, double weight) {
        super(name, muscleGroup);
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getType() {
        return "Strength";
    }

    @Override
    public String getDetails() {
        return sets + " sets x " + reps + " reps at " + weight + " lbs";
    }
}
