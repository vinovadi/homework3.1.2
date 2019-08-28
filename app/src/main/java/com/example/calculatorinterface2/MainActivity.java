package com.example.calculatorinterface2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mOutputTxt;
    private TextView mCancelBtn;
    private TextView mChangeSignBtn;
    private TextView mPercentBtn;
    private TextView mSevenBtn;
    private TextView mEightBtn;
    private TextView mNineBtn;
    private TextView mMultiplyBtn;
    private TextView mFourBtn;
    private TextView mFiveBtn;
    private TextView mSixBtn;
    private TextView mMinusBtn;
    private TextView mOneBtn;
    private TextView mTwoBtn;
    private TextView mThreeBtn;
    private TextView mZeroBtn;
    private TextView mPointBtn;
    private TextView mEqualsBtn;
    private String input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        inputNumbers();
    }

    public void initViews() {
        mOutputTxt = findViewById(R.id.txtOutput);
        mCancelBtn = findViewById(R.id.btnCancel);
        mChangeSignBtn = findViewById(R.id.btnChangeSign);
        mPercentBtn = findViewById(R.id.btnPercent);
        mSevenBtn = findViewById(R.id.btn7);
        mEightBtn = findViewById(R.id.btn8);
        mNineBtn = findViewById(R.id.btn9);
        mMultiplyBtn = findViewById(R.id.btnMultiply);
        mFourBtn = findViewById(R.id.btn4);
        mFiveBtn = findViewById(R.id.btn5);
        mSixBtn = findViewById(R.id.btn6);
        mMinusBtn = findViewById(R.id.btnMinus);
        mOneBtn = findViewById(R.id.btn1);
        mTwoBtn = findViewById(R.id.btn2);
        mThreeBtn = findViewById(R.id.btn3);
        mZeroBtn = findViewById(R.id.btn0);
        mPointBtn = findViewById(R.id.btnPoint);
        mEqualsBtn = findViewById(R.id.btnEquals);
    }

    public void inputNumbers() {
        mOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mOneBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mTwoBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mThreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mThreeBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mFourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mFourBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mFiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mFiveBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mSixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mSixBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mSevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mSevenBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mEightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mEightBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mNineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mNineBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mZeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mZeroBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });

        mPointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = mPointBtn.getText().toString();
                mOutputTxt.append(input);
            }
        });
    }
}