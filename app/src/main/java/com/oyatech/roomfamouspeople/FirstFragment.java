package com.oyatech.roomfamouspeople;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.google.android.material.snackbar.Snackbar;
import com.oyatech.roomfamouspeople.dataroom.AppDatabase;
import com.oyatech.roomfamouspeople.dataroom.Users;

import java.util.List;

public class FirstFragment extends Fragment {
RecyclerView mRecyclerView;
private final String TAG = FirstFragment.class.getSimpleName();
    private List<Users> mUser;
    private AppDatabase mAppDatabase;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

        mRecyclerView = view.findViewById(R.id.recycleview);

        mAppDatabase = Room.databaseBuilder(getContext(),AppDatabase.class,"production")
                .allowMainThreadQueries()
                .build();
        //Calling the display method onto the recycle view
      mUser =   mAppDatabase.mUserDao().getQueryDisplay();
      //setting the layoutManager for recycleView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //Creating the adapter
        final RecyclerView.Adapter adapter = new FamousRecycleAdapter(mUser);
        //Setting recycleView adapter
        mRecyclerView.setAdapter(adapter);

        swipeToDelete();
        adapter.notifyDataSetChanged();



        return view;

    }

    private void swipeToDelete()
    {
        final ItemTouchHelper helper = new ItemTouchHelper(
                new ItemTouchHelper.SimpleCallback(ItemTouchHelper.LEFT,ItemTouchHelper.RIGHT) {
                    @Override
                    public boolean onMove(@NonNull RecyclerView recyclerView,
                                          @NonNull RecyclerView.ViewHolder viewHolder,
                                          @NonNull RecyclerView.ViewHolder target) {

                        return false;
                    }

                    @Override
                    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

                        int position = viewHolder.getAdapterPosition();

                    int userDeleted =    mAppDatabase.mUserDao().deleteFamous(mUser.get(position));

                        Toast.makeText(getContext(),"Delete room position " + mUser.get(position).toString(), Toast.LENGTH_SHORT).show();
                    }

                });

        helper.attachToRecyclerView(mRecyclerView);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}