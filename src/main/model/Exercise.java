package main.model;

public abstract class Exercise {
    private String name;
    private String muscleGroup;

    public Exercise(String name, String muscleGroup) {
        this.name = name;
        this.muscleGroup = muscleGroup;
    }

    public String getName() {
        return name;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public abstract String getType();

    public abstract String getDetails();

    @Override
    public String toString() {
        return getType() + " Exercise: " + name + " | Muscle Group: " + muscleGroup + " | " + getDetails();
    }
}
