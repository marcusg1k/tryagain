package com.project.tryagain;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodListActivity extends AppCompatActivity {

    private final String[] foodlist = {
            "Apple (52 calories)",
            "Banana (96 calories)",
            "Orange (62 calories)",
            "Grapes (69 calories)",
            "Strawberry (4 calories)",
            "Carrot (41 calories)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);

        ListView foodListView = findViewById(R.id.foodListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getFoodlist());
        foodListView.setAdapter(adapter);
    }

    public String[] getFoodlist() {
        return foodlist;
    }
}
