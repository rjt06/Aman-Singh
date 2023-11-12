package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,button_point,
            button_cut, button_sq,button_add,button_sub,button_into,button_divide,button_percent,button_equal,button_ac;

TextView textView1;

TextView show_up;
String total;

String text1;
String text2;

float first_num;
float sec_num;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.white));





        textView1 = findViewById(R.id.textView2);
        show_up = findViewById(R.id.textView3);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button_zero);
        button_ac = findViewById(R.id.button_ac);
        button_sq = findViewById(R.id.button_sq);
        button_cut = findViewById(R.id.button_cut);
        button_add = findViewById(R.id.button_add);
        button_sub = findViewById(R.id.button_sub);
        button_into = findViewById(R.id.button_into);
        button_point = findViewById(R.id.button_point);
        button_equal = findViewById(R.id.button_equal);
        button_divide = findViewById(R.id.button_divide);
        button_percent = findViewById(R.id.button_percent);


        button1.setOnClickListener(v -> textView1.setText(textView1.getText()+"1"));
        button2.setOnClickListener(v -> textView1.setText(textView1.getText()+"2"));
        button3.setOnClickListener(v -> textView1.setText(textView1.getText()+"3"));
        button4.setOnClickListener(v -> textView1.setText(textView1.getText()+"4"));
        button5.setOnClickListener(v -> textView1.setText(textView1.getText()+"5"));
        button6.setOnClickListener(v -> textView1.setText(textView1.getText()+"6"));
        button7.setOnClickListener(v -> textView1.setText(textView1.getText()+"7"));
        button8.setOnClickListener(v -> textView1.setText(textView1.getText()+"8"));
        button9.setOnClickListener(v -> textView1.setText(textView1.getText()+"9"));
        button0.setOnClickListener(v -> textView1.setText(textView1.getText()+"0"));
        button_point.setOnClickListener(v -> textView1.setText(textView1.getText()+"."));
        button_ac.setOnClickListener(v -> textView1.setText(""));
        button_cut.setOnClickListener(v -> {
            if(textView1 !=null) {
                total = textView1.toString();

                textView1.setText(total.substring(0, textView1.length()-1));
            }
        });
        button_point.setOnClickListener(v -> textView1.setText(textView1.getText()+"."));
        button_sq.setOnClickListener(v -> textView1.setText(textView1.getText()+"sq"));
        button_add.setOnClickListener(v -> {
            //if(textView1 !=null) {
                text1 = textView1.toString();
                show_up.setText(textView1.getText());
                textView1.setText("+");
            //}
        });
        button0.setOnClickListener(v -> textView1.setText(textView1.getText()+"0"));
        button0.setOnClickListener(v -> textView1.setText(textView1.getText()+"0"));
        button0.setOnClickListener(v -> textView1.setText(textView1.getText()+"0"));
        button_equal.setOnClickListener(v -> {
            text2 = textView1.toString();
            if(text2.startsWith("+")) {
                //text2.replace("+","0");
                first_num = Float.parseFloat(text1);
                sec_num = Float.parseFloat(text2);
                float sum = first_num + sec_num;
                String SumString = Float.toString(sum);
                textView1.setText(SumString);
            }else{
                textView1.setText("Err");
            }
        });


    }




}
