package com.example.android.miwok;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Code Tribe on 2016/11/18.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word>NumWords){
        super(context,0,NumWords);
    }
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        //check if the existing view is being resused, otherwise inflate the view
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwoktextview = (TextView) ListItemView.findViewById(R.id.miwok_text_view);

        miwoktextview.setText(currentWord.getMitranslation());

        TextView Defaulttextview = (TextView) ListItemView.findViewById(R.id.Default_text_view);

        Defaulttextview.setText(currentWord.getDetranslation());

        ImageView imageView = (ImageView)ListItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getmImageResId());
        return ListItemView;


    }
}