package app;

import java.time.LocalDateTime;

public class Task {
		
	private static int lastid =0;
	private int id;
	private String description;
	private Status status;
	private LocalDateTime created;
	private LocalDateTime updated;
	
	 Task (String description) {
		this.id = ++lastid;
		this.description = description;
		this.status = Status.TODO;
		this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
	}
	
	public int getId() {
		return id;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void updateDescription(String newDescription) {
		this.description = newDescription;
		this.updated = LocalDateTime.now();
	}
	
	public void mark(Status status) {
		this.status = status;
		this.updated = LocalDateTime.now();
	}
	
	
}
