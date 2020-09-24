package com.oyatech.roomfamouspeople;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
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

        user = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {

            user.add(new Users(i,"Robert","Oyaier","oyadevelop@gmail.com"));
        }
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        RecyclerView.Adapter adapter = new FamousRecycleAdapter(user);
        mRecyclerView.setAdapter(adapter);
        return view;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}