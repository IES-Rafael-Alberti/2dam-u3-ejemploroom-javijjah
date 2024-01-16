package com.hachatml.taskmanager.addtasks.data.di

import com.hachatml.taskmanager.addtasks.data.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Provides
    fun provideTaskDao(taskManageDatabase): TaskDao {
        return tasksManageDatabase.taskDao()
    }
}