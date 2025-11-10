package app;

import java.util.List;
import java.util.Optional;

public class TaskManager {

	private List<Task> tasks;
	
	public void listTasks(String type) {
		for (Task task : tasks) {
			String status = task.getStatus().toString().strip();
			if (type.equals("ALL") || status.equals(type)) {
				System.out.println(task.toString());
			}
		}
	}
	
	// If the searched task is found it is returned, if not
	// the function returns an empty optional
	public Optional<Task> findTask(String id) {
		for (Task task : tasks) {
			if(task.getId() == Integer.parseInt(id)) {
				return Optional.of(task);
			}
		}
		
		return Optional.empty();
	}
	
	public void addTask(String description) {
		Task newTask = new Task(description);
		tasks.add(newTask);
		System.out.println("Task added successfully (ID: "+ newTask.getId()+" )");
	}
	
	
	
	
	
	
	
}
