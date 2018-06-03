package com.example.toggleswitch;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    ToggleButton tb1;
    Switch st1;
    LinearLayout ll1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1 = (ToggleButton) findViewById(R.id.tb1);
        st1 = (Switch) findViewById(R.id.st1);
        ll1 = (LinearLayout) findViewById(R.id.ll1);
    }

    public void sd(View view) {
        if (tb1.isChecked()&&st1.isChecked()){
            ll1.setBackgroundColor(Color.BLUE);
        }
        if (!tb1.isChecked()&&!st1.isChecked()) {
            ll1.setBackgroundColor(Color.BLACK);
        }
        if (tb1.isChecked()&&!st1.isChecked()) {
            ll1.setBackgroundColor(Color.MAGENTA);
        }
        if (!tb1.isChecked()&&st1.isChecked()) {
            ll1.setBackgroundColor(Color.YELLOW);
        }
        }
    }
