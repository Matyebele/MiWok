package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_);

        //Create array numbers in words

        ArrayList<Word> NumWords = new ArrayList<Word>();

        NumWords.add(new Word("Red","wetetti",R.drawable.color_red));
        NumWords.add(new Word("mustard yellow","chiwiita",R.drawable.color_mustard_yellow));
        NumWords.add(new Word("dusty yellow","topiisa",R.drawable.color_dusty_yellow));
        NumWords.add(new Word("green","chokokki",R.drawable.color_green));
        NumWords.add(new Word("brown","takaakki",R.drawable.color_brown));
        NumWords.add(new Word("gray","topoppi",R.drawable.color_gray));
        NumWords.add(new Word("black","kululli",R.drawable.color_black));
        NumWords.add(new Word("white","kelelli",R.drawable.color_white));




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
