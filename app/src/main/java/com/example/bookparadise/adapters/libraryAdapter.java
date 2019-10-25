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
import com.example.bookparadise.models.Library;

import java.util.ArrayList;

public class libraryAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Library> listLibrary = new ArrayList<>();

    public libraryAdapter(Context context, ArrayList<Library> listLibrary){
        this.context=context;
        this.listLibrary=listLibrary;
    }

    @Override
    public int getCount() {
        return listLibrary.size();
    }

    @Override
    public Object getItem(int i) {
        return listLibrary.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listLibrary.get(i).getId();
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.library_row, viewGroup, false);

        TextView li_name = view.findViewById(R.id.li_name);
        TextView li_address = view.findViewById(R.id.li_address);

        li_name.setText(listLibrary.get(i).getLi_name());
        li_address.setText(listLibrary.get(i).getLi_address());

        return view;
    }
}
