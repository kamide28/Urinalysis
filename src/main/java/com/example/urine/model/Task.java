package com.example.urine.model;

public class Task {
    private Integer id;
    private String name;
    private Integer revieweeResultId;
    private Integer reviewerResultId;

    public Task(Integer id, String name, Integer revieweeResultId, Integer reviewerResultId) {
        this.id = id;
        this.name = name;
        this.revieweeResultId = revieweeResultId;
        this.reviewerResultId = reviewerResultId;
    }
}
