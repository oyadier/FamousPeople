package com.oyatech.roomfamouspeople;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//A class that create the database and abstract the Database Access Object interface
@Database(entities = {Users.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao mUserDao();
}
