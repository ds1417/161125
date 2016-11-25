package com.example.daseul1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch switch1;
    RadioButton jellybean;
    RadioButton kitcat;
    RadioButton lollipop;
    RadioGroup os;
    LinearLayout linear1;
    ImageView img;
    Button end;
    Button first;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1= (Switch) findViewById(R.id.switch1);
        linear1 = (LinearLayout)findViewById(R.id.linear1);
        img = (ImageView)findViewById(R.id.img) ;
        end = (Button)findViewById(R.id.button) ;
        os = (RadioGroup) findViewById(R.id.rg);


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    linear1.setVisibility(View.VISIBLE);
                } else {
                    linear1.setVisibility(View.INVISIBLE);
                }
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (os.getCheckedRadioButtonId() == R.id.radioButton) {
                    img.setImageResource(R.drawable.a);
                } else if (os.getCheckedRadioButtonId() == R.id.radioButton2) {
                    img.setImageResource(R.drawable.b);
                } else {
                    img.setImageResource(R.drawable.c);
                }
            }
        });
    }
}