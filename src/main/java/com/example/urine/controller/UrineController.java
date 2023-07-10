package com.example.urine.controller;

import com.example.urine.model.Result;
import com.example.urine.model.Task;
import com.example.urine.service.UrineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UrineController {
    @Autowired
    private final UrineService urineService;

    public UrineController(UrineService urineService) {
        this.urineService = urineService;
    }

    @GetMapping("/urine")
    public List<Task> findRecentTasks() {
        return urineService.findRecentTasks();
    }

    @GetMapping("/urine/{id}")
    public List<List<Result>> searchResultById(@PathVariable("id") Integer id) {
        return urineService.searchResultById(id);
    }
}
