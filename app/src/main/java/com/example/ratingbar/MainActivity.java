package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    RatingBar ratingBar;

    float myRating = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        ratingBar = findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                int rating = (int) v;
                String message = null;

                myRating = ratingBar.getRating();

                switch (rating) {
                    case 1:
                        message = "Saya kecewa!, pelayanan tidak memuaskan. :(";
                        break;
                    case 2:
                        message = "Saya sedih!, pelayanan kurang memuaskan. :(";
                        break;
                    case 3:
                        message = "Biasa saja!, pelayanan perlu ditingkatkan. :|";
                        break;
                    case 4:
                        message = "Pengemudinya ramah!, pelayanan cukup memuaskan. :)";
                        break;
                    case 5:
                        message = "Saya sangat senang!, pelayanan sangat memuaskan. :)";
                        break;
                }

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your rating is " + myRating, Toast.LENGTH_LONG).show();
            }
        });
    }
}