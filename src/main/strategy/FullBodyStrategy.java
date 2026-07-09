package main.strategy;

import main.builder.WorkoutPlanBuilder;
import main.model.WorkoutPlan;

public class FullBodyStrategy implements WorkoutPlanStrategy {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WorkoutPlanBuilder("Full Body Plan")
                .addStrengthExercise("Incline Dumbbell Press", "Chest", 3, 8, 100)
                .addStrengthExercise("Cable Row", "Back", 3, 10, 110)
                .addStrengthExercise("Romanian Deadlift", "Hamstrings", 3, 8, 155)
                .addCardioExercise("Treadmill Walk", "Cardio", 20, 1.5)
                .build();
    }

    @Override
    public String getStrategyName() {
        return "Full Body";
    }
}
