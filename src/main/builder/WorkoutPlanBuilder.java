package main.builder;

import main.factory.ExerciseFactory;
import main.model.Exercise;
import main.model.WorkoutPlan;

public class WorkoutPlanBuilder {
    private WorkoutPlan workoutPlan;
    private ExerciseFactory exerciseFactory;

    public WorkoutPlanBuilder(String planName) {
        this.workoutPlan = new WorkoutPlan(planName);
        this.exerciseFactory = new ExerciseFactory();
    }

    public WorkoutPlanBuilder addStrengthExercise(String name, String muscleGroup, int sets, int reps, double weight) {
        Exercise exercise = exerciseFactory.createStrengthExercise(name, muscleGroup, sets, reps, weight);
        workoutPlan.addExercise(exercise);
        return this;
    }

    public WorkoutPlanBuilder addCardioExercise(String name, String muscleGroup, int durationMinutes, double distanceMiles) {
        Exercise exercise = exerciseFactory.createCardioExercise(name, muscleGroup, durationMinutes, distanceMiles);
        workoutPlan.addExercise(exercise);
        return this;
    }

    public WorkoutPlan build() {
        return workoutPlan;
    }
}
