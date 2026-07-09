package main.strategy;

import main.model.WorkoutPlan;

public interface WorkoutPlanStrategy {
    WorkoutPlan createWorkoutPlan();

    String getStrategyName();
}
