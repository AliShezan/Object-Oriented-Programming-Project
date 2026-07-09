package main.observer;

public class ProgressTracker implements WorkoutObserver {
    private int completedWorkoutCount;

    public ProgressTracker() {
        this.completedWorkoutCount = 0;
    }

    @Override
    public void update(String workoutEntry) {
        completedWorkoutCount++;
        System.out.println("Progress Tracker Update: Total completed workouts = " + completedWorkoutCount);
    }

    public int getCompletedWorkoutCount() {
        return completedWorkoutCount;
    }
}
