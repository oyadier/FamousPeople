package com.oyatech.roomfamouspeople;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;


import java.util.List;

public class FamousRecycleAdapter extends RecyclerView.Adapter<FamousRecycleAdapter.FamousViewHolder> {
    List<String> users ;

    public FamousRecycleAdapter(List<String> pUsers) {
        users = pUsers;
    }

    @NonNull
    @Override
    public FamousRecycleAdapter.FamousViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.users,parent,false);

        return new FamousViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FamousRecycleAdapter.FamousViewHolder holder, int position) {
        holder.firstName.setText(users.get(position));

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class FamousViewHolder extends ViewHolder {
    public     TextView firstName,secondName,email;
        public FamousViewHolder(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.listText);
        }
    }
}
