package com.example.victorlee.candito;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.HashSet;
import java.util.Set;

public class ProfileManager extends AppCompatActivity {

    private SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_manager);

        sharedPref = getSharedPreferences("profileValues", Context.MODE_PRIVATE);

        initializeUsers();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void addProfile(View view) {
        Intent intent = new Intent(this, AddProfile.class);
        intent.putExtra("isNew", true);
        startActivity(intent);
    }

    public void changeActiveProfile(View view) {
        Button button = (Button) view;
        String activeProfile = button.getText().toString();

        SharedPreferences.Editor editor = sharedPref.edit();
        Set<String> users = sharedPref.getStringSet("users", new HashSet<String>());
        for (String profile : users) {
            LinearLayout listOfProfiles = findViewById(R.id.list_of_profiles);
            Button b = listOfProfiles.findViewWithTag(profile);
            if (profile.equals(activeProfile)) {
                b.setBackgroundColor(Color.parseColor("#628ced"));
                editor.putString("activeProfile", activeProfile);
                editor.apply();
            } else {
                b.setBackgroundColor(Color.parseColor("#D3D3D3"));
            }
        }
    }

    private void initializeUsers() {
        Set<String> users = sharedPref.getStringSet("users", new HashSet<String>());
        String activeProfile = sharedPref.getString("activeProfile", null);
        LinearLayout listOfProfiles = findViewById(R.id.list_of_profiles);
        for (String profile : users) {
            getLayoutInflater().inflate(R.layout.profile_button, listOfProfiles);
            Button profileButton = listOfProfiles.findViewWithTag("profile_button");
            profileButton.setTag(profile);
            profileButton.setText(profile);
            giveProfileButtonListener(profileButton);
            if (profile.equals(activeProfile)) {
                profileButton.setBackgroundColor(Color.parseColor("#628ced"));
            }
        }
    }

    private void giveProfileButtonListener(Button profileButton) {
        profileButton.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(ProfileManager.this, AddProfile.class);
                intent.putExtra("isNew", false);

                Button button = (Button) view;
                intent.putExtra("profileName", button.getText().toString());
                startActivity(intent);
                return false;
            }
        });
    }
}
