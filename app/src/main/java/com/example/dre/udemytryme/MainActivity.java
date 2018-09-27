package com.example.dre.udemytryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors = new int[]{Color.CYAN,Color.RED,Color.BLACK,Color.BLUE,Color.GREEN,Color.GRAY,Color.MAGENTA,Color.YELLOW};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.CYAN,Color.RED,Color.BLACK,Color.BLUE,Color.GREEN,Color.GRAY,Color.MAGENTA,Color.YELLOW};



        windowView = findViewById(R.id.windowViewId);
        windowView.setBackgroundColor(Color.BLUE);




        tryMeButton = (Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int colorArrayLength = colors.length;

                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);

                windowView.setBackgroundColor(colors[randomNum]);


                Log.d("Random",String.valueOf(randomNum));

            }
        });






    }
}
