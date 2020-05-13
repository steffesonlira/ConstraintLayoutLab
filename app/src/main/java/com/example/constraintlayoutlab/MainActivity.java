package com.example.constraintlayoutlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radio_group_genre;
    RadioButton radioButton_Gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio_group_genre = findViewById(R.id.radio_group_genre);


    }

    public void selectGender(View v) {
        int selectedRadioButtonId = radio_group_genre.getCheckedRadioButtonId();
        radioButton_Gender = findViewById(selectedRadioButtonId);
        Toast.makeText(this, "Radio Button: " + radioButton_Gender.getText().toString(), Toast.LENGTH_LONG);

    }
}
