package com.ismailhakkiaydin.switchcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout pnl;
    private Switch swt;
    private TextView txt;

    private void init(){
        pnl= new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);
        swt=new Switch(this);

        swt.setTextOff("Square Wave");
        swt.setTextOn("Sinus Wave");
        pnl.addView(swt);
        txt = new TextView(this);
        pnl.addView(txt);

    }

    private void switchChanged(){

        swt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if(swt.isChecked()){
                    txt.setText(swt.getTextOn());
                }else
                    txt.setText(swt.getTextOff());

            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(pnl);
        switchChanged();
    }
}
