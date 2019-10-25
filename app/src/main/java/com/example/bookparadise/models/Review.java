package com.example.bookparadise.models;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.bookparadise.ReviewActivity;

import java.util.ArrayList;

public class Review {


    int idReview, libraryId;
    private String memberId, title, description;

    public Review (int idReview,String memberId, int libraryId, String title , String description){
        this.idReview=idReview;
        this.title=title;
        this.description=description;
        this.memberId=memberId;
        this.libraryId=libraryId;
    }



    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
