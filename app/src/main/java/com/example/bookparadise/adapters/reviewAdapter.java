package com.example.bookparadise.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.bookparadise.R;
import com.example.bookparadise.ReviewActivity;
import com.example.bookparadise.models.Review;

import java.util.ArrayList;

public class reviewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Review> listReview = new ArrayList<>();


    public reviewAdapter(Context context, ArrayList<Review> listReview){
        this.context=context;
        this.listReview=listReview;
    }


    @Override
    public int getCount() {
        return listReview.size();
    }

    @Override
    public Object getItem(int i) {
        return listReview.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listReview.get(i).getIdReview();
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
         view = LayoutInflater.from(context).inflate(R.layout.review_row, viewGroup, false);

        TextView re_title = view.findViewById(R.id.re_title);
        TextView re_desc = view.findViewById(R.id.re_desc);

        re_desc.setText(listReview.get(i).getDescription());
        re_title.setText(listReview.get(i).getTitle());

        Button re_deleteButton = view.findViewById(R.id.re_deleteButton);
        re_deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int position = i;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Are you sure?");

                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        listReview.remove(position);
                        notifyDataSetChanged();
                    }
                });

                builder.setNegativeButton("Cancel",  new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        return view;
    }
}
