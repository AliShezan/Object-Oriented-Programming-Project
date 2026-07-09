package main.observer;

import java.util.ArrayList;
import java.util.List;

public class WorkoutNotifier {
    private List<WorkoutObserver> observers;

    public WorkoutNotifier() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(WorkoutObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WorkoutObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String workoutEntry) {
        for (WorkoutObserver observer : observers) {
            observer.update(workoutEntry);
        }
    }
}
