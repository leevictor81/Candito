package com.example.victorlee.candito;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WorkoutPage extends AppCompatActivity {
    private final int DEFAULT_WORKOUT_VALUE = 100;
    public static final int WEEK_ONE_MAX_DAYS = 5;
    public static final int WEEK_TWO_MAX_DAYS = 5;
    public static final int WEEK_THREE_MAX_DAYS = 4;
    public static final int WEEK_FOUR_MAX_DAYS = 4;
    public static final int WEEK_FIVE_MAX_DAYS = 3;

    private String weekValue;
    private String dayValue;

    private ExcersieInitliazer excersieInitliazer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_page);

        Intent intent = getIntent();
        weekValue = intent.getStringExtra("week");
        dayValue = intent.getStringExtra("day");

        SharedPreferences sharedPref = getSharedPreferences("profileValues", Context.MODE_PRIVATE);
        String activeProfile = sharedPref.getString("activeProfile", "");

        if (activeProfile.isEmpty()) {
            LinearLayout workoutPage = findViewById(R.id.workout_page);
            getLayoutInflater().inflate(R.layout.error_textview, workoutPage);
            TextView textView = workoutPage.findViewById(R.id.error_textview);
            textView.setText("Select an active profile in the profile manager");
        } else {
            int benchValue = sharedPref.getInt(activeProfile+"_bench", DEFAULT_WORKOUT_VALUE);
            int squatValue = sharedPref.getInt(activeProfile+"_squat", DEFAULT_WORKOUT_VALUE);
            int deadliftValue = sharedPref.getInt(activeProfile+"_deadlift", DEFAULT_WORKOUT_VALUE);
            excersieInitliazer = new ExcersieInitliazer(benchValue, squatValue, deadliftValue);
            initializeWeek();
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void toggleDayButton(View view) {
        Button button = (Button) view;
        String dayValue = button.getText().toString();

        Intent intent = new Intent(this, WorkoutPage.class);
        intent.putExtra("week", weekValue);
        intent.putExtra("day", dayValue);
        startActivity(intent);
    }

    public void toggleRepAndSetsButton(View view) {
        Button button = (Button) view;
        ColorDrawable buttonColor = (ColorDrawable) button.getBackground();
        int colorId = buttonColor.getColor();

        String color = "#D3D3D3";
        if (colorId == Color.parseColor("#628ced")) {
            color = "#D3D3D3";
        } if (colorId == Color.parseColor("#D3D3D3")) {
            color = "#628ced";
        }
        button.setBackgroundColor(Color.parseColor(color));
    }

    private void initializeWeek() {
        LinearLayout workoutPage = findViewById(R.id.workout_page);

        if (weekValue.equals("Week 1")) {
            addDayButtons(WEEK_ONE_MAX_DAYS, workoutPage);
            excersieInitliazer.addWeekOneExercises(getLayoutInflater(), dayValue, workoutPage);
        } else if (weekValue.equals("Week 2")) {
            addDayButtons(WEEK_TWO_MAX_DAYS, workoutPage);
            excersieInitliazer.addWeekTwoExercises(getLayoutInflater(), dayValue, workoutPage);
        } else if (weekValue.equals("Week 3")) {
            addDayButtons(WEEK_THREE_MAX_DAYS, workoutPage);
            excersieInitliazer.addWeekThreeExercises(getLayoutInflater(), dayValue, workoutPage);
        } else if (weekValue.equals("Week 4")) {
            addDayButtons(WEEK_FOUR_MAX_DAYS, workoutPage);
            excersieInitliazer.addWeekFourExercises(getLayoutInflater(), dayValue, workoutPage);
        } else if (weekValue.equals("Week 5")) {
            addDayButtons(WEEK_FIVE_MAX_DAYS, workoutPage);
            excersieInitliazer.addWeekFiveExercises(getLayoutInflater(), dayValue, workoutPage);
        }
    }

    private void addDayButtons(int numOfDays, LinearLayout workoutPage) {
        for (int i = 1; i <= numOfDays; i++) {
            LinearLayout listOfDays = workoutPage.findViewById(R.id.list_of_days);
            getLayoutInflater().inflate(R.layout.day_button, listOfDays);
            Button dayButton = listOfDays.findViewWithTag("day_button");

            String day = "Day " + i;
            dayButton.setTag(day);
            dayButton.setText(day);
            if (day.equals(dayValue)) {
                dayButton.setTextColor(Color.parseColor("#FFFFFF"));
            }
        }
    }
}
