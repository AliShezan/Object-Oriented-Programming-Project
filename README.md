## Sprint 1

\# Object Oriented Software Development Project



\## Sprint 1 Checklist



\### Are you in a Group?

No, I am working alone.



\### If so, who else is in your group?

Not applicable.



\### Do you have your GitHub account set up?

Yes.



\### Do you have a public repository for your Project?

Yes.



\### What is the link to your GitHub repository?

https://github.com/AliShezan/Object-Oriented-Programming-Project



\### If you are in a group, does everyone have write access to the GitHub repo?

Not applicable.



\### Do you have a Hello World program that compiles and runs?

Yes.



\### Where is the entry point to your project?

The entry point is:



src/main/Main.java



\## Project Structure



project\_root/

src/

lib/

tests/



The src folder contains all source code for the program.



The lib folder will contain any third-party libraries if needed later.



The tests folder will contain JUnit test classes later in the project.


## Sprint 2 Project Proposal

### Project Name
GymBro Workout Planner

### Project Description
GymBro Workout Planner is a Java command-line fitness tracking application that allows users to create workout plans, add exercises, log completed workouts, and view workout history. The project is designed to demonstrate object-oriented programming principles through a modular structure that can later be extended with multiple design patterns.

### Planned Features
- Add strength exercises
- Add cardio exercises
- View the current workout plan
- Log completed workouts
- View workout history
- Generate simple progress summaries in later sprints

### Planned Libraries
No external libraries are currently planned for Sprint 2. The project will use standard Java libraries. JUnit will be added later for testing.

### Planned Design Patterns
- Factory Pattern
- Strategy Pattern
- Builder Pattern
- Command Pattern
- Observer Pattern
- Singleton Pattern

### Sprint 2 Progress Plan
For Sprint 2, the goal is to create the project foundation, including the command-line menu, model classes, workout plan structure, and basic workout logging functionality.

## Sprint 4 Design Pattern Progress

### Design Pattern 3: Builder Pattern

The Builder Pattern is used to create workout plans step-by-step. The WorkoutPlanBuilder allows the application to build a WorkoutPlan by chaining method calls for strength and cardio exercises. This keeps workout plan construction cleaner and easier to extend.

Relevant classes:
- WorkoutPlanBuilder
- WorkoutPlan
- ExerciseFactory
- Exercise
- StrengthExercise
- CardioExercise
- PushPullLegsStrategy
- UpperLowerStrategy
- FullBodyStrategy

UML Diagram:
- BuilderPatternUML.puml

### Design Pattern 4: Observer Pattern

The Observer Pattern is used when a workout is logged. WorkoutService logs the workout, then WorkoutNotifier notifies registered observers. ProgressTracker currently observes workout logging events and updates the completed workout count.

Relevant classes:
- WorkoutObserver
- ProgressTracker
- WorkoutNotifier
- WorkoutService
- WorkoutLog

UML Diagram:
- ObserverPatternUML.puml

### Updated Final Submission Demo Plan

For the final submission, I plan to demonstrate GymBro Workout Planner as a command-line application. The demo will show adding exercises, generating workout plans using Strategy Pattern, building workout plans through Builder Pattern, logging completed workouts, and notifying progress tracking through Observer Pattern.

### Sprint 4 Problems or Issues

There are no major blocking issues at this time. The application currently stores data only while it is running. File saving or permanent storage may be added later if time allows.
