package com.oyatech.roomfamouspeople;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.oyatech.roomfamouspeople.dataroom.AppDatabase;
import com.oyatech.roomfamouspeople.dataroom.Users;

import java.util.List;

public class FirstFragment extends Fragment {
RecyclerView mRecyclerView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

        mRecyclerView = view.findViewById(R.id.recycleview);
        List<Users> user;

        AppDatabase appDatabase = Room.databaseBuilder(getContext(),AppDatabase.class,"production")
                .allowMainThreadQueries()
                .build();
        //Calling the display method onto the recycle view
      user =   appDatabase.mUserDao().getQueryDisplay();
      //setting the layoutManager for recycleView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //Creating the adapter
        RecyclerView.Adapter adapter = new FamousRecycleAdapter(user);
        //Setting recycleView adapter
        mRecyclerView.setAdapter(adapter);
        return view;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}