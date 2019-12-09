package com.example.maps.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maps.Interface.IRecyclerItemClickListener;
import com.example.maps.R;

public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
   public TextView txt_user_email;
    IRecyclerItemClickListener iRecyclerItemClickListener;

    public void setiRecyclerItemClickListener(IRecyclerItemClickListener iRecyclerItemClickListener) {
        this.iRecyclerItemClickListener = iRecyclerItemClickListener;
    }

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_user_email = (TextView)itemView.findViewById(R.id.txt_user_email);
        itemView.setOnClickListener(this);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               iRecyclerItemClickListener.onItemClickListener(v,getAdapterPosition());
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
