package com.cihancicekel.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        final ImageView leftDice;
        final ImageView rightDice;

        rollButton= (Button) findViewById(R.id.rollButton);
        leftDice= (ImageView) findViewById(R.id.image_leftDice);
        rightDice= (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray={R.drawable.dice1,
                         R.drawable.dice2,
                         R.drawable.dice3,
                         R.drawable.dice4,
                         R.drawable.dice5,
                         R.drawable.dice6};




        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Random randomNum=new Random();
                int myNumber=randomNum.nextInt(6);
                Log.d("dice ","Random num is "+myNumber);
                leftDice.setImageResource(diceArray[myNumber]);
                 myNumber=randomNum.nextInt(6);
                rightDice.setImageResource(diceArray[myNumber]);


            }
        });


    }
}
