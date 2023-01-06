package com.hansol.weeklyplan.task;

import com.hansol.weeklyplan.task.dto.TaskRequest;
import com.hansol.weeklyplan.task.dto.TaskResponse;

import java.util.List;

public interface TaskService {

    List<TaskResponse> findTasks();

    TaskResponse findTask(Long taskId);

    Long addTask(TaskRequest taskRequest);

    Long modifyTask(Long taskId, TaskRequest taskRequest);

    Long deleteTask(Long taskId, TaskRequest taskRequest);
}
