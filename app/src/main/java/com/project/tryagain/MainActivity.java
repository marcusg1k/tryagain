package com.project.tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_main);

            getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.badge));

            TextView welcomeText = findViewById(R.id.welcomeText);
            EditText nameInput = findViewById(R.id.nameInput);
            EditText weightInput = findViewById(R.id.weightInput);
            EditText daysInput = findViewById(R.id.daysInput);
            EditText goalWeightInput = findViewById(R.id.goalWeightInput);

            Button openFoodListButton = findViewById(R.id.openFoodListButton);
            openFoodListButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    try {
                        Intent intent = new Intent(MainActivity.this, FoodListActivity.class);
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Error opening Food List", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } catch (Exception e) {
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
        }
    }
}


