package com.oyatech.roomfamouspeople;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddUser extends AppCompatActivity {
    EditText firstName, secondName, email;
    Button saveUser;

    private final String TAG = AddUser.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_use);
        this.setTitle("New User");

        firstName = findViewById(R.id.tvFirstName);
        secondName = findViewById(R.id.tvSecondName);
        email = findViewById(R.id.tvEmail);
        saveUser = findViewById(R.id.btnUser);

    }

    public void AddUser(View pView)
    {
        Log.d(TAG, firstName.getText().toString() + " added");
    }

}