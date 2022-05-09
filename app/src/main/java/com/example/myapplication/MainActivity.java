package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String display = "";
    private String ans = "";
    private TextView text;
    private String number1 = "";
    private String number2 = "";
    private boolean prev = false;
    // true if currently click "="
    private int operation= -1;

    // 1 for add
    // 2 for sub
    // 3 for mult
    // 4 for devide
    private boolean operated = false;
    public Integer calculate(){

        try {
            Integer n1 = Integer.parseInt(number1);
            Integer n2 = Integer.parseInt(number2);
            switch ( operation ) {
                case  1:
                    //add

                    text.setText(Integer.toString(n1+n2));
                    ans = Integer.toString(n1+n2);
                    display = "";
                    number1 = ans;;
                    number2 = "";
                    prev = false;
                    break;
                case  2:

                    text.setText(Integer.toString(n1-n2));
                    ans = Integer.toString(n1-n2);
                    display = "";
                    number1 = ans;;
                    number2 = "";
                    prev = false;
                    break;
                case  3:

                    text.setText(Integer.toString(n1*n2));
                    ans = Integer.toString(n1*n2);
                    display = "";
                    number1 = ans;;
                    number2 = "";
                    prev = false;
                    break;
                case  4:

                    text.setText(Integer.toString(n1/n2));
                    ans = Integer.toString(n1/n2);
                    display = "";
                    number1 = ans;;
                    number2 = "";
                    prev = false;
                    break;
            }
        }catch (Exception e){

        }
        return 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R
                .layout.activity_main);
        text = findViewById(R.id.textView);
        operated = false;
        operation = -1;
        number1 = "";
        number2 = "";
        findViewById(R.id.nine_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="9";
                    display+="9";
                    text.setText(display);
                    operated = false;
                    return;
                }

                if(operated == false) {
                    number1 += "9";
                }else{
                    number2 += "9";
                    prev = false;
                }
                display+="9";
                text.setText(display);
            }
        });

        findViewById(R.id.eight_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="8";
                    display+="8";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "8";
                }else{
                    number2 += "8";
                    prev = false;

                }
                display+="8";
                text.setText(display);
            }
        });

        findViewById(R.id.seven_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="7";
                    display+="7";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "7";
                }else{
                    number2 += "7";
                    prev = false;
                }
                display+="7";
                text.setText(display);
            }
        });

        findViewById(R.id.six_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="6";
                    display+="6";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "6";
                }else{
                    number2 += "6";
                    prev = false;
                }
                display+="6";
                text.setText(display);
            }
        });

        findViewById(R.id.five_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="5";
                    display+="5";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "5";
                }else{
                    number2 += "5";
                    prev = false;
                }
                display+="5";
                text.setText(display);
            }
        });

        findViewById(R.id.four_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="4";
                    display+="4";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "4";
                }else{
                    number2 += "4";
                    prev = false;
                }
                display+="4";
                text.setText(display);
            }
        });

        findViewById(R.id.three_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="3";
                    display+="3";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "3";
                }else{
                    number2 += "3";
                    prev = false;
                }
                display+="3";
                text.setText(display);
            }
        });

        findViewById(R.id.two_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="2";
                    display+="2";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "2";
                }else{
                    number2 += "2";
                    prev = false;
                }
                display+="2";
                text.setText(display);
            }
        });

        findViewById(R.id.one_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="1";
                    display+="1";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "1";
                }else{
                    number2 += "1";
                    prev = false;
                }
                display+="1";
                text.setText(display);
            }
        });

        findViewById(R.id.zero_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prev == true){
                    number1+="0";
                    display+="0";
                    text.setText(display);
                    operated = false;
                    return;
                }
                if(operated == false) {
                    number1 += "0";
                }else{
                    number2 += "0";
                    prev = false;
                }
                display+="0";
                text.setText(display);
            }
        });

        findViewById(R.id.cal_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operated == true){
                    calculate();
                }
            }
        });

        findViewById(R.id.add_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 1;
                if(prev){
                    number1 = ans;
                }
                prev = false;
                if(operated == false){
                    operated = true;
                    operation = 1;// for add
                    display+="+";
                    text.setText(display);
                }else{
                    calculate();
                }
            }
        });

        findViewById(R.id.sub_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 2;
                if(prev){
                    number1 = ans;
                }
                prev = false;
                if(operated == false){
                    operated = true;
                    operation = 2;// for add
                    display+="-";
                    text.setText(display);
                }else{
                    calculate();
                }
            }
        });
        findViewById(R.id.mult_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 3;
                if(prev){
                    number1 = ans;
                }
                prev = false;
                if(operated == false){
                    operated = true;
                    operation = 3;// for add
                    display+="*";
                    text.setText(display);
                }else{
                    calculate();
                }
            }
        });

        findViewById(R.id.devide_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 4;
                if(prev){
                    number1 = ans;
                }
                prev = false;
                if(operated == false){
                    operated = true;
                    operation = 4;// for add
                    display+="/";
                    text.setText(display);
                }else{
                    calculate();
                }
            }
        });

        findViewById(R.id.cal_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operated){
                    calculate();
                    operated = false;
                }
                number1 = "";
                prev = true;
            }
        });

        findViewById(R.id.CE_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("0");
                operated = false;
                operation = -1;
                number1 = "";
                number2 = "";
                ans ="";
                display = "";
                prev = false;
            }
        });
    }
}