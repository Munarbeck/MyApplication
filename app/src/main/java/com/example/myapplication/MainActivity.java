package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer first, second;
    private boolean isClickOperation = false;
    private String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    public void onClickNumber(View view) {
        if (isClickOperation) {
            tvResult.setText("0");
            isClickOperation = false;
        }
        switch (view.getId()) {
            case R.id.btn_one:
                //нажал на единицу

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                break;
            case R.id.btn_two:
                //нажал на двойку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                break;
            case R.id.btn_three:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                break;

            case R.id.btn_four:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                break;
            case R.id.btn_five:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                break;
            case R.id.btn_six:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                break;
            case R.id.btn_seven:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                break;
            case R.id.btn_eight:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                break;
            case R.id.btn_nine:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                break;
            case R.id.btn_zero:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                break;

            case R.id.btn_all_clear:
                tvResult.setText("0");
                break;

        }
    }


    @SuppressLint("SetTextI18n")
    public void onClickOperation(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(first + "+");
                operation = "+";
                break;
            case R.id.btn_minus:
                first = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(first + "-");
                operation = "-";
                break;case R.id.btn_x:
                first = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(first + "x");
                operation = "x";
                break;
            case R.id.btn_percent:
                first = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(first + "%");
                operation = "%";
                break;
            case R.id.btn_plus_and_minus:
                first = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(first + "+/-");
                operation = "+/-";
                break;
            case R.id.btn_slash:
                first = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(first + "/");
                operation = "/";
                break;
            




            case R.id.btnEquals:
                isClickOperation = true;
                second = Integer.parseInt(tvResult.getText().toString()
                        .replace(first + operation, ""));
                switch (operation) {
                    case "+":
                        tvResult.setText(first + operation + second + "=" + (first + second));
                        break;
                    case "-":
                        tvResult.setText(first + operation + second + "=" + (first - second));
                        break;
                    case "x":
                        tvResult.setText(first + operation + second + "=" + (first * second));
                        break;
                    case "%":
                        tvResult.setText(first + operation + second + "=" + (first % second));
                        break;
                    case "+/-":
                        tvResult.setText(first + operation + second + "=" + (first +- second));
                        break;
                    case "/":
                        tvResult.setText(first + operation + second + "=" + (first / second));
                        break;


                }
                break;
        }
    }
}

