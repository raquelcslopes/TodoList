import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {


        TodoList list = new TodoList("Things to do");

        TodoList.TodoItem task = list.new TodoItem("Shops", "Buy Christmas presents",Priority.LOW, CompleteState.INCOMPLETE);
        TodoList.TodoItem task1 = list.new TodoItem("Clean the house","Clean it like you mean it", Priority.LOW,CompleteState.COMPLETE);
        TodoList.TodoItem task2 = list.new TodoItem("Study", "Cry all night with the Java book open",Priority.HIGH, CompleteState.INCOMPLETE);

list.addTask(task);
list.addTask(task1);
list.addTask(task2);
        System.out.println(list.toString());
    }
}