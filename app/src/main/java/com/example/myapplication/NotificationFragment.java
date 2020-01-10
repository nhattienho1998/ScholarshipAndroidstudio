package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {


    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardNotification);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<String> notificationList = new ArrayList<String>();

        notificationList.add("Complete the Scholarship Match");
        notificationList.add("Unigo's Countdown to Christmas: Day 11 of the 12 Days of Scholarships");
        notificationList.add("Unigo's Countdown to Christmas: Day 9 of the 12 Days of Scholarships");
        notificationList.add("Unigo's Countdown to Christmas: Day 5 of the 12 Days of Scholarships");
        notificationList.add("Complete the Scholarship Match");
        notificationList.add("Unigo's Countdown to Christmas: Day 11 of the 12 Days of Scholarships");
        notificationList.add("Unigo's Countdown to Christmas: Day 9 of the 12 Days of Scholarships");
        notificationList.add("Unigo's Countdown to Christmas: Day 5 of the 12 Days of Scholarships");
        notificationList.add("Complete the Scholarship Match");
        notificationList.add("Unigo's Countdown to Christmas: Day 11 of the 12 Days of Scholarships");
        notificationList.add("Unigo's Countdown to Christmas: Day 9 of the 12 Days of Scholarships");
        notificationList.add("Unigo's Countdown to Christmas: Day 5 of the 12 Days of Scholarships");

        NotificationAdapter notificationAdapter = new NotificationAdapter(notificationList);
        recyclerView.setAdapter(notificationAdapter);
        // Inflate the layout for this fragment
        return view;
    }

}
