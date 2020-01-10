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
public class ArticlesFragment extends Fragment {


    public ArticlesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_articles, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardArticle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<ArticleInfo> articleInfoList = new ArrayList<ArticleInfo>();
        articleInfoList.add(new ArticleInfo( "abc","abc",R.drawable.banner01,"At Unigo, our primary goal is to help students find free money for college. That's why we provide a quality scholarship search service ... but did you know that we are also a scholarship provider? Each month, Unigo awards a scholarship to one student who can best answer a short essay prompt in 250 words or less. We think our scholarships are pretty fun (and easy, too!). So, put on your thinking cap and apply today!"));
        articleInfoList.add(new ArticleInfo("abc","abc",R.drawable.banner03,"abc"));
        articleInfoList.add(new ArticleInfo("abc","abc",R.drawable.banner001,"abc"));
        articleInfoList.add(new ArticleInfo("abc","abc",R.drawable.banner001,"abc"));
        ArticleAdapter articleAdapter = new ArticleAdapter(articleInfoList);
        recyclerView.setAdapter(articleAdapter);
        // Inflate the layout for this fragment
        return view;
    }

}
