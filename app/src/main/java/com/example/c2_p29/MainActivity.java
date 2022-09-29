package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2, input3, input4;
    TextView result;
    int total, num1, num2, num3, num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        result = findViewById(R.id.result);
        num1 = num2 = num3 = num4 = total;

        input1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String size = input1.getText().toString();
                if (size.equals("")){
                    size = "0";
                }
                num1 = Integer.parseInt(size) * 490;
                total = num1 + num2 + num3 + num4;
                result.setText(String.valueOf(total));
            }
        });

        input2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String size = input2.getText().toString();
                if (size.equals("")){
                    size = "0";
                }
                num2 = Integer.parseInt(size) * 310;
                total = num1 + num2 + num3 + num4;
                result.setText(String.valueOf(total));
            }
        });

        input3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String size = input3.getText().toString();
                if (size.equals("")){
                    size = "0";
                }
                num3 = Integer.parseInt(size) * 240;
                total = num1 + num2 + num3 + num4;
                result.setText(String.valueOf(total));
            }
        });

        input4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String size = input4.getText().toString();
                if (size.equals("")){
                    size = "0";
                }
                num4 = Integer.parseInt(size) * 690;
                total = num1 + num2 + num3 + num4;
                result.setText(String.valueOf(total));
            }
        });
    }
}