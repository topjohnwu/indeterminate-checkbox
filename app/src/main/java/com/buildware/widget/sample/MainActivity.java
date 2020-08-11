package com.buildware.widget.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import com.topjohnwu.widget.IndeterminateCheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkBox = findViewById(R.id.checkBox);
        final AppCompatCheckBox appCompatCheckBox = findViewById(R.id.app_compat_checkbox);
        final IndeterminateCheckBox indetermCheckBox = findViewById(R.id.indeterm_checkbox);

        findViewById(R.id.btn_indeterminate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indetermCheckBox.setState(null);
            }
        });

        findViewById(R.id.btn_checked).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox.setChecked(true);
                appCompatCheckBox.setChecked(true);
                indetermCheckBox.setChecked(true);
            }
        });

        findViewById(R.id.btn_unchecked).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox.setChecked(false);
                appCompatCheckBox.setChecked(false);
                indetermCheckBox.setChecked(false);
            }
        });

        findViewById(R.id.btn_enable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox.setEnabled(true);
                appCompatCheckBox.setEnabled(true);
                indetermCheckBox.setEnabled(true);
            }
        });

        findViewById(R.id.btn_disable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox.setEnabled(false);
                appCompatCheckBox.setEnabled(false);
                indetermCheckBox.setEnabled(false);
            }
        });
    }
}
