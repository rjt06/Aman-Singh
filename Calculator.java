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
String textView1_string, text1, text2;

float first_num, sec_num;
int count;


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
        button_ac.setOnClickListener(v -> {
            show_up.setText("");
            textView1.setText("");
        });
        button_cut.setOnClickListener(v -> {
            textView1_string = textView1.toString();
            textView1.setText(textView1_string.substring(0, textView1_string.length()-3));
        });

        button_sq.setOnClickListener(v -> textView1.setText(textView1.getText()+"sq"));
        button_add.setOnClickListener(v -> {
            text1 = textView1.toString();
            show_up.setText(textView1.getText());
            textView1.setText("+");
            count = 1;
        });

        button_sub.setOnClickListener(v -> {
            text1 = textView1.toString();
            show_up.setText(textView1.getText());
            textView1.setText("-");
            count = 1;
        });

        button_into.setOnClickListener(v -> {
            text1 = textView1.toString();
            show_up.setText(textView1.getText());
            textView1.setText("*");
            count = 3;
        });

        button_divide.setOnClickListener(v -> {
            text1 = textView1.toString();
            show_up.setText(textView1.getText());
            textView1.setText("/");
            count = 4;
        });

        button_percent.setOnClickListener(v -> {
            text1 = textView1.toString();
            show_up.setText(textView1.getText());
            textView1.setText("%");
            count = 5;
        });

        button_equal.setOnClickListener(v -> {
            text2 = textView1.toString();
            if(count==1) {
                first_num = Float.parseFloat(text1);
                sec_num = Float.parseFloat(text2);
                float sum = first_num + sec_num;
                String SumString = Float.toString(sum);
                show_up.setText(show_up.getText()+text2);
                textView1.setText(SumString);

            } else if (count==3){
                first_num = Float.parseFloat(text1);
                sec_num = Float.parseFloat(text2);
                float into = first_num *sec_num;
                String IntoString = Float.toString(into);
                show_up.setText(show_up.getText()+text2);
                textView1.setText(IntoString);

            } else if (count==4) {
                first_num = Float.parseFloat(text1);
                sec_num = Float.parseFloat(text2);
                float divide = first_num / sec_num;
                String DivideString = Float.toString(divide);
                show_up.setText(show_up.getText()+text2);
                textView1.setText(DivideString);

            } else if (count==5) {
                first_num = Float.parseFloat(text1);
                sec_num = Float.parseFloat(text2);
                float percent = first_num % sec_num;
                String PercentString = Float.toString(percent);
                show_up.setText(show_up.getText()+text2);
                textView1.setText(PercentString);

            } else{
                textView1.setText("Err");
            }
        });
    }
}

