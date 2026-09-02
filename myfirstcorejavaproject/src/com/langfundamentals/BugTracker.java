package com.langfundamentals;

public class BugTracker {

	int bugID;
	String applicationName;
	String bugTitle;
	String severity;
	int priority;
	String status;
	String assignedDeveloper;
	
	int getBugID() {
		return bugID;
	}
	String getApplicationName() {
		return applicationName;
	}
	String getBugTitle() {
		return bugTitle;
	}
	String getBugSeverity() {
		return severity;
	}
	int getPriority() {
		return priority;
	}
	String getStatus() {
		return status;
	}
	String getAssignedDeveloper() {
		return assignedDeveloper;
	}
	void assignToDeveloper(int bugID,String developerName) {
		this.bugID=bugID;
		this.assignedDeveloper=developerName;
	}
	void updateStatus(String newStatus) {
		this.status=newStatus;
		System.out.println("Updated Status : "+status);
	}
	void displayBugsummary() {
		System.out.println("Bug ID : "+getBugID());
		System.out.println("Application Name : "+getApplicationName());
		System.out.println("Bug Title : "+getBugTitle());
		System.out.println("Bug Severity : "+getBugSeverity());
		System.out.println("Priority : "+getPriority());
		System.out.println("Status : "+status);
		System.out.println("Assigned Developer Name : "+getAssignedDeveloper());
	}
	
	
	public static void main(String[] args) {

		BugTracker b1 = new BugTracker();
		
		b1.bugID=101;
		b1.applicationName="amazon";
		b1.bugTitle="Compilation Error";
		b1.severity="High";
		b1.priority=3;
		b1.status="In Development";
		b1.assignedDeveloper="Ramesh";
		
		b1.displayBugsummary();
		b1.assignToDeveloper(b1.bugID, b1.assignedDeveloper);
		b1.updateStatus("Testing");
		
	}

}
