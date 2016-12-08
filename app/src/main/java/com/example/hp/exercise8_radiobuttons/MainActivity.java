package com.example.hp.exercise8_radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rgbLondon, rgbBeijing, rgbNewyork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgbLondon = (RadioButton) findViewById(R.id.rdbLondon);
        rgbBeijing = (RadioButton) findViewById(R.id.rdbBlijng);
        rgbNewyork = (RadioButton) findViewById(R.id.rdbNewyork);

        CheckBox chkTrans = (CheckBox) findViewById(R.id.chkTrsnsparent);
        CheckBox chkVisible = (CheckBox) findViewById(R.id.chkVisibility);

        final ImageView IV = (ImageView) findViewById(R.id.IVpic);

        Button btnset = (Button) findViewById(R.id.btnset);
        btnset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rgbLondon.isChecked()) {

                    IV.setImageResource(getResources().getIdentifier("london","drawable",getPackageName()));
                }
                if (rgbBeijing.isChecked()) {
                    IV.setImageResource(getResources().getIdentifier("beijing","drawable",getPackageName()));

                }
                if (rgbNewyork.isChecked()) {
                    IV.setImageResource(getResources().getIdentifier("newyork","drawable",getPackageName()));

                }

            }
        });


    }
}
