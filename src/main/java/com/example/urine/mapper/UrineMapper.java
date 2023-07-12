package com.example.urine.mapper;

import com.example.urine.model.Result;
import com.example.urine.model.Task;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UrineMapper {
    @Select("SELECT * FROM tasks ORDER BY task_id DESC LIMIT 30")
    public List<Task> findRecentTasks();
    
    @Select("SELECT * FROM tasks WHERE task_id= #{id}")
    public Task findTaskById(Integer id);
    
    @Select("SELECT * FROM reviewee_results WHERE reviewee_result_id= #{id}")
    public List<Result> searchRevieweeResultById(Integer id);
    
    @Select("SELECT * FROM reviewer_results WHERE reviewer_result_id = #{id}")
    public List<Result> searchReviewerResultById(Integer id);
}
