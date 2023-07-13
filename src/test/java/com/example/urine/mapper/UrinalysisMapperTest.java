package com.example.urine.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.urine.model.Result;
import com.example.urine.model.Task;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.transaction.annotation.Transactional;


@DBRider
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UrinalysisMapperTest {
    @Autowired
    UrineMapper urineMapper;
    
    @Test
    @DataSet(value = "datasets/tasks.yml")
    @Transactional
    void タスクが取得できること() {
        List<Task> tasks = urineMapper.findRecentTasks();
        assertThat(tasks)
                .hasSize(3)
                .contains(
                        new Task(1, "7/7鈴木一本目", 1, 1),
                        new Task(2, "7/7山田一本目", 2, 2),
                        new Task(3, "7/7鈴木二本目", 3, 3)
                );
    }
    
    @Test
    @DataSet(value = "datasets/tasks.yml")
    @Transactional
    void ID指定のタスクを取得できること() {
        Task task = urineMapper.findTaskById(1);
        assertThat(task).isEqualTo(
                new Task(1, "7/7鈴木一本目", 1, 1)
        );
    }
    
    @Test
    @DataSet(value = "datasets/empty.yml")
    @Transactional
    void IDが存在しないときは空で返すこと() {
        Task task = urineMapper.findTaskById(99);
        assertThat(task).isNull();
    }
    
    @Test
    @DataSet(value = "datasets/revieweeResult.yml")
    @Transactional
    void ID指定のレビュイー結果を取得できること() {
        List<Result> revieweeResult = urineMapper.searchRevieweeResultById(1);
        assertThat(revieweeResult).hasSize(1).contains(
                new Result(1, "鈴木", "1~3/20", "1~3/20", "1~3/1",
                        "1~3/10", "1~3/10", "桿菌(1+)", "正常範囲内と考えます")
        );
    }
    
    @Test
    @DataSet(value = "datasets/reviewerResult.yml")
    @Transactional
    void ID指定のレビュワー結果を取得できること() {
        List<Result> reviewerResult = urineMapper.searchReviewerResultById(1);
        assertThat(reviewerResult).contains(
                new Result(1, "鈴木", "1~3/20", "1~3/20", "1~3/1",
                        "1~3/10", "1~3/10", "桿菌(1+)", "正常範囲内と考えます")
        );
    }
}
