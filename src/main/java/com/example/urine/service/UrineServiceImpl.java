package com.example.urine.service;

import com.example.urine.mapper.UrineMapper;
import com.example.urine.model.Result;
import com.example.urine.model.Task;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UrineServiceImpl implements UrineService {

    private final UrineMapper urineMapper;

    public UrineServiceImpl(UrineMapper urineMapper) {
        this.urineMapper = urineMapper;
    }

    @Override
    public List<Task> findRecentTasks() {
        return urineMapper.findRecentTasks();
    }

    @Override
    public List<List<Result>> searchResultById(Integer id) {
        Task task = urineMapper.findTaskById(id);
        if (task == null) {
            throw new RuntimeException();
        }
        List<List<Result>> result = Arrays.asList(urineMapper.searchRevieweeResultById(task.getRevieweeResultId()),
                urineMapper.searchReviewerResultById(task.getReviewerResultId()));
        return result;
    }
}
