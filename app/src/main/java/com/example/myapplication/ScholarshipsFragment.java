package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScholarshipsFragment extends Fragment {
    TabLayout tabLayout;
    ItemHomeAdapter adapter;
    TabItem tabBM;
    TabItem tabIT;
    TabItem tabMedical;
    TabItem tabEdu;
    TabItem tabLaw;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    private List<ItemHomeInfo> listBM = new ArrayList<ItemHomeInfo>();
    private List<ItemHomeInfo> listIT = new ArrayList<ItemHomeInfo>();
    private List<ItemHomeInfo> listEdu = new ArrayList<ItemHomeInfo>();
    private List<ItemHomeInfo> listMedical = new ArrayList<ItemHomeInfo>();
    private List<ItemHomeInfo> listLaw = new ArrayList<ItemHomeInfo>();

    public ScholarshipsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_scholarships, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabBM = (TabItem) view.findViewById(R.id.tabBM);
        tabIT = (TabItem) view.findViewById(R.id.tabIT);
        tabEdu = (TabItem) view.findViewById(R.id.tabEdu);
        tabLaw = (TabItem) view.findViewById(R.id.tabLaw);
        tabMedical = (TabItem) view.findViewById(R.id.tabMedical);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        pageAdapter = new PageAdapter(getActivity().getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        // Inflate the layout for this fragment
        return view;
    }



}
