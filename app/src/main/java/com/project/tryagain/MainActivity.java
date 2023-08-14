package com.project.tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        TextView welcomeText = findViewById(R.id.welcomeText);
        EditText nameInput = findViewById(R.id.nameInput);
        EditText weightInput = findViewById(R.id.weightInput);
        EditText ageInput = findViewById(R.id.ageInput);
        EditText daysInput = findViewById(R.id.daysInput);
        EditText goalWeightInput = findViewById(R.id.goalWeightInput);

        setContentView(R.layout.activity_main);
        Button openFoodListButton = findViewById(R.id.openFoodListButton);
        openFoodListButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FoodListActivity.class);
                startActivity(intent);
            }
        });
    }
}
