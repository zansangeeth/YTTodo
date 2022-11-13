package com.zasa.yttodo.repository

import androidx.lifecycle.LiveData
import androidx.room.Query
import com.zasa.yttodo.database.TaskDao
import com.zasa.yttodo.database.TaskEntry

/**
 * Created by Sangeeth Amirthanathan
 * on 11/13/2022.
 */
class TaskRepository(val taskDao: TaskDao) {

    suspend fun insert(taskEntry: TaskEntry) = taskDao.insert(taskEntry)
    suspend fun updateData(taskEntry: TaskEntry) = taskDao.update(taskEntry)
    suspend fun deleteItem(taskEntry: TaskEntry) = taskDao.delete(taskEntry)
    suspend fun deleteAll(){
        taskDao.deleteAll()
    }
    fun getAllTasks() : LiveData<List<TaskEntry>> = taskDao.getAllTasks()
    fun getAllPriorityTasks() : LiveData<List<TaskEntry>> = taskDao.getAllPriorityTasks()
    fun searchDatabase(searhQuery: String) : LiveData<List<TaskEntry>>{
        return taskDao.searchTasks(searhQuery)
    }
}