package com.zasa.yttodo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Query
import com.zasa.yttodo.database.TaskDatabase
import com.zasa.yttodo.database.TaskEntry
import com.zasa.yttodo.repository.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by Sangeeth Amirthanathan
 * on 11/13/2022.
 */
class TaskViewModel(application: Application) : AndroidViewModel(application) {

    private val taskDao = TaskDatabase.getDatabase(application).taskDao()

    private val repository : TaskRepository

    val getAllTasks : LiveData<List<TaskEntry>>
    val getAllPriorityTasks : LiveData<List<TaskEntry>>

    init {
        repository = TaskRepository(taskDao)
        getAllTasks = repository.getAllTasks()
        getAllPriorityTasks = repository.getAllPriorityTasks()
    }

    fun insert(taskEntry: TaskEntry){
        viewModelScope.launch(Dispatchers.IO){
            repository.insert(taskEntry)
        }
    }

    fun delete(taskEntry: TaskEntry){
        viewModelScope.launch(Dispatchers.IO){
            repository.deleteItem(taskEntry)
        }
    }

    fun update(taskEntry: TaskEntry){
        viewModelScope.launch(Dispatchers.IO){
            repository.updateData(taskEntry)
        }
    }

    fun deleteAll(){
        viewModelScope.launch(Dispatchers.IO){
            repository.deleteAll()
        }
    }

    fun searchDatabase(searchQuery: String) : LiveData<List<TaskEntry>>{
        return repository.searchDatabase(searchQuery)
    }


}