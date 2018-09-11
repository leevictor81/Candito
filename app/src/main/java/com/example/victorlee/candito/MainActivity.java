package com.example.victorlee.candito;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.victorlee.candito.WorkoutPage.WEEK_ONE_MAX_DAYS;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeTexts();
    }

    private void initializeTexts() {
        initializeText(R.id.page_button_one, "Week 1", "Muscular Conditioning");
        initializeText(R.id.page_button_two, "Week 2", "Hypertrophy");
        initializeText(R.id.page_button_three, "Week 3", "Linear Max OT Phase");
        initializeText(R.id.page_button_four, "Week 4", "Heavy Weight Acclimation");
        initializeText(R.id.page_button_five, "Week 5", "High Intensity Strength");
    }

    public void initializeText(int id, String weekText, String titleText) {
        LinearLayout layout = this.findViewById(id);

        Button button = layout.findViewById(R.id.week_button);
        button.setText(weekText);

        TextView textView = layout.findViewById(R.id.page_title);
        textView.setText(titleText);
    }

    public void toggleDoneButton(View view) {
        Button button = (Button) view;
        String state = button.getText().toString();
        if (state.equals("DONE?")) {
            state = "DONE";
        } else {
            state = "DONE?";
        }

        button.setText(state);
    }

    public void weekButton(View view) {
        Button button = (Button) view;
        String weekValue = button.getText().toString();

        Intent intent = new Intent(this, WorkoutPage.class);
        intent.putExtra("week", weekValue);
        intent.putExtra("day", "Day 1");
        intent.putExtra("maxDayValue", WEEK_ONE_MAX_DAYS);

        startActivity(intent);
    }

    public void toggleProfileManager(View view) {
        Intent intent = new Intent(this, ProfileManager.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
