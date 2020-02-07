package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        int id = getResources().getIdentifier("ic_launcher", "mipmap", this.getPackageName());

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti", id));
        words.add(new Word("one", "lutti", id));
        words.add(new Word("two", "otiiko", id));
        words.add(new Word("three", "tolookosu", id));
        words.add(new Word("four", "oyyisa", id));
        words.add(new Word("five", "massokka", id));
        words.add(new Word("six", "temmokka", id));
        words.add(new Word("seven", "kenekaku", id));
        words.add(new Word("eight", "kawinta", id));
        words.add(new Word("nine", "wo’e", id));
        words.add(new Word("ten", "na’aacha", id));
        Log.v("NumbersActivity", "Numbers at index: " + words.get(0));

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //int counter = 0;


//        TextView displayWords = new TextView(this);
//        displayWords.setText(numbers.get(0));
//        rootView.addView(displayWords);

//        while (counter < numbers.size()) {
//
//            TextView displayWords = new TextView(this);
//            displayWords.setText(numbers.get(counter));
//            rootView.addView(displayWords);
//            counter++;
//        }

//        for (int index = 0; index < numbers.size(); index++) {
//            TextView displayWords = new TextView(this);
//            displayWords.setText(numbers.get(index));
//            rootView.addView(displayWords);
//        }


      // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
