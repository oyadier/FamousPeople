package com.oyatech.roomfamouspeople.dataroom;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

//An interface for all queries
@Dao
public interface UserDao {
    // @Query("SELECT * FROM Users Limit 1")
    @Query("SELECT * FROM Users")
    List<Users> getQueryDisplay();

    @Delete
//Delete a user by swiping
    int deleteFamous(Users pUsers);

    @Query("DELETE FROM Users")
    void deleteAllUsers();

    @Insert()
    void insertData(Users... pUsers);
}
