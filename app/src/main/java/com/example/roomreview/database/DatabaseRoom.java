package com.example.roomreview.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.roomreview.database.dao.DatabaseRequet;
import com.example.roomreview.database.entity.WordEntity;

@Database(entities = WordEntity.class, version = 1)
public abstract class DatabaseRoom extends RoomDatabase {
    public abstract DatabaseRequet databaseRequet();

    public static DatabaseRoom databaseRoom = null;

    public synchronized static DatabaseRoom getInstance(Context context){
        if(databaseRoom == null){
            databaseRoom = Room.databaseBuilder(context
                    ,DatabaseRoom.class
                    ,"Quanlytuvung")
                    .build();
        }
        return databaseRoom;
    }
}
