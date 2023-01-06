package com.hansol.weeklyplan.task;

import com.hansol.weeklyplan.task.dto.TaskRequest;
import com.hansol.weeklyplan.task.dto.TaskResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
public class TaskServiceImpl implements TaskService {
    @Override
    public List<TaskResponse> findTasks() {
        return null;
    }

    @Override
    public TaskResponse findTask(Long taskId) {
        return null;
    }

    @Override
    @Transactional
    public Long addTask(TaskRequest taskRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long modifyTask(Long taskId, TaskRequest taskRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long deleteTask(Long taskId, TaskRequest taskRequest) {
        return null;
    }
}
