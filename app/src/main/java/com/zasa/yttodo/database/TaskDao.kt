package com.zasa.yttodo.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

/**
 * Created by Sangeeth Amirthanathan
 * on 11/12/2022.
 */

@Dao
interface TaskDao {

    @Insert
    suspend fun insert(taskEntry: TaskEntry)

    @Delete
    suspend fun delete(taskEntry: TaskEntry)

    @Update
    suspend fun update(taskEntry: TaskEntry)

    @Query("DELETE FROM task_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM task_table ORDER BY timeStamp DESC")
    fun getAllTasks(): LiveData<List<TaskEntry>>

    @Query("select * from task_table order by priority asc")
    fun getAllPriorityTasks() : LiveData<List<TaskEntry>>

    @Query("select * from task_table where title like :searchQuery order by timeStamp desc")
    fun searchTasks(searchQuery : String) : LiveData<List<TaskEntry>>
}