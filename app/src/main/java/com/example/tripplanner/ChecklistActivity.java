package com.example.tripplanner;

// ChecklistActivity.java
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ChecklistActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ChecklistAdapter adapter;
    private List<String> checklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String tripType = getIntent().getStringExtra("tripType");
        checklist = getChecklistForTripType(tripType);

        adapter = new ChecklistAdapter(checklist);
        recyclerView.setAdapter(adapter);
    }

    private List<String> getChecklistForTripType(String tripType) {
        List<String> checklist = new ArrayList<>();
        switch (tripType) {
            case "Beach":
                checklist.add("Sunscreen");
                checklist.add("Swimsuit");
                checklist.add("Towel");
                checklist.add("Sunglasses");
                checklist.add("Umbrella");
                checklist.add("Lunch");
                break;
            // Add more cases for other trip types
            case "Road Trip":
                checklist.add("Phone");
                checklist.add("Wallet");
                checklist.add("Chairs");
                break;
            case "Flight":
                checklist.add("Passport");
                checklist.add("Boarding Passes");
                checklist.add("Baggage");
                checklist.add("Pillow");
                break;
            case "Hiking":
                checklist.add("Boots");
                checklist.add("Emergency Kit");
                checklist.add("Radio");
                checklist.add("Jacket");
                checklist.add("Flashlight");
                checklist.add("Walking Stick");
                break;
            case "Camping":
                checklist.add("Tent");
                checklist.add("Sleeping Mat");
                checklist.add("Flashlight");
                checklist.add("Snacks");
                break;

        }
        return checklist;
    }
}
