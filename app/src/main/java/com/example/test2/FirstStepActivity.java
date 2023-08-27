package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class FirstStepActivity extends AppCompatActivity {

    EditText familyInput, nameInput, patronymicInput, genderInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_step);
        familyInput=findViewById(R.id.familyInput);
        nameInput=findViewById(R.id.nameInput);
        patronymicInput=findViewById(R.id.patronymicInput);
        genderInput=findViewById(R.id.genderInput);
    }



    public void toContinue1(View v) {
        Intent intent = new Intent(this, SecondStepActivity.class);
        startActivity(intent);
    }

    public void toBack1(View v) {
        this.finish();
    }

}