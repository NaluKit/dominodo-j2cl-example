package org.dominokit.samples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {

  private String       id;
  private String       title;
  private String       description;
  private Priority     priority;
  private Date         dueDate;
  private List<String> tags = new ArrayList<>();
  private Status       status = Status.ACTIVE;
  private Project      project;
  private List<String> attachments = new ArrayList<>();

  public Task() {
    this.id = GUID.get();
  }

  public String getId() {
    return id;
  }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public boolean isActive(){
        return Status.ACTIVE.equals(this.getStatus());
    }

}
