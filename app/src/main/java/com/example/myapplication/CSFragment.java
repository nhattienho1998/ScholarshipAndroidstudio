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
public class CSFragment extends Fragment {


    public CSFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cs, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardListCS);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<ItemHomeInfo> itemHomeInfoList = new ArrayList<ItemHomeInfo>();
        itemHomeInfoList.add(new ItemHomeInfo( "Louis Hall Memorial Scholarship",R.drawable.banner01,"This scholarship is available for high school seniors in Hillsborough County Florida who are planning to major in computer science or information systems. Applicants must have a grade point average of 2.5 or higher."));
        itemHomeInfoList.add(new ItemHomeInfo("Rabo AgriFinance Scholarship",R.drawable.banner03,"This scholarship is open to U.S. high school seniors who are members of Future Farmers of America and pursuing a two- or four-year degree in select areas of agriculture, communications, education, management, sales, science, and technology. Students must live on a family farm, have a grade point average of 3.0 or higher, and rank in the top 50 percent of his/her class."));
        itemHomeInfoList.add(new ItemHomeInfo("AIAA Foundation Undergraduate Scholarship Program",R.drawable.banner001,"This scholarship is available for undergraduate students who have completed at least one year of study with a grade point average of 3.3 or higher. Students must plan to enter into some field of science or engineering encompassed by the technical activities of AIAA."));

        itemHomeInfoList.add(new ItemHomeInfo("AIAA Foundation Graduate Scholarship Program",R.drawable.banner001,"This award is for U.S. and international graduate students studying at a U.S. institution. Applicants must be active members of AIAA, have a 3.3 grade point average, and be conducting research in a subject area relevant to the technical activities of AIAA."));
        itemHomeInfoList.add(new ItemHomeInfo("Castle & Cooke Mililani Technology Park Scholarship Fund",R.drawable.banner03,"This scholarship is available for Hawaii high school seniors who are attending Leilehua High School, Mililani High School, or Waialua High School and have a grade point average of 2.7 or higher. Preference will be given to students who are planning to major in a high technology field such as science or engineering."));
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
