package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_);

        //Create array numbers in words

        ArrayList<Word> NumWords = new ArrayList<Word>();

        NumWords.add(new Word("where are you going","minto wuksus"));
        NumWords.add(new Word("what is your name","tinga oyaase na"));
        NumWords.add(new Word("my name is","oyaaset"));
        NumWords.add(new Word("how are you feeling","michakses"));
        NumWords.add(new Word("i'm feeling good","kuchi achit"));
        NumWords.add(new Word("are you coming","eee' aa"));
        NumWords.add(new Word("yes, i'm comingr","hee'eenem"));
        NumWords.add(new Word("i'm coming","eenem"));
        NumWords.add(new Word("Lets go","yoowutis"));
        NumWords.add(new Word("come here","enni' nem"));




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
