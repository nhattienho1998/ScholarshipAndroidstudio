package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>{

    private List<ArticleInfo> articleInfoList;

    public ArticleAdapter(List<ArticleInfo> articleInfoList) {
        this.articleInfoList = articleInfoList;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_article,parent,false);
        return new ArticleAdapter.ArticleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        ArticleInfo item = articleInfoList.get(position);
        holder.vCategory.setText(item.Category);
        holder.vTitle.setText(item.title);
        holder.vImageMain.setImageResource(item.image);
        holder.vShortDes.setText(item.shortDes);
    }

    @Override
    public int getItemCount() {
        return articleInfoList.size();
    }

    public static class ArticleViewHolder extends RecyclerView.ViewHolder{
        protected TextView vCategory;
        protected TextView vTitle;
        protected ImageView vImageMain;
        protected TextView vShortDes;

        public ArticleViewHolder(View itemView){
            super(itemView);
            vCategory = (TextView) itemView.findViewById(R.id.category);
            vTitle = (TextView) itemView.findViewById(R.id.titleArticle);
            vImageMain =(ImageView) itemView.findViewById(R.id.imageArticle);
            vShortDes = (TextView) itemView.findViewById(R.id.textShortDesArticle);
        }
    }
}
