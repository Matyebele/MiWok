package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_);

        //Create array numbers in words

        ArrayList<Word> NumWords = new ArrayList<Word>();

        NumWords.add(new Word("father","epe",R.drawable.family_father));
        NumWords.add(new Word("mother","eta",R.drawable.family_mother));
        NumWords.add(new Word("son","angsi",R.drawable.family_son));
        NumWords.add(new Word("daughter","tune",R.drawable.family_daughter));
        NumWords.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        NumWords.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        NumWords.add(new Word("older sister","tete",R.drawable.family_older_sister));
        NumWords.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        NumWords.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        NumWords.add(new Word("grandfather","paapa",R.drawable.family_grandfather));




//        //Create an index to increment variables
//         for ( int index = 0;index<NumWords.size(); index++)
//
//       {
//            // Create  a text view to display the string variables
//            TextView viewWord = new TextView(this);
//            viewWord.setText(NumWords.get(index));
//            rootView.addView(viewWord);
//
//
//        }


        WordAdapter adapter = new WordAdapter(this,  NumWords);

        ListView Listview = (ListView)findViewById(R.id.rootView);
        Listview.setAdapter(adapter);

    }

}
