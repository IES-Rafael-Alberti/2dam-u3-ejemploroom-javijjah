package com.hachatml.taskmanager.addtasks.domain

import com.hachatml.taskmanager.addtasks.data.TaskRepository
import com.hachatml.taskmanager.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}