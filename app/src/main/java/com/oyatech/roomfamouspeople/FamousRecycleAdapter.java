package com.oyatech.roomfamouspeople;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;


import com.oyatech.roomfamouspeople.dataroom.Users;

import java.util.List;

public class FamousRecycleAdapter extends RecyclerView.Adapter<FamousRecycleAdapter.FamousViewHolder> {
    List<Users> users ;

    public FamousRecycleAdapter(List<Users> pUsers) {
        users = pUsers;
    }

    @NonNull
    @Override
    public FamousRecycleAdapter.FamousViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.users,parent,false);

        return new FamousViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FamousRecycleAdapter.FamousViewHolder holder, int position) {
        holder.firstName.setText(users.get(position).getFirstName());
        holder.secondName.setText(users.get(position).getSecondName());
        holder.email.setText(users.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class FamousViewHolder extends ViewHolder {
    public     TextView firstName,secondName,email;
        public FamousViewHolder(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.firstName);
            secondName = itemView.findViewById(R.id.lastName);
            email = itemView.findViewById(R.id.email);
        }
    }
}
