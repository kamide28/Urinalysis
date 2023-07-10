package com.example.urine.mapper;

import com.example.urine.model.Result;
import com.example.urine.model.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UrineMapper {

    @Select("SELECT * FROM tasks ORDER BY taskId DESC LIMIT 30")
    public List<Task> findRecentTasks();

    @Select("SELECT * FROM revieweeResults WHERE revieweeResultId= #{id}")
    public List<Result> searchRevieweeResultById(Integer id);

    @Select("SELECT * FROM reviewerResults WHERE reviewerResultId = #{id}")
    public List<Result> searchReviewerResultById(Integer id);
}
