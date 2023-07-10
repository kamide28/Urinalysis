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

    public List<List<Result>> searchResultById(Integer id) {
        List<List<Result>> result =
                Arrays.asList(urineMapper.searchRevieweeResultById(id), urineMapper.searchReviewerResultById(id));
        return result;
    }

}
