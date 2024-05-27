package com.example.se161047_lab04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

    public class FoodScreen extends AppCompatActivity {
        private static final int MY_REQUEST_CODE = 1;
        ListView foodList;
        ArrayList<Food> arrayFood;

        FoodAdapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_food_screen);

            mapping();
            adapter = new FoodAdapter(this, R.layout.activity_food_layout, arrayFood);
            foodList.setAdapter(adapter);
            foodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   Food selectedFood = arrayFood.get(position);
                   Intent resultIntent = new Intent();
                   resultIntent.putExtra("nameFood", selectedFood.getFoodName());
                   setResult(RESULT_OK, resultIntent);
                   finish();
               }
           });


        }

//        private void nextActivity(String foodName) {
//        Intent intent = new Intent(this, OrderFoodAndDrink.class);
//        Intent resultIntent = new Intent();
//        intent.putExtra("nameFood", foodName);
//        setResult(RESULT_OK, resultIntent);
//        finish();
//        startActivityForResult(intent, MY_REQUEST_CODE);
//    }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == MY_REQUEST_CODE && resultCode == RESULT_OK) {

            }
        }

        private void mapping() {
            foodList = findViewById(R.id.foodLv);
            arrayFood= new ArrayList<>();

            arrayFood.add(new Food("Bun bo hue", "Apple is protect your health", R.drawable.bbh));
            arrayFood.add(new Food("Com tam", "Apple is protect your health", R.drawable.ct));
            arrayFood.add(new Food("Pho", "Apple is protect your health", R.drawable.p));
            arrayFood.add(new Food("Hu tieu kho", "Apple is protect your health", R.drawable.htk));

        }
    }