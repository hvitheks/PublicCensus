package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ScrollActivity extends AppCompatActivity {

    private EditText familyInput, nameInput, patronymicInput, genderInput, birthDateInput, wedlockInput, birthPlaceInput, ruLangInput,
            anyLangInput, nativeLangInput, citizenshipInput, nationalityInput, educationInput, educationNowInput, homeInput, homeSquareInput;
    private DatabaseReference mDataBase;
    private String USER_KEY = "Пользователи";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        init();
    }

    private void init(){
        familyInput=findViewById(R.id.familyInput);
        nameInput=findViewById(R.id.nameInput);
        patronymicInput=findViewById(R.id.patronymicInput);
        genderInput=findViewById(R.id.genderInput);
        birthDateInput=findViewById(R.id.birthDateInput);
        wedlockInput=findViewById(R.id.wedlockInput);
        birthPlaceInput=findViewById(R.id.birthPlaceInput);
        ruLangInput=findViewById(R.id.ruLangInput);
        anyLangInput=findViewById(R.id.anyLangInput);
        nativeLangInput=findViewById(R.id.nativeLangInput);
        citizenshipInput=findViewById(R.id.citizenshipInput);
        nationalityInput=findViewById(R.id.nationalityInput);
        educationInput=findViewById(R.id.educationInput);
        educationNowInput=findViewById(R.id.educationNowInput);
        homeInput=findViewById(R.id.homeInput);
        homeSquareInput=findViewById(R.id.homeSquareInput);

        mDataBase=FirebaseDatabase.getInstance().getReference(USER_KEY);

    }

    public void toFinish(View v) {
        String second_name = familyInput.getText().toString();
        String first_name = nameInput.getText().toString();
        String patronymic = patronymicInput.getText().toString();
        String gender = genderInput.getText().toString();
        String birthDate = birthDateInput.getText().toString();
        String wedlock = wedlockInput.getText().toString();
        String birthPlace = birthPlaceInput.getText().toString();
        String ruLang = ruLangInput.getText().toString();
        String anyLang = anyLangInput.getText().toString();
        String nativeLang = nativeLangInput.getText().toString();
        String citizenship = citizenshipInput.getText().toString();
        String nationality = nationalityInput.getText().toString();
        String education = educationInput.getText().toString();
        String educationNow = educationNowInput.getText().toString();
        String home = homeInput.getText().toString();
        String homeSquare = homeSquareInput.getText().toString();
        User newUser = new User(second_name, first_name, patronymic, gender, birthDate, wedlock, birthPlace, ruLang,
                anyLang, nativeLang, citizenship, nationality, education, educationNow, home, homeSquare);
        mDataBase.push().setValue(newUser);

        Intent intent = new Intent(this, ExitActivity.class);
        startActivity(intent);
    }
}

















