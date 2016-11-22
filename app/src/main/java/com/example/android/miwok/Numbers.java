package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_);

        //Create array numbers in words

        ArrayList <Word>  NumWords = new ArrayList<Word>();

        NumWords.add(new Word("One","lutti",R.drawable.number_one));
        NumWords.add(new Word("Two","otiiko",R.drawable.number_two));
        NumWords.add(new Word("Three","tolookosu",R.drawable.number_three));
        NumWords.add(new Word("Four","oyissa",R.drawable.number_four));
        NumWords.add(new Word("Five","massoka",R.drawable.number_five));
        NumWords.add(new Word("Six","temmoka",R.drawable.number_six));
        NumWords.add(new Word("Seven","kenekaku",R.drawable.number_seven));
        NumWords.add(new Word("Eight","kawinta",R.drawable.number_eight));
        NumWords.add(new Word("Nine","wo'e",R.drawable.number_nine));
        NumWords.add(new Word("Ten","na'aacha",R.drawable.number_ten));



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
