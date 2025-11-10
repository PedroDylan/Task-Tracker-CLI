package app;

public class TaskApp {

	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		
		if (args.length<1) {
			System.out.println("Usage: TaskApp <command> [arguments]");
            return;
		}
		
		String command = args[0];
		
		
		switch(command) {
		case "add":
			manager.addTask(args[1]);
			break;
		}
		
		
		
		
		

	}

}
