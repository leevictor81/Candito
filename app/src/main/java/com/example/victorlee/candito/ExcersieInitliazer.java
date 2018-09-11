package com.example.victorlee.candito;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Victor Lee on 9/9/2018.
 */

public class ExcersieInitliazer {
    private final int DEFAULT_WORKOUT_VALUE = 100;

    private int benchValue;
    private int squatValue;
    private int deadliftValue;

    public ExcersieInitliazer(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences("profileValues", Context.MODE_PRIVATE);
        String activeProfile = sharedPref.getString("activeProfile", null);

        if (activeProfile == null) {
            benchValue = DEFAULT_WORKOUT_VALUE;
            squatValue = DEFAULT_WORKOUT_VALUE;
            deadliftValue = DEFAULT_WORKOUT_VALUE;
        } else {
            benchValue = sharedPref.getInt(activeProfile+"_bench", DEFAULT_WORKOUT_VALUE);
            squatValue = sharedPref.getInt(activeProfile+"_squat", DEFAULT_WORKOUT_VALUE);
            deadliftValue = sharedPref.getInt(activeProfile+"_deadlift", DEFAULT_WORKOUT_VALUE);
        }
    }

    private int roundToFiveAndGetStringValue(double value) {
        return new BigDecimal(5*(Math.round(value/5))).intValueExact();
    }

