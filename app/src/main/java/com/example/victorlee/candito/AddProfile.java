package com.example.victorlee.candito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class AddProfile extends AppCompatActivity {
    private final int DEFAULT_VALUE = 100;

    private int benchValue;
    private int squatValue;
    private int deadliftValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile);


        intializeValues();
    }

    public void toggleSaveButton(View view) {
        //TODO save values
    }

    private void intializeValues() {
        //TODO get values
        Intent intent = getIntent();
        Boolean isNew = intent.getBooleanExtra("isNew", true);
        if (isNew) {
            benchValue = DEFAULT_VALUE;
            squatValue = DEFAULT_VALUE;
            deadliftValue = DEFAULT_VALUE;
        }

        int benchValue = this.benchValue;
        RelativeLayout bench = this.findViewById(R.id.bench);
        EditText benchText = bench.findViewWithTag("edit_text");
        benchText.setText(String.valueOf(benchValue));

        int squatValue = this.squatValue;
        RelativeLayout squat = this.findViewById(R.id.squat);
        EditText squatText = squat.findViewWithTag("edit_text");
        squatText.setText(String.valueOf(squatValue));

        int deadliftValue = this.deadliftValue;
        RelativeLayout deadlift = this.findViewById(R.id.deadlift);
        EditText deadliftText = deadlift.findViewWithTag("edit_text");
        deadliftText.setText(String.valueOf(deadliftValue));
    }
}
