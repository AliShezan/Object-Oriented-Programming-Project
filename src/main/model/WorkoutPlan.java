package main.model;

import java.util.ArrayList;
import java.util.List;

public class WorkoutPlan {
    private String planName;
    private List<Exercise> exercises;

    public WorkoutPlan(String planName) {
        this.planName = planName;
        this.exercises = new ArrayList<>();
    }

    public String getPlanName() {
        return planName;
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public boolean isEmpty() {
        return exercises.isEmpty();
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getPlanSummary() {
        if (exercises.isEmpty()) {
            return "No exercises have been added to the workout plan yet.";
        }

        StringBuilder summary = new StringBuilder();
        summary.append("Workout Plan: ").append(planName).append("\n");

        for (int i = 0; i < exercises.size(); i++) {
            summary.append(i + 1).append(". ").append(exercises.get(i)).append("\n");
        }

        return summary.toString();
    }
}
