import java.util.Comparator;
import java.util.PriorityQueue;

public class TodoList {

    public class TodoItem implements Comparable<TodoItem> {
        //instance fields TodoItem
        private String taskName;
        private String taskDescription;
        private CompleteState isComplete;
        private Priority priorityLevel;

        //constructor
        public TodoItem(String taskName, String taskDescription, Priority priorityLevel, CompleteState isComplete) {
            this.taskName = taskName;
            this.taskDescription = taskDescription;
            this.priorityLevel = priorityLevel;
            this.isComplete = isComplete;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public void setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
        }

        public CompleteState getIsComplete() {
            return isComplete;
        }

        public void setIsComplete(CompleteState isComplete) {
            this.isComplete = isComplete;
        }

        public Priority getPriorityLevel() {
            return priorityLevel;
        }

        public void setPriorityLevel(Priority priorityLevel) {
            this.priorityLevel = priorityLevel;
        }

        @Override
        public String toString() {
            final String BACKGROUND_YELLOW = "\u001B[43m";
            final String CYAN = "\u001B[36m";
            final String RESET = "\u001B[0m";

            return BACKGROUND_YELLOW + " ---- " + taskName + " ---- " + RESET +
                    "\n" +
                    CYAN + "Task Description: " + RESET + taskDescription + "\n" +
                    CYAN + "Status:" + RESET + isComplete + "\n" +
                    CYAN + "Priority:" + RESET + priorityLevel +
                    "\n" + "\n";
        }

        public int compareTo(TodoItem todoItem) {
            if (todoItem.priorityLevel == this.priorityLevel) {
                return 0;
            }

            return todoItem.priorityLevel.getLevel() > this.priorityLevel.getLevel() ? 1 : -1;
        }
    }

    //instance fields TodoList
    String name;
    PriorityQueue<TodoItem> tasks;

    //constructor
    public TodoList(String name) {
        this.name = name;
        this.tasks = new PriorityQueue<>();
    }


    public void addTask(TodoItem newTask) {
        tasks.add(newTask);
    }

    public void removeTask(TodoItem task) throws EmptyListException {
        if(tasks.isEmpty()) {
            throw new EmptyListException();
        }
            tasks.remove(task);

    }

    public TodoItem getNextTask() {
        return tasks.peek(); //looks the next task
    }

    public void getAllTasks() {
        for (TodoItem task : tasks) {
            System.out.println(task);
        }
    }

    public void getIncompleteTasks() {
        for (TodoItem task : tasks) {
            if (task.getIsComplete() == CompleteState.INCOMPLETE) {
                TodoItem item = task;
                System.out.println(item);
            }
        }
    }

    public void getCompleteTasks() {
        for (TodoItem task : tasks) {
            if (task.getIsComplete() == CompleteState.COMPLETE) {
                TodoItem item = task;
                System.out.println(item);
            }
        }
    }

    public void markTaskComplete(TodoItem task) throws AlreadyCompleteException {
        try {
            if (task.getIsComplete() == CompleteState.INCOMPLETE) {
                task.setIsComplete(CompleteState.COMPLETE);
                System.out.print(task + "---- ✅----");
            } else {
                throw new AlreadyCompleteException();
            }

        } catch (AlreadyCompleteException exception) {
            throw new AlreadyCompleteException();
        }
    }

    public void markTaskIncomplete(TodoItem task) throws AlreadyIncompleteException {
        try {
            if (task.getIsComplete() == CompleteState.COMPLETE) {
                task.setIsComplete(CompleteState.INCOMPLETE);
                System.out.print("You have to work on that!" + "\n" + task);
            } else {
                throw new AlreadyIncompleteException();
            }
        } catch (AlreadyIncompleteException exception) {
            throw new AlreadyIncompleteException();
        }
    }

    @Override
    public String toString() {
        final String BACKGROUND_WHITE = "\u001B[47m";
        final String RESET = "\u001B[0m";

        return BACKGROUND_WHITE + "-------- " + this.name + " --------" + RESET +
                "\n" +
                "\n" +
                tasks;
    }
}
