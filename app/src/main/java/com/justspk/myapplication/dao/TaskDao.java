package com.justspk.myapplication.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.justspk.myapplication.model.Task;

import java.util.List;

@Dao
public interface TaskDao {
    @Query("SELECT * FROM Spk")
    LiveData<List<Task>> getAllTask();
    @Query("SELECT * FROM Spk WHERE id=:id")
    LiveData<Task> getTaskById(String id);
}
