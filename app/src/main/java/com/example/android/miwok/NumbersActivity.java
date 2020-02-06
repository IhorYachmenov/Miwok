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

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");
        numbers.add("ten");

        Log.v("NumbersActivity", "Numbers at index: " + numbers.get(0));

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int counter = 0;


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


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
