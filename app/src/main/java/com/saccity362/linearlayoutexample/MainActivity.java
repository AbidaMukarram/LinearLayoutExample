
package com.saccity362.linearlayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1= (RadioButton) findViewById(R.id.radioButton1 );
        rb2= (RadioButton) findViewById(R.id.radioButton2 );
        initRadioButton();

    }

    private void initRadioButton() {
        rb2.setChecked(true);
        if(rb1.isChecked()) {
            //COde here
        }
    }

}