package com.zivile.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int input;

    public void makeToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText inputText = findViewById(R.id.inputText);
        String inputString = inputText.getText().toString();
        if (inputString.isEmpty()) {
            makeToast("Put a number !");
        }
        input = Integer.parseInt(inputString);
        number();


    }

    public void number() {

        if (isSquare() && isTriangular()) {
            makeToast(input + " is both square and triangular number!");
        } else if (isSquare()) {
            makeToast(input + " is a square number!");
        } else if (isTriangular()) {
            makeToast(input + " is a triangular number!");
        } else {
            makeToast(input + " is neither!");
        }
    }

    public boolean isTriangular() {
        int triangularNumber = 0;
        int n;
        for (n = 0; triangularNumber < input; n++) {
            triangularNumber += n;
        }
        return triangularNumber == input;
    }

    public boolean isSquare() {

        double sr = Math.sqrt(input);
        return ((sr - Math.floor(sr)) == 0);
    }

}
