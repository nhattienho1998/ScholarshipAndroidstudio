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
public class EduFragment extends Fragment {

    private ItemHomeAdapter itemHomeAdapter;
    public EduFragment() {
        List<ItemHomeInfo> itemHomeInfoList = new ArrayList<ItemHomeInfo>();
        itemHomeInfoList.add(new ItemHomeInfo("Harold Davis Memorial Scholarship",R.drawable.banner03,"This award is available for current high school seniors who are members of the Future Farmers of America. Applicants must have a livestock background in swine, beef, or dairy and intend to pursue a two- or four-year degree in animal science (livestock or dairy), agricultural education, or agribusiness."));
        itemHomeInfoList.add(new ItemHomeInfo("Billy Turney Foundation HCC Scholarship",R.drawable.banner03,"The Billy Turney Foundation HCC Scholarship is available for high school seniors in Hillsborough County, Florida who plan to attend Hillsborough Community College. Applicants must demonstrate academic merit and additional preference will be given to students who are working while in school and students who have participated in significant amounts of community service."));
        itemHomeInfoList.add(new ItemHomeInfo("Vittoria Periord Memorial HCC Scholarship",R.drawable.banner03,"This scholarship is available for high school seniors in Hillsborough County who have a grade point average of 2.5 or higher. Applicants must plan to major in writing, archeology, or music at Hillsborough Community College."));
        itemHomeInfoList.add(new ItemHomeInfo("Harry Danielson, Ed.D. Memorial Scholarship",R.drawable.banner03,"This scholarship is available for high school seniors in Pinellas County, Florida who plan to major in education, human relations, or counseling. Applicants must have a grade point average of 3.0 or higher."));
        itemHomeInfoList.add(new ItemHomeInfo("Herman And Mary Allen Scholarship",R.drawable.banner03,"This scholarship is available for African American high school seniors in Pinellas County Florida who plan to major in education. Applicants must have a grade point average of 3.0 or higher and an ACT score of 20 or higher, or an SAT math and verbal score of 1000 or higher."));

        itemHomeAdapter= new ItemHomeAdapter(itemHomeInfoList);
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edu, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardListEdu);
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
