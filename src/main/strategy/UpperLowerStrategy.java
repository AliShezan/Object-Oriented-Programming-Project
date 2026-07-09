package main.strategy;

import main.builder.WorkoutPlanBuilder;
import main.model.WorkoutPlan;

public class UpperLowerStrategy implements WorkoutPlanStrategy {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WorkoutPlanBuilder("Upper Lower Plan")
                .addStrengthExercise("Shoulder Press", "Shoulders", 3, 8, 90)
                .addStrengthExercise("Seated Row", "Back", 3, 10, 120)
                .addStrengthExercise("Squat", "Legs", 3, 8, 185)
                .build();
    }

    @Override
    public String getStrategyName() {
        return "Upper Lower";
    }
}
