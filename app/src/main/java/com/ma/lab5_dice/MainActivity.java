package com.ma.lab5_dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static private int dice_ids[] = {R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3,
            R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageDice = findViewById(R.id.imageDice);
    }

    public void roll(View view){
        int dice = new Random().nextInt(dice_ids.length);
        this.imageDice.setImageResource(dice_ids[dice]);
    }

    private ImageView imageDice;
}