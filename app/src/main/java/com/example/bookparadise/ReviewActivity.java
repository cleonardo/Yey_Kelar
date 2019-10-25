package com.example.bookparadise;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bookparadise.adapters.reviewAdapter;
import com.example.bookparadise.models.Review;
import com.example.bookparadise.models.User;

import java.util.ArrayList;

public class ReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(new Review(1,"MB001",1, "Good","This library have a complete series of books"));
        reviews.add(new Review(2,"MB002",2,"Best Library","Best Library ever"));

        ListView listReview = findViewById(R.id.listReview);
        ListAdapter reviewAdapter = new reviewAdapter(this,reviews);

        listReview.setAdapter(reviewAdapter);

    }


}