    public void addWeekOneExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            int squatValue = roundToFiveAndGetStringValue(this.squatValue*0.8);
            int deadliftValue = roundToFiveAndGetStringValue(this.deadliftValue*0.8);
            listOfRepsAndSets = Arrays.asList("Warm", squatValue+" X 6", squatValue+" X 6", squatValue+" X 6", squatValue+" X 6");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", deadliftValue+" X 6", deadliftValue+" X 6");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            int benchValue1 = roundToFiveAndGetStringValue(this.benchValue*0.5);
            int benchValue2 = roundToFiveAndGetStringValue(this.benchValue*0.675);
            int benchValue3 = roundToFiveAndGetStringValue(this.benchValue*0.75);
            int benchValue4 = roundToFiveAndGetStringValue(this.benchValue*0.775);
            listOfRepsAndSets = Arrays.asList("Warm", benchValue1+" X 10", benchValue2+" X 10", benchValue3+" X 8", benchValue4+" X 6");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        } else if (dayValue.equals("Day 3")) {
            int benchValue1 = roundToFiveAndGetStringValue(this.benchValue*0.5);
            int benchValue2 = roundToFiveAndGetStringValue(this.benchValue*0.675);
            int benchValue3 = roundToFiveAndGetStringValue(this.benchValue*0.75);
            int benchValue4 = roundToFiveAndGetStringValue(this.benchValue*0.775);
            listOfRepsAndSets = Arrays.asList("Warm", benchValue1+" X 10", benchValue2+" X 10", benchValue3+" X 8", benchValue4+" X 6");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        } else if (dayValue.equals("Day 4")) {
            int squatValue = roundToFiveAndGetStringValue(this.squatValue*0.7);
            int deadliftValue = roundToFiveAndGetStringValue(this.deadliftValue*0.7);
            listOfRepsAndSets = Arrays.asList("Warm", squatValue+" X 8", squatValue+" X 8", squatValue+" X 8", squatValue+" X 8");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", deadliftValue+" X 8", deadliftValue+" X 8");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 5")) {
            int benchValue = roundToFiveAndGetStringValue(this.benchValue*0.8);
            listOfRepsAndSets = Arrays.asList("Warm", benchValue+"XMR");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        }
    }

    public void addWeekTwoExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            int squatValue = roundToFiveAndGetStringValue(this.squatValue*0.8);
            listOfRepsAndSets = Arrays.asList("Warm", squatValue+"X10MR");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X 8", "X 8", "X 8", "X 8");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            int benchValue1 = roundToFiveAndGetStringValue(this.benchValue*0.725);
            int benchValue2 = roundToFiveAndGetStringValue(this.benchValue*0.775);
            int benchValue3 = roundToFiveAndGetStringValue(this.benchValue*0.8)+5;
            listOfRepsAndSets = Arrays.asList("Warm", benchValue1+" X 10", benchValue2+" X 8", benchValue3+" X 6-8");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X8");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        } else if (dayValue.equals("Day 3")) {
            int squatValue = roundToFiveAndGetStringValue(this.squatValue*0.85)+5;
            listOfRepsAndSets = Arrays.asList("Warm", squatValue+"X10MR");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X 8", "X 8", "X 8", "X 8");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 4")) {
            int benchValue1 = roundToFiveAndGetStringValue(this.benchValue*0.725);
            int benchValue2 = roundToFiveAndGetStringValue(this.benchValue*0.775);
            int benchValue3 = roundToFiveAndGetStringValue(this.benchValue*0.8)+5;
            listOfRepsAndSets = Arrays.asList("Warm", benchValue1+" X 10", benchValue2+" X 8", benchValue3+" X 6-8");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X8");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        } else if (dayValue.equals("Day 5")) {
            int benchValue = roundToFiveAndGetStringValue(this.benchValue*0.8)-5;
            listOfRepsAndSets = Arrays.asList("Warm", benchValue+"XMR");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X8");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X8", "X6");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        }
    }

    public void addWeekThreeExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            int squatValue = roundToFiveAndGetStringValue(this.squatValue*0.85)+5;
            int deadliftValue = roundToFiveAndGetStringValue(this.deadliftValue*0.875);
            listOfRepsAndSets = Arrays.asList("Warm", squatValue+" X 4-6", squatValue+" X 4-6", squatValue+" X 4-6");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", deadliftValue+" X 3-6", deadliftValue+" X 3-6");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            int benchValue = roundToFiveAndGetStringValue(this.benchValue*0.85);
            listOfRepsAndSets = Arrays.asList("Warm", benchValue+" X 4-6", benchValue+" X 4-6", benchValue+" X 4-6");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
        } else if (dayValue.equals("Day 3")) {
            int squatValue = roundToFiveAndGetStringValue(this.squatValue*0.85+5)+5;
            listOfRepsAndSets = Arrays.asList("Warm", squatValue+" X 4-6");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X 8");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
        } else if (dayValue.equals("Day 4")) {
            int benchValue = roundToFiveAndGetStringValue(this.benchValue*0.85)+5;
            listOfRepsAndSets = Arrays.asList("Warm", benchValue+" X 4-6", benchValue+" X 4-6", benchValue+" X 4-6");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
        }
    }

    public void addWeekFourExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            int squatValue1 = roundToFiveAndGetStringValue(this.squatValue*0.9)-5;
            int squatValue2 = roundToFiveAndGetStringValue(this.squatValue*0.9);
            int squatValue3 = roundToFiveAndGetStringValue(this.squatValue*0.9)+5;
            listOfRepsAndSets = Arrays.asList("Warm", squatValue1+" x 3", squatValue2+" x 3", squatValue3+" x 3");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X 6", "X 6");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            int benchValue1 = roundToFiveAndGetStringValue(this.benchValue*0.875-5);
            int benchValue2 = roundToFiveAndGetStringValue(this.benchValue*0.9-5);
            int benchValue3 = roundToFiveAndGetStringValue(this.benchValue*0.9);
            listOfRepsAndSets = Arrays.asList("Warm", benchValue1+" X 3", benchValue2+" X 3", benchValue3+" X 3");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X10", "X8", "X8");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        } else if (dayValue.equals("Day 3")) {
            int squatValue1 = roundToFiveAndGetStringValue(this.squatValue*0.9)+5;
            int squatValue2 = roundToFiveAndGetStringValue(this.squatValue*0.95);
            int deadliftValue1 = roundToFiveAndGetStringValue(this.deadliftValue*0.9)+5;
            int deadliftValue2 = roundToFiveAndGetStringValue(this.deadliftValue*0.95);
            listOfRepsAndSets = Arrays.asList("Warm", squatValue1+" x 3", squatValue2+" x 1-2");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", deadliftValue1+" X 3", deadliftValue2+" X 1-2");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 4")) {
            int benchValue1 = roundToFiveAndGetStringValue(this.benchValue*0.875);
            int benchValue2 = roundToFiveAndGetStringValue(this.benchValue*0.9);
            int benchValue3 = roundToFiveAndGetStringValue(this.benchValue*0.95);
            listOfRepsAndSets = Arrays.asList("Warm", benchValue1+" X 3", benchValue2+" X 2-4", benchValue3+" X 1-2");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X10", "X10", "X8", "X8");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X12", "X12", "X10", "X8");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        }
    }

    public void addWeekFiveExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            int squatValue = roundToFiveAndGetStringValue(this.squatValue*0.975);
            int deadliftValue1 = roundToFiveAndGetStringValue(this.deadliftValue*0.675);
            int deadliftValue2 = roundToFiveAndGetStringValue(this.deadliftValue*0.7);
            int deadliftValue3 = roundToFiveAndGetStringValue(this.deadliftValue*0.725);
            listOfRepsAndSets = Arrays.asList("Warm", squatValue+" X 1-4");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", deadliftValue1+" X 4", deadliftValue2+" X 4", deadliftValue3+" X 2");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            int benchValue = roundToFiveAndGetStringValue(this.benchValue*0.975);
            listOfRepsAndSets = Arrays.asList("Warm", benchValue+" X 1-4");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8", "X6", "X6");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8", "X6", "X6");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8", "X6", "X6");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Incline Chest Fly", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X8-12", "X8-12", "X8-12");
            addExercise(inflater, workoutPage, "Lateral Dumbbell Raise", listOfRepsAndSets);
        } else if (dayValue.equals("Day 3")) {
            int deadliftValue = roundToFiveAndGetStringValue(this.deadliftValue*0.975);
            listOfRepsAndSets = Arrays.asList("Warm", deadliftValue+" X 1-4");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        }
    }

    private static void addExercise(LayoutInflater inflater, LinearLayout workoutPage, String exerciseValue, List<String> listOfRepsAndSets) {
        View exercise = inflater.inflate(R.layout.workout_box, workoutPage);
        LinearLayout exerciseBox = exercise.findViewWithTag("exercise_box");
        exerciseBox.setTag(exerciseValue);

        TextView textView = exerciseBox.findViewById(R.id.exercise_text);
        textView.setText(exerciseValue);

        LinearLayout repsAndSets = exerciseBox.findViewById(R.id.reps_and_sets);
        int numOfButtons = 1;
        for(String repAndSet : listOfRepsAndSets) {
            inflater.inflate(R.layout.reps_and_sets_button, repsAndSets);
            Button repsAndSetsButton = repsAndSets.findViewWithTag("reps_and_sets_button");
            repsAndSetsButton.setTag("button" + numOfButtons);
            repsAndSetsButton.setText(repAndSet);
        }
    }
}
