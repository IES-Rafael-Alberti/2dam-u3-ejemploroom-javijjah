package com.hachatml.taskmanager.addtasks.data

import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface TaskDao {
    @Query("SELECT * from TaskEntity")
    fun getTasks(): Flow<List<TaskEntity>>

    @Insert
    suspend fun addTask(item:TaskEntity)
}