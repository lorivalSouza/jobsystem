package br.com.palazzo.jobsystem.model;

public enum JobStatus {
	
	RUNNING("Running"),
	ERROR("Error"),
	SUCCESS("Success"),
	WAITING("Waiting");
	
	private String description;
	
	JobStatus(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

}
