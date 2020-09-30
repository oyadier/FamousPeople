package com.oyatech.roomfamouspeople;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.oyatech.roomfamouspeople.dataroom.AppDatabase;
import com.oyatech.roomfamouspeople.dataroom.Users;

public class AddUser extends AppCompatActivity {
    EditText firstName, secondName, email;
    Button saveUser;

    private final String TAG = AddUser.class.getSimpleName();
    private AppDatabase mAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_use);
        this.setTitle("New User");

        firstName = findViewById(R.id.tvFirstName);
        secondName = findViewById(R.id.tvSecondName);
        email = findViewById(R.id.tvEmail);
        saveUser = findViewById(R.id.btnUser);
        mAppDatabase = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"production")
                .allowMainThreadQueries()
                .build();
    }

    public void AddUser(View pView)
    {
        Log.d(TAG, firstName.getText().toString() + " added");

        mAppDatabase.mUserDao().insertData(getUserEntry());

        startActivity(new Intent(AddUser.this,MainActivity.class));
    }

    private Users getUserEntry()
    {
      String firt_name =  firstName.getText().toString();
       String second_name = secondName.getText().toString();
      String e_mail =  email.getText().toString();

        return new Users(firt_name,second_name,e_mail);
    }

}