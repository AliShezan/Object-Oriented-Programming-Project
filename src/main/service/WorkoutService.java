package main.service;

import main.factory.ExerciseFactory;
import main.model.Exercise;
import main.model.WorkoutPlan;
import main.model.WorkoutLog;
import main.observer.ProgressTracker;
import main.observer.WorkoutNotifier;
import main.strategy.WorkoutPlanStrategy;

public class WorkoutService {
    private WorkoutPlan workoutPlan;
    private WorkoutLog workoutLog;
    private ExerciseFactory exerciseFactory;
    private WorkoutNotifier workoutNotifier;

    public WorkoutService() {
        this.workoutPlan = new WorkoutPlan("Default GymBro Plan");
        this.workoutLog = new WorkoutLog();
        this.exerciseFactory = new ExerciseFactory();
        this.workoutNotifier = new WorkoutNotifier();
        this.workoutNotifier.addObserver(new ProgressTracker());
    }

    public void addStrengthExercise(String name, String muscleGroup, int sets, int reps, double weight) {
        Exercise exercise = exerciseFactory.createStrengthExercise(name, muscleGroup, sets, reps, weight);
        workoutPlan.addExercise(exercise);
    }

    public void addCardioExercise(String name, String muscleGroup, int durationMinutes, double distanceMiles) {
        Exercise exercise = exerciseFactory.createCardioExercise(name, muscleGroup, durationMinutes, distanceMiles);
        workoutPlan.addExercise(exercise);
    }

    public void applyWorkoutPlanStrategy(WorkoutPlanStrategy strategy) {
        this.workoutPlan = strategy.createWorkoutPlan();
    }

    public String viewWorkoutPlan() {
        return workoutPlan.getPlanSummary();
    }

    public void logCompletedWorkout(String description) {
        String workoutEntry = workoutLog.logWorkout(description);
        workoutNotifier.notifyObservers(workoutEntry);
    }

    public String viewWorkoutLog() {
        return workoutLog.getLogSummary();
    }

    public int getExerciseCount() {
        return workoutPlan.getExerciseCount();
    }
}
