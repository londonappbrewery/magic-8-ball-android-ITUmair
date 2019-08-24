package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ballDispaly;
    int[] ballArray;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDispaly = findViewById(R.id.image_8ballpool);

        final int[] ballArray = new int[]{
                R.drawable.one,
                R.drawable.three,
                R.drawable.six,
                R.drawable.eight,
                R.drawable.ten };

        myButton = findViewById(R.id.askButton);
        myButton.setOnClickListener(new myAskButtonClick());
    }

    public void myAskButton(){

        Random randomNumberGenerator = new Random();
        int numbers = randomNumberGenerator.nextInt(5);
        int randomResourceId = ballArray[numbers];

        ballDispaly.setImageResource(randomResourceId);
    }

    class myAskButtonClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            myAskButton();

        }
    }

}
