package main.strategy;

import main.builder.WorkoutPlanBuilder;
import main.model.WorkoutPlan;

public class PushPullLegsStrategy implements WorkoutPlanStrategy {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WorkoutPlanBuilder("Push Pull Legs Plan")
                .addStrengthExercise("Bench Press", "Chest", 3, 8, 135)
                .addStrengthExercise("Lat Pulldown", "Back", 3, 10, 100)
                .addStrengthExercise("Leg Press", "Legs", 3, 10, 220)
                .build();
    }

    @Override
    public String getStrategyName() {
        return "Push Pull Legs";
    }
}
