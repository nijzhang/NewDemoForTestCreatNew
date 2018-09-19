package com.example.a15625.newdemofortestcreat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static com.example.a15625.newdemofortestcreat.R.*;

public class MainActivity extends AppCompatActivity {

    Button leftBtn;
    Button rightBtn;

    int leftDigit;
    int rightDigit;

    TextView scoreTxt;

    int score;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        leftBtn = (Button)findViewById(R.id.leftBtn);
        rightBtn = (Button)findViewById(R.id.rightBtn);
        scoreTxt = (TextView)findViewById(id.scoreBlock);

        score = 0;

        Initiate();

    }

    private void Initiate() {

        Random R = new Random();
        leftDigit = R.nextInt(100);
        rightDigit = R.nextInt(100);

        leftBtn.setText(Integer.toString(leftDigit));
        rightBtn.setText(Integer.toString(rightDigit));
    }

    public void clickableMethod(View view) {

        Button btn = (Button)view;

        if(btn.getText().toString().equals(""+leftDigit)){

            //left btn clicked

            if(leftDigit > rightDigit){
                score ++;
            }
        }

        else if(btn.getText().toString().equals(""+rightDigit))
        {
            if(rightDigit>leftDigit){
                score ++;
            }
        }

        scoreTxt.setText("score:"+score);

        Initiate();
    }
}
