package com.example.urine.model;

public class Task {
    private Integer taskId;
    private String taskName;
    private Integer revieweeResultId;
    private Integer reviewerResultId;

    public Task(Integer taskId, String taskName, Integer revieweeResultId, Integer reviewerResultId) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.revieweeResultId = revieweeResultId;
        this.reviewerResultId = reviewerResultId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public Integer getRevieweeResultId() {
        return revieweeResultId;
    }

    public Integer getReviewerResultId() {
        return reviewerResultId;
    }
}
