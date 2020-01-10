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
public class LawFragment extends Fragment {

    private ItemHomeAdapter itemHomeAdapter;
    public LawFragment() {
        List<ItemHomeInfo> itemHomeInfoList = new ArrayList<ItemHomeInfo>();
        itemHomeInfoList.add(new ItemHomeInfo( "OUR SCHOLARSHIPS",R.drawable.banner01,"At Unigo, our primary goal is to help students find free money for college. That's why we provide a quality scholarship search service ... but did you know that we are also a scholarship provider? Each month, Unigo awards a scholarship to one student who can best answer a short essay prompt in 250 words or less. We think our scholarships are pretty fun (and easy, too!). So, put on your thinking cap and apply today!"));
        itemHomeInfoList.add(new ItemHomeInfo("abc",R.drawable.banner03,"abc"));
        itemHomeInfoList.add(new ItemHomeInfo("abc",R.drawable.banner001,"abc"));
        itemHomeInfoList.add(new ItemHomeInfo("abc",R.drawable.banner001,"abc"));
        itemHomeAdapter= new ItemHomeAdapter(itemHomeInfoList);
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_law, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardListLaw);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(itemHomeAdapter);
        // Inflate the layout for this fragment
        return view;
    }

}
