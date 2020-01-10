package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>  {

    private List<String> notificationList;

    public NotificationAdapter(List<String> notificationList) {
        this.notificationList = notificationList;
    }

    @NonNull
    @Override
    public NotificationAdapter.NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_notification,parent,false);
        return new NotificationAdapter.NotificationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.NotificationViewHolder holder, int position) {
        String item = notificationList.get(position);
        holder.vNoti.setText(item);
    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }


    public static class NotificationViewHolder extends RecyclerView.ViewHolder{
        protected TextView vNoti;

        public NotificationViewHolder(View itemView){
            super(itemView);
            vNoti = (TextView) itemView.findViewById(R.id.textNoti);
        }
    }
}
