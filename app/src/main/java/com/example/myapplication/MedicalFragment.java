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
public class MedicalFragment extends Fragment {

    private ItemHomeAdapter itemHomeAdapter;
    public MedicalFragment() {
        List<ItemHomeInfo> itemHomeInfoList = new ArrayList<ItemHomeInfo>();
        itemHomeInfoList.add(new ItemHomeInfo("Arizona Nurses Foundation Academic Scholarship",R.drawable.banner03,"This award is available for students who are legal residents of the state of Arizona. Students must have been accepted to or currently be enrolled in an academic nursing education program based in Arizona."));
        itemHomeInfoList.add(new ItemHomeInfo("Hurst Review/AACN Scholarship",R.drawable.banner03,"This scholarship is open to international and U.S. prelicensure nursing students who are currently enrolled at an AACN member institution."));

        itemHomeInfoList.add(new ItemHomeInfo("Porter Physiology Development Fellowship",R.drawable.banner001,"This award is available for minority graduate students who are working toward a Ph. D. in physiology."));
        itemHomeInfoList.add(new ItemHomeInfo("Gustavus B. Capito Scholarship Fund",R.drawable.banner001,"This award is for U.S. students who are residents of West Virginia and are majoring in nursing at a college or university in West Virginia. The applicant must have a grade point average of 2.5 or higher and an ACT score of 20 or higher."));
        itemHomeAdapter= new ItemHomeAdapter(itemHomeInfoList);

        itemHomeAdapter.setOnItemClickListener(new ItemHomeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getActivity(), DetailScholarshipActivity.class);
                startActivity(intent);
            }
        });
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_medical, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardListMedical);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(itemHomeAdapter);
        // Inflate the layout for this fragment
        return view;
    }

}
