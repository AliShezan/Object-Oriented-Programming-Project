package main.factory;

import main.model.CardioExercise;
import main.model.Exercise;
import main.model.StrengthExercise;

public class ExerciseFactory {
    public Exercise createStrengthExercise(String name, String muscleGroup, int sets, int reps, double weight) {
        return new StrengthExercise(name, muscleGroup, sets, reps, weight);
    }

    public Exercise createCardioExercise(String name, String muscleGroup, int durationMinutes, double distanceMiles) {
        return new CardioExercise(name, muscleGroup, durationMinutes, distanceMiles);
    }
}
