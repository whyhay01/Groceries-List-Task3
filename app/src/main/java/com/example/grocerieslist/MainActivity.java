package com.example.grocerieslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private EditText mEdtTxt_item1;
    private EditText mEdtTxt_item2;
    private EditText mEdtTxt_item3;
    private EditText mEdtTxt_item4;
    private EditText mEdtTxt_item5;
    private EditText mEdtTxt_item6;
    private EditText mEdtTxt_item7;
    private EditText mEdtTxt_item8;
    private EditText mEdtTxt_price1;
    private EditText mEdtTxt_price2;
    private EditText mEdtTxt_price3;
    private EditText mEdtTxt_price4;
    private EditText mEdtTxt_price5;
    private EditText mEdtTxt_price6;
    private EditText mEdtTxt_price7;
    private EditText mEdtTxt_price8;
    private Button mButton_checkout;
    ArrayList<String> items_array = new ArrayList<String>();
    ArrayList<String> price_array_string = new ArrayList<String>();
    ArrayList<Integer> price_array_int = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtTxt_item1 = findViewById(R.id.edt_txt_item1);
        mEdtTxt_item2 = findViewById(R.id.edt_txt_item2);
        mEdtTxt_item3 =findViewById(R.id.edt_txt_item3);
        mEdtTxt_item4 = findViewById(R.id.edt_txt_item4);
        mEdtTxt_item5 = findViewById(R.id.edt_txt_item5);
        mEdtTxt_item6 = findViewById(R.id.edt_txt_item6);
        mEdtTxt_item7 =findViewById(R.id.edt_txt_item7);
        mEdtTxt_item8 = findViewById(R.id.edt_txt_item8);
        mEdtTxt_price1 = findViewById(R.id.edt_txt_price1);
        mEdtTxt_price2 = findViewById(R.id.edt_txt_price2);
        mEdtTxt_price3 = findViewById(R.id.edt_txt_price3);
        mEdtTxt_price4 = findViewById(R.id.edt_txt_price4);
        mEdtTxt_price5 = findViewById(R.id.edt_txt_price5);
        mEdtTxt_price6 = findViewById(R.id.edt_txt_price6);
        mEdtTxt_price7 = findViewById(R.id.edt_txt_price7);
        mEdtTxt_price8 = findViewById(R.id.edt_txt_price8);
        mButton_checkout = findViewById(R.id.btn_checkout);

        mButton_checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getItem1 = mEdtTxt_item1.getText().toString();
                items_array.add(getItem1);
                String getItem2 = mEdtTxt_item2.getText().toString();
                items_array.add(getItem2);
                String getItem3 = mEdtTxt_item3.getText().toString();
                items_array.add(getItem3);
                String getItem4 = mEdtTxt_item4.getText().toString();
                items_array.add(getItem4);
                String getItem5 = mEdtTxt_item5.getText().toString();
                items_array.add(getItem5);
                String getItem6 = mEdtTxt_item6.getText().toString();
                items_array.add(getItem6);
                String getItem7 = mEdtTxt_item7.getText().toString();
                items_array.add(getItem7);
                String getItem8 = mEdtTxt_item8.getText().toString();
                items_array.add(getItem8);

                String getPrice1 = mEdtTxt_price1.getText().toString();
                price_array_string.add(getPrice1);
                //int priceInt = Integer.parseInt(getPrice1);
                //price_array_int.add(priceInt);

                String getPrice2 = mEdtTxt_price2.getText().toString();
                price_array_string.add(getPrice2);
                //int priceInt2 = Integer.parseInt(getPrice2);
                //price_array_int.add(priceInt2);

                String getPrice3 = mEdtTxt_price3.getText().toString();
                price_array_string.add(getPrice3);
                //int priceInt3 = Integer.parseInt(getPrice3);
                //price_array_int.add(priceInt3);

                String getPrice4 = mEdtTxt_price4.getText().toString();
                price_array_string.add(getPrice4);
                //int priceInt4 = Integer.parseInt(getPrice4);
                //price_array_int.add(priceInt4);

                String getPrice5 = mEdtTxt_price5.getText().toString();
                price_array_string.add(getPrice5);
                //int priceInt5 = Integer.parseInt(getPrice5);
                //price_array_int.add(priceInt5);

                String getPrice6 = mEdtTxt_price6.getText().toString();
                price_array_string.add(getPrice6);
                //int priceInt6 = Integer.parseInt(getPrice6);
                //price_array_int.add(priceInt6);

                String getPrice7 = mEdtTxt_price7.getText().toString();
                price_array_string.add(getPrice7);
                //int priceInt7 = Integer.parseInt(getPrice7);
                //price_array_int.add(priceInt7);

                String getPrice8 = mEdtTxt_price8.getText().toString();
                price_array_string.add(getPrice8);
               // int priceInt8 = Integer.parseInt(getPrice8);
                //price_array_int.add(priceInt8);

                if (getItem1.trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Item Input Field is Empty", Toast.LENGTH_SHORT).show();
                }
                    else if (getPrice1.trim().equals("")){
                        Toast.makeText(MainActivity.this, "Price Input Field is Empty", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent checkoutIntent = new Intent(MainActivity.this, Checkout_page.class);
                    startActivity(checkoutIntent);
                }

            }
        });

    }
}