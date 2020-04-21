package com.example.grocerieslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class Checkout_page extends AppCompatActivity {
    ListView listView;
    TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_page);
        listView = findViewById(R.id.list_view);
        mTextview = findViewById(R.id.txt_total);
    }
}
