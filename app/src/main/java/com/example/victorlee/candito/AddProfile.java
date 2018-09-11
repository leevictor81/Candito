package com.example.victorlee.candito;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.HashSet;
import java.util.Set;

public class AddProfile extends AppCompatActivity {
    private final int DEFAULT_WORKOUT_VALUE = 100;
    private SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile);

        sharedPref = getSharedPreferences("profileValues", Context.MODE_PRIVATE);

        initializeValues();
    }

    public void toggleSaveButton(View view) {
        SharedPreferences.Editor editor = sharedPref.edit();

        Set<String> users = sharedPref.getStringSet("users", new HashSet<String>());
        EditText name_editText = ((RelativeLayout)findViewById(R.id.profile_name)).findViewWithTag("edit_text");
        String profileName = name_editText.getText().toString();
        users.add(profileName);
        editor.putStringSet("users", users);

        EditText bench_editText = ((RelativeLayout)findViewById(R.id.bench)).findViewWithTag("edit_text");
        editor.putInt(profileName+"_bench", Integer.valueOf(bench_editText.getText().toString()));

        EditText squat_editText = ((RelativeLayout)findViewById(R.id.squat)).findViewWithTag("edit_text");
        editor.putInt(profileName+"_squat", Integer.valueOf(squat_editText.getText().toString()));

        EditText deadlift_editText = ((RelativeLayout)findViewById(R.id.deadlift)).findViewWithTag("edit_text");
        editor.putInt(profileName+"_deadlift", Integer.valueOf(deadlift_editText.getText().toString()));
        editor.apply();

        startActivity(new Intent(this, ProfileManager.class));
    }

    public void toggleDeleteButton(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Delete entry");
        alert.setMessage("Are you sure you want to delete?");
        alert.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Set<String> users = sharedPref.getStringSet("users", new HashSet<String>());
                EditText name_editText = ((RelativeLayout)findViewById(R.id.profile_name)).findViewWithTag("edit_text");
                String profileName = name_editText.getText().toString();
                users.remove(profileName);

                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putStringSet("users", users);
                editor.remove(profileName+"_bench");
                editor.remove(profileName+"_squat");
                editor.remove(profileName+"_deadlift");
                editor.apply();
                startActivity(new Intent(AddProfile.this, ProfileManager.class));
            }
        });
        alert.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alert.show();
    }

    private void initializeValues() {
        Intent intent = getIntent();
        Boolean isNew = intent.getBooleanExtra("isNew", true);
        int benchValue, squatValue, deadliftValue;
        String profileName = "";

        if (isNew) {
            benchValue = DEFAULT_WORKOUT_VALUE;
            squatValue = DEFAULT_WORKOUT_VALUE;
            deadliftValue = DEFAULT_WORKOUT_VALUE;
        } else {
            profileName = intent.getStringExtra("profileName");
            benchValue = sharedPref.getInt(profileName+"_bench", DEFAULT_WORKOUT_VALUE);
            squatValue = sharedPref.getInt(profileName+"_squat", DEFAULT_WORKOUT_VALUE);
            deadliftValue = sharedPref.getInt(profileName+"_deadlift", DEFAULT_WORKOUT_VALUE);
        }

        RelativeLayout name = this.findViewById(R.id.profile_name);
        EditText nameText = name.findViewWithTag("edit_text");
        nameText.setText(profileName);

        RelativeLayout bench = this.findViewById(R.id.bench);
        EditText benchText = bench.findViewWithTag("edit_text");
        benchText.setText(String.valueOf(benchValue));

        RelativeLayout squat = this.findViewById(R.id.squat);
        EditText squatText = squat.findViewWithTag("edit_text");
        squatText.setText(String.valueOf(squatValue));

        RelativeLayout deadlift = this.findViewById(R.id.deadlift);
        EditText deadliftText = deadlift.findViewWithTag("edit_text");
        deadliftText.setText(String.valueOf(deadliftValue));
    }
}
