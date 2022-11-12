package com.zasa.yttodo.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

/**
 * Created by Sangeeth Amirthanathan
 * on 11/12/2022.
 */

@Parcelize
@Entity(tableName = "task_table")
data class TaskEntry(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var priority: Int,
    var timeStamp: Long
) : Parcelable