package com.example.myapplication;


import android.content.Intent;
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
public class HomeFragment extends Fragment {



    public HomeFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<ItemHomeInfo> itemHomeInfoList = new ArrayList<ItemHomeInfo>();
        itemHomeInfoList.add(new ItemHomeInfo( "I HAVE A DREAM SCHOLARSHIP",R.drawable.banner01,"It's crazy to think of all the amazing stories that happen as soon as we close our eyes and drift to sleep. It could be in a deep slumber or perhaps in a carefree daze, but our dreams can help shape our ideas, perceptions, and - now - education."));
        itemHomeInfoList.add(new ItemHomeInfo("SWEET AND SIMPLE SCHOLARSHIP",R.drawable.banner03,"And now, those simple gifts can really pay off in our Sweet and Simple Scholarship 2015! Think back to a time when you received a special gift that seemed so unassuming yet made such a strong impact in your life. Was it a present you could open in a box or a humble gesture from a stranger?"));
        itemHomeInfoList.add(new ItemHomeInfo("SUPERPOWER SCHOLARSHIP",R.drawable.banner001,"Have you ever wondered where you'd go if you could fly around downtown? Or maybe you daydream of secretly taking over the world - to each his own. For all of those hero lovers and villain enthusiasts, this super scholarship can give you the power to win free college money."));
        itemHomeInfoList.add(new ItemHomeInfo("ALL ABOUT EDUCATION SCHOLARSHIP",R.drawable.banner001,"It's often been said that \"education is the key to success.\" What doors could your educational \"key\" open? It's not cheap to get a college degree, and many college-bound students see a shut door for education. We're here to help open it again."));
        ItemHomeAdapter itemHomeAdapter = new ItemHomeAdapter(itemHomeInfoList);
        recyclerView.setAdapter(itemHomeAdapter);

        itemHomeAdapter.setOnItemClickListener(new ItemHomeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getActivity(), DetailScholarshipActivity.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }




}
