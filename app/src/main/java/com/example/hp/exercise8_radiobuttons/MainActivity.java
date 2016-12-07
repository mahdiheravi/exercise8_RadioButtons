package com.example.hp.exercise8_radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton rgbLondon = (RadioButton) findViewById(R.id.rdbLondon);
        RadioButton rgbBeijing = (RadioButton) findViewById(R.id.rdbBlijng);
        RadioButton rdbNewyork = (RadioButton) findViewById(R.id.rdbNewyork);

        CheckBox chkTrans = (CheckBox) findViewById(R.id.chkTrsnsparent);
        CheckBox chkVisible = (CheckBox) findViewById(R.id.chkVisibility);

        ImageView IV = (ImageView) findViewById(R.id.IVpic);

        Button btnset = (Button) findViewById(R.id.btnset);



    }
}
