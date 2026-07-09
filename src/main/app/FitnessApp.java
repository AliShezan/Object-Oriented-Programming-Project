package main.app;

import java.util.Scanner;
import main.service.WorkoutService;
import main.strategy.FullBodyStrategy;
import main.strategy.PushPullLegsStrategy;
import main.strategy.UpperLowerStrategy;
import main.strategy.WorkoutPlanStrategy;

public class FitnessApp {
    private Scanner scanner;
    private WorkoutService workoutService;
    private boolean running;

    public FitnessApp() {
        this.scanner = new Scanner(System.in);
        this.workoutService = new WorkoutService();
        this.running = true;
    }

    public void run() {
        System.out.println("Welcome to GymBro Workout Planner!");

        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");
            handleMenuChoice(choice);
        }

        System.out.println("Exiting GymBro Workout Planner. Stay consistent.");
    }

    private void printMenu() {
        System.out.println();
        System.out.println("=== GymBro Workout Planner ===");
        System.out.println("1. Add strength exercise");
        System.out.println("2. Add cardio exercise");
        System.out.println("3. View workout plan");
        System.out.println("4. Log completed workout");
        System.out.println("5. View workout history");
        System.out.println("6. Generate workout plan by style");
        System.out.println("7. Exit");
    }

    private void handleMenuChoice(int choice) {
        if (choice == 1) {
            addStrengthExercise();
        } else if (choice == 2) {
            addCardioExercise();
        } else if (choice == 3) {
            viewWorkoutPlan();
        } else if (choice == 4) {
            logCompletedWorkout();
        } else if (choice == 5) {
            viewWorkoutHistory();
        } else if (choice == 6) {
            generateWorkoutPlanByStyle();
        } else if (choice == 7) {
            running = false;
        } else {
            System.out.println("Invalid choice. Please choose a number from 1 to 7.");
        }
    }

    private void addStrengthExercise() {
        System.out.println();
        System.out.println("--- Add Strength Exercise ---");

        String name = readLine("Exercise name: ");
        String muscleGroup = readLine("Muscle group: ");
        int sets = readInt("Sets: ");
        int reps = readInt("Reps: ");
        double weight = readDouble("Weight in lbs: ");

        workoutService.addStrengthExercise(name, muscleGroup, sets, reps, weight);
        System.out.println("Strength exercise added successfully.");
    }

    private void addCardioExercise() {
        System.out.println();
        System.out.println("--- Add Cardio Exercise ---");

        String name = readLine("Exercise name: ");
        String muscleGroup = readLine("Muscle group: ");
        int duration = readInt("Duration in minutes: ");
        double distance = readDouble("Distance in miles: ");

        workoutService.addCardioExercise(name, muscleGroup, duration, distance);
        System.out.println("Cardio exercise added successfully.");
    }

    private void viewWorkoutPlan() {
        System.out.println();
        System.out.println(workoutService.viewWorkoutPlan());
    }

    private void logCompletedWorkout() {
        System.out.println();
        System.out.println("--- Log Completed Workout ---");

        String description = readLine("Describe the completed workout: ");
        workoutService.logCompletedWorkout(description);

        System.out.println("Workout logged successfully.");
    }

    private void viewWorkoutHistory() {
        System.out.println();
        System.out.println(workoutService.viewWorkoutLog());
    }

    private void generateWorkoutPlanByStyle() {
        System.out.println();
        System.out.println("--- Generate Workout Plan by Style ---");
        System.out.println("1. Push Pull Legs");
        System.out.println("2. Upper Lower");
        System.out.println("3. Full Body");

        int choice = readInt("Choose a plan style: ");
        WorkoutPlanStrategy strategy = null;

        if (choice == 1) {
            strategy = new PushPullLegsStrategy();
        } else if (choice == 2) {
            strategy = new UpperLowerStrategy();
        } else if (choice == 3) {
            strategy = new FullBodyStrategy();
        } else {
            System.out.println("Invalid plan style.");
            return;
        }

        workoutService.applyWorkoutPlanStrategy(strategy);
        System.out.println(strategy.getStrategyName() + " plan generated successfully.");
    }

    private String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);

            try {
                int value = Integer.parseInt(scanner.nextLine());
                return value;
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    private double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);

            try {
                double value = Double.parseDouble(scanner.nextLine());
                return value;
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
