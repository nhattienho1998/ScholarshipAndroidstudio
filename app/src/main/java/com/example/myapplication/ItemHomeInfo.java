package com.example.myapplication;

public class ItemHomeInfo {
    protected String title;
    protected Integer image;
    protected String shortDes;

    public ItemHomeInfo(String txtTitle, Integer iImage, String des){
        this.title = txtTitle;
        this.image = iImage;
        this.shortDes = des;
    }

}
