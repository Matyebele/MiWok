package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void  openNumbersList(View view)
    {
        Intent intent = new Intent(MainActivity.this,Numbers.class);
        startActivity(intent);
    }
    public  void openFamilyList(View view)
    {
        Intent intent = new Intent (MainActivity.this,Family.class);
        startActivity(intent);
    }
    public void openPhrasesList(View view)
    {
        Intent intent = new Intent(MainActivity.this,Phrases.class);
        startActivity(intent);
    }
    public void openColorList(View view)
    {
        Intent intent = new Intent(MainActivity.this,Colors.class);
        startActivity(intent);
    }
}
