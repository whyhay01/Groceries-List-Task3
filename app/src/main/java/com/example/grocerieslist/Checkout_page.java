package com.example.grocerieslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Checkout_page extends AppCompatActivity {
    ListView listView;
    ListView listView_price;
    TextView mTextview;
    Button mButton;
    ArrayList<String> addItems = new ArrayList<String>();
    ArrayList<String> addPrice = new ArrayList<String>();
    ArrayList<Integer> arrayPrice = new ArrayList<Integer>();
    int display_total_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_page);
        listView = findViewById(R.id.list_view);
        mTextview = findViewById(R.id.txt_total);
        listView_price = findViewById(R.id.listview_price);
        mButton = findViewById(R.id.btn_share);

        addItems = getIntent().getExtras().getStringArrayList("items");
        addPrice = getIntent().getExtras().getStringArrayList("price");
        display_total_sum =getIntent().getExtras().getInt("totalPrice");

        String display_total_price = toString().valueOf(display_total_sum);
        mTextview.setText(display_total_price);

        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(Checkout_page.this,
                android.R.layout.simple_list_item_1,addItems);
       listView.setAdapter(arrayAdapter);

       ArrayAdapter<String> arrayAdapter_price = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,addPrice);
       listView_price.setAdapter(arrayAdapter_price);

       mButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intentShare = new Intent(Intent.ACTION_SEND);
               intentShare.setType("text/plain");
               String shareBody = "Groceries list items and price";
               intentShare.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
               intentShare.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
               startActivity(Intent.createChooser(intentShare, "Share via"));
           }
       });




    }

}
