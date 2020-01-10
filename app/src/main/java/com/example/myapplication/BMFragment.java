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
public class BMFragment extends Fragment {

    private ItemHomeAdapter itemHomeAdapter;

    public BMFragment( ) {
        List<ItemHomeInfo> itemHomeInfoList = new ArrayList<ItemHomeInfo>();
        itemHomeInfoList.add(new ItemHomeInfo( "BNSF Railway Company Scholarship",R.drawable.banner01,"This award is available for U.S. high school seniors who are members of the Future Farmers of America and are residents of California, Illinois, Iowa, Kansas, Minnesota, Montana, Nebraska, North Dakota, South Dakota and Texas. The student must be planning to enroll full time in one of the following areas of agriculture: business management, economics, finance, or sales and marketing."));
        itemHomeInfoList.add(new ItemHomeInfo("Bunge North America, Inc. Scholarship",R.drawable.banner03,"U.S. high school seniors and currently enrolled students pursuing a two- or four-year degree in select agriculture majors are eligible for this award. Students must be members of the FFA, have a grade point average of 2.5 or higher, and reside in one of the 48 contiguous United States."));
        itemHomeInfoList.add(new ItemHomeInfo("Church & Dwight Company Inc. Scholarship",R.drawable.banner001,"This award is available for U.S. members of the Future Farmers of America (FFA) who are pursuing a four-year degree in animal nutrition, animal or dairy science, agricultural business management, finance, sales and marketing, or agricultural engineering. Applicants must be enrolled or plan to enroll full time and have a grade point average of 3.0 or higher."));
        itemHomeInfoList.add(new ItemHomeInfo("Dean Carlson Honorary Scholarship",R.drawable.banner001,"This award is available for members of the Future Farmers of America (FFA) who are enrolled or planning to enroll at the College of Agriculture or the College of Business at Iowa State University. Preference is given to applicants from Lytton-Rockwell City FFA, Calhoun County FFA, or members of counties bordering Calhoun, Iowa."));
        itemHomeInfoList.add(new ItemHomeInfo( "BNSF Railway Company Scholarship",R.drawable.banner01,"This award is available for U.S. high school seniors who are members of the Future Farmers of America and are residents of California, Illinois, Iowa, Kansas, Minnesota, Montana, Nebraska, North Dakota, South Dakota and Texas. The student must be planning to enroll full time in one of the following areas of agriculture: business management, economics, finance, or sales and marketing."));
        itemHomeInfoList.add(new ItemHomeInfo("Bunge North America, Inc. Scholarship",R.drawable.banner03,"U.S. high school seniors and currently enrolled students pursuing a two- or four-year degree in select agriculture majors are eligible for this award. Students must be members of the FFA, have a grade point average of 2.5 or higher, and reside in one of the 48 contiguous United States."));
        itemHomeInfoList.add(new ItemHomeInfo("Church & Dwight Company Inc. Scholarship",R.drawable.banner001,"This award is available for U.S. members of the Future Farmers of America (FFA) who are pursuing a four-year degree in animal nutrition, animal or dairy science, agricultural business management, finance, sales and marketing, or agricultural engineering. Applicants must be enrolled or plan to enroll full time and have a grade point average of 3.0 or higher."));
        itemHomeInfoList.add(new ItemHomeInfo("Dean Carlson Honorary Scholarship",R.drawable.banner001,"This award is available for members of the Future Farmers of America (FFA) who are enrolled or planning to enroll at the College of Agriculture or the College of Business at Iowa State University. Preference is given to applicants from Lytton-Rockwell City FFA, Calhoun County FFA, or members of counties bordering Calhoun, Iowa."));

        itemHomeAdapter= new ItemHomeAdapter(itemHomeInfoList);
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.fragment_bm, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardListBM);
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
