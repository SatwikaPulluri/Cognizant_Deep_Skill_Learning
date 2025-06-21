public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task t1 = new Task(1, "Design UI", "Pending");
        Task t2 = new Task(2, "Write Backend", "In Progress");
        Task t3 = new Task(3, "Test Features", "Pending");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        System.out.println("\n📋 All Tasks:");
        taskList.displayTasks();

        System.out.println("\n🔍 Search for Task ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Not found");

        System.out.println("\n🗑️ Delete Task ID 1:");
        taskList.deleteTask(1);

        System.out.println("\n📋 Remaining Tasks:");
        taskList.displayTasks();
    }
}
