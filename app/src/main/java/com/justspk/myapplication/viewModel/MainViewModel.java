package com.justspk.myapplication.viewModel;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.justspk.myapplication.dao.TaskDao;
import com.justspk.myapplication.db.TaskDataBase;
import com.justspk.myapplication.model.Task;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private LiveData<List<Task>> mTask;
    private TaskDao mTaskDao;

    public MainViewModel(@NonNull Application application) {
        super(application);
        mTaskDao= TaskDataBase.getInstance(application).taskDao();
    }

    public LiveData<List<Task>> getTask(){
        return mTask;
    }
}
