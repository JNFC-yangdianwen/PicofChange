package com.example.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private CheckBox checkBox;
    private ImageView imageView;
    private ToggleButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CheckBox) findViewById(R.id.check);
        checkBox.setOnCheckedChangeListener(this);
        imageView = (ImageView) findViewById(R.id.ima);
        button = (ToggleButton) findViewById(R.id.toggleButton);
        button.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        imageView.setImageResource(isChecked ? R.mipmap.logo_2 : R.mipmap.ic_launcher);
    }
}
