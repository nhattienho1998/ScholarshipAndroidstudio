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
public class ArticlesFragment extends Fragment {


    public ArticlesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_articles, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardArticle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        final List<ArticleInfo> articleInfoList = new ArrayList<ArticleInfo>();
        articleInfoList.add(new ArticleInfo( "Scholarships","Medical School Scholarships That Will Help You Pay for College",R.drawable.banner01,"View the top Medical School Scholarships for pre-med and graduate students. Learn to pay for college without going into debt. Find out where you can go to medical school for free."));
        articleInfoList.add(new ArticleInfo("Financial Aid","Great Summer Gigs for Students",R.drawable.banner03,"Summer’s here and it’s time to start earning money! Here are 5 gigs for this Summer."));
        articleInfoList.add(new ArticleInfo("Internships, Jobs, and Careers","6 gigs that are perfect for students",R.drawable.banner001,"Making money while in school can be a challenge. These part-time jobs will fill your wallet without draining your time."));
        articleInfoList.add(new ArticleInfo("College Experience","10 Amazing Benefits of Studying Abroad",R.drawable.banner001,"For college students, studying abroad may be an eye-opening experience. Here is a comprehensive list of 10 benefits of studying abroad."));articleInfoList.add(new ArticleInfo( "Scholarships","Medical School Scholarships That Will Help You Pay for College",R.drawable.banner01,"View the top Medical School Scholarships for pre-med and graduate students. Learn to pay for college without going into debt. Find out where you can go to medical school for free."));
        articleInfoList.add(new ArticleInfo("Financial Aid","Great Summer Gigs for Students",R.drawable.banner03,"Summer’s here and it’s time to start earning money! Here are 5 gigs for this Summer."));
        articleInfoList.add(new ArticleInfo("Internships, Jobs, and Careers","6 gigs that are perfect for students",R.drawable.banner001,"Making money while in school can be a challenge. These part-time jobs will fill your wallet without draining your time."));
        articleInfoList.add(new ArticleInfo("College Experience","10 Amazing Benefits of Studying Abroad",R.drawable.banner001,"For college students, studying abroad may be an eye-opening experience. Here is a comprehensive list of 10 benefits of studying abroad."));

        ArticleAdapter articleAdapter = new ArticleAdapter(articleInfoList);
        recyclerView.setAdapter(articleAdapter);

        articleAdapter.setOnItemClickListener(new ArticleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getActivity(), DetailArticleActivity.class);
                startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
