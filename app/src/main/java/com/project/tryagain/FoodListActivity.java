package com.project.tryagain;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodListActivity extends AppCompatActivity {

    private ListView foodListView;
    private TextView totalCaloriesTextView;
    private EditText consumedFoodEditText;
    private Button calculateButton;

    private String[] foods = {
            "Apple (52 calories)",
            "Banana (96 calories)",
            "Orange (62 calories)",
            "Grapes (69 calories)",
            "Strawberry (4 calories)",
            "Carrot (41 calories)",
            "Apple (52 calories)",
            "Banana (96 calories)",
            "Orange (62 calories)",
            "Grapes (69 calories)",
            "Strawberry (4 calories)",
            "Carrot (41 calories)",
            "Broccoli (55 calories)",
            "Chicken Breast (165 calories)",
            "Salmon (206 calories)",
            "Brown Rice (215 calories)",
            "Quinoa (222 calories)",
            "Egg (68 calories)",
            "Whole Wheat Bread (79 calories)",
            "Spinach (7 calories)",
            "Greek Yogurt (59 calories)",
            "Almonds (7 calories per almond)",
            "Oatmeal (150 calories)",
            "Blueberries (84 calories)",
            "Avocado (234 calories)",
            "Cucumber (8 calories)",
            "Tomato (5 calories)",
            "Cheese (113 calories per slice)",
            "Peanut Butter (94 calories per tablespoon)",
            "Black Beans (114 calories)",
            "Tuna (179 calories)",
            "Cottage Cheese (206 calories)",
            "Hummus (27 calories per tablespoon)",
            "Turkey (135 calories per 3 oz)",
            "Sweet Potato (112 calories)",
            "Green Beans (31 calories per cup)",
            "Mango (60 calories)",
            "Pineapple (50 calories)",
            "Watermelon (30 calories per cup)",
            "Lentils (230 calories per cup)",
            "Bell Pepper (30 calories)",
            "Cauliflower (25 calories per cup)",
            "Chia Seeds (58 calories per tablespoon)",
            "Pomegranate (83 calories)",
            "Walnuts (183 calories per 1/4 cup)",
            "Cabbage (22 calories per cup)",
            "Kiwi (41 calories)",
            "Eggplant (20 calories per cup)",
            "Brownie (approximately 180 calories)",
            "Pasta (200 calories per cup)",
            "Steak (250 calories per 4 oz)",
            "Pork Chops (193 calories per 4 oz)",
            "Pasta Salad (250 calories per cup)",
            "Popcorn (30 calories per cup)",
            "Chocolate Bar (around 200 calories)",
            "Peanuts (166 calories per 1/4 cup)"
    };

    private int totalCalories = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        foodListView = findViewById(R.id.foodListView);
        consumedFoodEditText = findViewById(R.id.consumedFoodEditText);
        calculateButton = findViewById(R.id.calculateButton);
        totalCaloriesTextView = findViewById(R.id.totalCaloriesTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foods);
        foodListView.setAdapter(adapter);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTotalCalories();
            }
        });
    }

    private void calculateTotalCalories() {
        String consumedFood = consumedFoodEditText.getText().toString();
        for (String food : foods) {
            if (consumedFood.contains(food)) {
                int calories = getCaloriesFromFood(food);
                totalCalories += calories;
            }
        }
        totalCaloriesTextView.setText("Total Calories: " + totalCalories);
    }

    private int getCaloriesFromFood(String food) {
        String[] parts = food.split(" ");
        return Integer.parseInt(parts[parts.length - 2]);
    }
}
