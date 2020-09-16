package com.justspk.myapplication.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import static androidx.room.RoomMasterTable.TABLE_NAME;

@Entity(tableName = "Spk")
public class Task {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title,description;


}
