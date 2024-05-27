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
    private TextView totalCaloriesTextView; // Total calories
    private EditText consumedFoodEditText;
    private Button calculateButton;

    private String[] foods = {
        "Apple (52 calories)",
        "Banana (89 calories)",
        "Orange (47 calories)",
        "Strawberry (32 calories)",
        "Grapes (69 calories)",
        "Watermelon (30 calories)",
        "Pineapple (50 calories)",
        "Blueberry (57 calories)",
        "Raspberry (52 calories)",
        "Blackberry (43 calories)",
        "Mango (60 calories)",
        "Peach (39 calories)",
        "Plum (46 calories)",
        "Kiwi (41 calories)",
        "Pomegranate (83 calories)",
        "Pear (57 calories)",
        "Cherry (50 calories)",
        "Cantaloupe (34 calories)",
        "Grapefruit (42 calories)",
        "Lemon (29 calories)",
        "Lime (30 calories)",
        "Avocado (160 calories)",
        "Tomato (18 calories)",
        "Cucumber (16 calories)",
        "Bell Pepper (31 calories)",
        "Carrot (41 calories)",
        "Broccoli (55 calories)",
        "Cauliflower (25 calories)",
        "Spinach (23 calories)",
        "Lettuce (15 calories)",
        "Kale (49 calories)",
        "Zucchini (17 calories)",
        "Eggplant (25 calories)",
        "Sweet Potato (86 calories)",
        "Potato (77 calories)",
        "Onion (40 calories)",
        "Garlic (149 calories)",
        "Peas (81 calories)",
        "Green Beans (31 calories)",
        "Corn (86 calories)",
        "Mushroom (22 calories)",
        "Celery (16 calories)",
        "Brussels Sprout (43 calories)",
        "Cabbage (25 calories)",
        "Asparagus (20 calories)",
        "Beet (43 calories)",
        "Pumpkin (26 calories)",
        "Radish (16 calories)",
        "Artichoke (47 calories)",
        "Leek (31 calories)",
        "Turnip (28 calories)",
        "Parsnip (75 calories)",
        "Squash (26 calories)",
        "Chicken Breast (165 calories)",
        "Chicken Thigh (209 calories)",
        "Turkey (104 calories)",
        "Beef (250 calories)",
        "Pork (242 calories)",
        "Lamb (294 calories)",
        "Salmon (208 calories)",
        "Tuna (132 calories)",
        "Shrimp (99 calories)",
        "Crab (87 calories)",
        "Lobster (77 calories)",
        "Egg (68 calories)",
        "Milk (42 calories per 100ml)",
        "Cheese (402 calories)",
        "Yogurt (59 calories)",
        "Butter (717 calories)",
        "Bread (265 calories)",
        "Rice (130 calories)",
        "Pasta (131 calories)",
        "Quinoa (120 calories)",
        "Oatmeal (68 calories)",
        "Cereal (379 calories)",
        "Almond (579 calories)",
        "Peanut (567 calories)",
        "Walnut (654 calories)",
        "Cashew (553 calories)",
        "Peanut Butter (588 calories)",
        "Honey (304 calories)",
        "Sugar (387 calories)",
        "Olive Oil (884 calories)",
        "Vegetable Oil (884 calories)",
        "Coconut Oil (862 calories)",
        "Salt (0 calories)",
        "Pepper (255 calories)",
        "Basil (22 calories)",
        "Oregano (265 calories)",
        "Parsley (36 calories)",
        "Cinnamon (247 calories)",
        "Cumin (375 calories)",
        "Chili Powder (282 calories)",
        "Paprika (282 calories)",
        "Turmeric (312 calories)",
        "Ginger (80 calories)",
        "Soy Sauce (53 calories)",
        "Ketchup (112 calories)",
        "Mustard (66 calories)",
        "Mayonnaise (680 calories)",
        "Vinegar (18 calories)",
        "Coffee (0 calories)",
        "Tea (1 calorie)",
        "Orange Juice (45 calories per 100ml)",
        "Apple Juice (46 calories per 100ml)",
        "Soda (39 calories per 100ml)",
        "Water (0 calories)"
    };
    

    private int totalCalories = 0; // shown output

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
        String[] parts = food.split("");
        return Integer.parseInt(parts[parts.length - 2]);
    }
}
