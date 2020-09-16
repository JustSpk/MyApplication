package com.justspk.myapplication.db;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.justspk.myapplication.dao.TaskDao;
import com.justspk.myapplication.model.Task;

@Database(entities = {Task.class},version = 1)
public abstract class TaskDataBase extends RoomDatabase {

    public abstract TaskDao taskDao();

    public static TaskDataBase sInstance;

    public static synchronized TaskDataBase getInstance(Context context){
        if (sInstance==null){
            sInstance=create(context);
        }
        return sInstance;
    }

    private static TaskDataBase create(Context context) {
        RoomDatabase.Builder<TaskDataBase> builder= Room.databaseBuilder(context.getApplicationContext()
                ,TaskDataBase.class,"Spk");
        return builder.build();
    }
}
