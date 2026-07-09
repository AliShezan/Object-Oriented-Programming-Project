package main.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class WorkoutLog {
    private List<String> completedWorkouts;

    public WorkoutLog() {
        this.completedWorkouts = new ArrayList<>();
    }

    public String logWorkout(String workoutDescription) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String entry = "[" + now.format(formatter) + "] " + workoutDescription;
        completedWorkouts.add(entry);
        return entry;
    }

    public boolean isEmpty() {
        return completedWorkouts.isEmpty();
    }

    public List<String> getCompletedWorkouts() {
        return completedWorkouts;
    }

    public String getLogSummary() {
        if (completedWorkouts.isEmpty()) {
            return "No completed workouts have been logged yet.";
        }

        StringBuilder summary = new StringBuilder();
        summary.append("Workout History:\n");

        for (int i = 0; i < completedWorkouts.size(); i++) {
            summary.append(i + 1).append(". ").append(completedWorkouts.get(i)).append("\n");
        }

        return summary.toString();
    }
}
