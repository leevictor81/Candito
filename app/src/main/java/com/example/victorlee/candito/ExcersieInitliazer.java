package com.example.victorlee.candito;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Victor Lee on 9/9/2018.
 */

public class ExcersieInitliazer {

    public static void addWeekOneExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            listOfRepsAndSets = Arrays.asList("Warm", "215 X 6", "215 X 6", "215 X 6", "215 X 6");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "230 X 6", "230 X 6");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            listOfRepsAndSets = Arrays.asList("Warm", "90 X 10", "120 X 10", "135 X 8", "140 X 6");
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
            listOfRepsAndSets = Arrays.asList("Warm", "90 X 10", "120 X 10", "135 X 8", "140 X 6");
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
            listOfRepsAndSets = Arrays.asList("Warm", "190 X 8", "190 X 8", "190 X 8", "190 X 8");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "205 X 8", "205 X 8");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 5")) {
            listOfRepsAndSets = Arrays.asList("Warm", "145XMR");
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

    public static void addWeekTwoExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            listOfRepsAndSets = Arrays.asList("Warm", "215X10MR");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X 8", "X 8", "X 8", "X 8");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            listOfRepsAndSets = Arrays.asList("Warm", "130 X 10", "140 X 8", "150 X 6-8");
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
            listOfRepsAndSets = Arrays.asList("Warm", "220X10MR");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X 8", "X 8", "X 8", "X 8");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 4")) {
            listOfRepsAndSets = Arrays.asList("Warm", "130 X 10", "140 X 8", "150 X 6-8");
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
            listOfRepsAndSets = Arrays.asList("Warm", "140XMR");
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

    public static void addWeekThreeExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            listOfRepsAndSets = Arrays.asList("Warm", "240 X 4-6", "240 X 4-6", "240 X 4-6");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "250 X 3-6", "250 X 3-6");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            listOfRepsAndSets = Arrays.asList("Warm", "155 X 4-6", "155 X 4-6", "155 X 4-6");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
        } else if (dayValue.equals("Day 3")) {
            listOfRepsAndSets = Arrays.asList("Warm", "230 X 4-6");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X 8");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
        } else if (dayValue.equals("Day 4")) {
            listOfRepsAndSets = Arrays.asList("Warm", "160 X 4-6", "160 X 4-6", "160 X 4-6");
            addExercise(inflater, workoutPage, "Bench Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Dumbbell Row", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Military Press", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X6", "X6", "X6");
            addExercise(inflater, workoutPage, "Weighted Pull-up", listOfRepsAndSets);
        }
    }

    public static void addWeekFourExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            listOfRepsAndSets = Arrays.asList("Warm", "240 x 3", "245 x 3", "250 x 3");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X 6", "X 6");
            addExercise(inflater, workoutPage, "Deadlift Variation", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            listOfRepsAndSets = Arrays.asList("Warm", "155 X 3", "155 X 3", "160 X 3");
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
            listOfRepsAndSets = Arrays.asList("Warm", "250 x 3", "255 x 1-2");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "265 X 3", "275 X 1-2");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 4")) {
            listOfRepsAndSets = Arrays.asList("Warm", "160 X 3", "160 X 2-4", "170 X 1-2");
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

    public static void addWeekFiveExercises(LayoutInflater inflater, String dayValue, LinearLayout workoutPage) {
        List<String> listOfRepsAndSets;

        if (dayValue.equals("Day 1")) {
            listOfRepsAndSets = Arrays.asList("Warm", "265 X 1-4");
            addExercise(inflater, workoutPage, "Squat", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "195 X 4", "205 X 4", "210 X 2");
            addExercise(inflater, workoutPage, "Deadlift", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X4", "X4", "X4");
            addExercise(inflater, workoutPage, "Powercleans", listOfRepsAndSets);
            listOfRepsAndSets = Arrays.asList("Warm", "X7-10", "X7-10", "X7-10");
            addExercise(inflater, workoutPage, "Leg Curl", listOfRepsAndSets);
        } else if (dayValue.equals("Day 2")) {
            listOfRepsAndSets = Arrays.asList("Warm", "175 X 1-4");
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
            listOfRepsAndSets = Arrays.asList("Warm", "285 X 1-4");
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
