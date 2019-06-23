package ir.icegroup.arcratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.icegroup.curvedratingbar.RatingBar;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRate(2);
    }
}