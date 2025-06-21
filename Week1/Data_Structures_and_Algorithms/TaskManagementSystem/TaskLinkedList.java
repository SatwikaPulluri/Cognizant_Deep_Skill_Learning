public class TaskLinkedList {
    private TaskNode head;

    // Add task at the end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added: " + task);
    }

    // Search task by ID
    public Task searchTask(int taskId) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.task.getTaskId() == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    // Traverse and display tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        TaskNode temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }

        TaskNode prev = head;
        TaskNode curr = head.next;

        while (curr != null) {
            if (curr.task.getTaskId() == taskId) {
                prev.next = curr.next;
                System.out.println("Task with ID " + taskId + " deleted.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task with ID " + taskId + " not found.");
    }
}
