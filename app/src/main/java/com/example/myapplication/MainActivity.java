package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView computerDie = findViewById(R.id.computer_dice);
        final ImageView playerDie = findViewById(R.id.player_dice);
        final TextView resultText = findViewById(R.id.result_text);
        Button upperButton = findViewById(R.id.upper_button);
        Button lowerButton = findViewById(R.id.lower_button);


        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        upperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int computerDieIndex = rand.nextInt(6);
                int playerDieIndex = rand.nextInt(6);

                computerDie.setImageResource(diceArray[computerDieIndex]);
                playerDie.setImageResource(diceArray[playerDieIndex]);

                if(playerDieIndex > computerDieIndex)
                    resultText.setText(R.string.user_wins);
                else if(playerDieIndex == computerDieIndex)
                    resultText.setText(R.string.draw);
                else
                    resultText.setText(R.string.computer_wins);

            }
        });

        lowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int computerDieIndex = rand.nextInt(6);
                int playerDieIndex = rand.nextInt(6);

                computerDie.setImageResource(diceArray[computerDieIndex]);
                playerDie.setImageResource(diceArray[playerDieIndex]);

                if(playerDieIndex < computerDieIndex)
                    resultText.setText(R.string.user_wins);
                else if(playerDieIndex == computerDieIndex)
                    resultText.setText(R.string.draw);
                else
                    resultText.setText(R.string.computer_wins);

            }
        });
    }
}