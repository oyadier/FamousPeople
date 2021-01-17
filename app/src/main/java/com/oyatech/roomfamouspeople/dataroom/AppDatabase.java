package com.oyatech.roomfamouspeople.dataroom;

import androidx.room.Database;
import androidx.room.RoomDatabase;

//A class that create the database and abstract the Database Access Object interface
@Database(entities = {Users.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public AppDatabase() {
    }

    public abstract UserDao mUserDao();
}
