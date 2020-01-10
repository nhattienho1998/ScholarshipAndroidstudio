package com.example.myapplication;

public class ArticleInfo {

    protected String Category;
    protected String title;
    protected Integer image;
    protected String shortDes;

    public ArticleInfo(String txtCategory,String txtTitle, Integer iImage, String des){
        this.Category = txtCategory;
        this.title = txtTitle;
        this.image = iImage;
        this.shortDes = des;
    }
}
