# Todo List

This is a simple Java-based Todo List application. It allows users to manage their tasks efficiently by adding, completing, and prioritizing items.

## Features
- Add new tasks to your todo list
- Mark tasks as complete or incomplete
- Set priority for each task
- Handle empty list and invalid state transitions with custom exceptions

## Requirements
- Java 8 or higher

## How to Run
1. Clone this repository or download the source code.
2. Navigate to the `src` directory.
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the application:
   ```sh
   java Main
   ```

## Project Structure
- `Main.java`: Entry point of the application
- `TodoList.java`: Core logic for managing the todo list
- `Priority.java`: Enum for task priorities
- `CompleteState.java`: Enum for task completion state
- `AlreadyCompleteException.java`, `AlreadyIncompleteException.java`, `EmptyListException.java`: Custom exception classes

## License
This project is for educational purposes.

