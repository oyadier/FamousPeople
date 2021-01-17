package com.oyatech.roomfamouspeople.dataroom;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.android.material.shape.MaterialShapeDrawable;

@Entity
public class Users {
    
    @PrimaryKey (autoGenerate = true)
    public int id ;
    @ColumnInfo(name = "first_name")
    public String firstName;
    @ColumnInfo(name = "second_name")
    public String secondName;
    @ColumnInfo(name = "email")
    public String email;

    public Users() {
    }

    public Users(String pFirstName, String pSecondName, String pEmail) {
        firstName = pFirstName;
        secondName = pSecondName;
        email = pEmail;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String pFirstName) {
        firstName = pFirstName;
    }

    public void setSecondName(String pSecondName) {
        secondName = pSecondName;
    }

    public void setEmail(String pEmail) {
        email = pEmail;
    }
}
