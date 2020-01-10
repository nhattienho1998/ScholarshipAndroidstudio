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
public class LawFragment extends Fragment {

    private ItemHomeAdapter itemHomeAdapter;
    public LawFragment() {
        List<ItemHomeInfo> itemHomeInfoList = new ArrayList<ItemHomeInfo>();
        itemHomeInfoList.add(new ItemHomeInfo("Northern California Asian Peace Officer's Association Scholarship",R.drawable.banner03,"This award is offered to full-time students planning to major in law enforcement or a related field. Students must have a grade point average of 2.0 or higher to apply, and do not have to be of Asian descent."));
        itemHomeInfoList.add(new ItemHomeInfo("Bowles, McDavid, Graff and Love Scholarship Fund",R.drawable.banner03,"his award is for a first-year law school student who is a resident of West Virginia and attending West Virginia University. The applicant must have a 2.5 grade point average or higher to be eligible."));

        itemHomeInfoList.add(new ItemHomeInfo("Bernice Pickens Parsons Scholarship Fund",R.drawable.banner001,"This award is for a U.S. student from West Virginia who is pursuing education or training in the fields of library science, nursing, or para-professional training in the legal field. The applicant must have a grade point average of 2.5 or higher and an ACT score of 20 or higher to be eligible."));
        itemHomeInfoList.add(new ItemHomeInfo("Madeline B. McCrum Scholarship Fund",R.drawable.banner001,"This award is for U.S. students from West Virginia who are enrolled in or accepted to West Virginia University's College of Law. The applicant must have a grade point average of 2.5 or higher and an ACT score of 20 or higher to be eligible."));
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
