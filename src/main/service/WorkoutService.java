package main.service;

import main.model.CardioExercise;
import main.model.StrengthExercise;
import main.model.WorkoutPlan;
import main.model.WorkoutLog;

public class WorkoutService {
    private WorkoutPlan workoutPlan;
    private WorkoutLog workoutLog;

    public WorkoutService() {
        this.workoutPlan = new WorkoutPlan("Default GymBro Plan");
        this.workoutLog = new WorkoutLog();
    }

    public void addStrengthExercise(String name, String muscleGroup, int sets, int reps, double weight) {
        StrengthExercise exercise = new StrengthExercise(name, muscleGroup, sets, reps, weight);
        workoutPlan.addExercise(exercise);
    }

    public void addCardioExercise(String name, String muscleGroup, int durationMinutes, double distanceMiles) {
        CardioExercise exercise = new CardioExercise(name, muscleGroup, durationMinutes, distanceMiles);
        workoutPlan.addExercise(exercise);
    }

    public String viewWorkoutPlan() {
        return workoutPlan.getPlanSummary();
    }

    public void logCompletedWorkout(String description) {
        workoutLog.logWorkout(description);
    }

    public String viewWorkoutLog() {
        return workoutLog.getLogSummary();
    }

    public int getExerciseCount() {
        return workoutPlan.getExerciseCount();
    }
}
