package com.example.urine.service;

import com.example.urine.model.Result;
import com.example.urine.model.Task;
import java.util.List;

public interface UrineService {
    
    
    public List<Task> findRecentTasks();
    
    public List<List<Result>> searchResultById(Integer id);
}
