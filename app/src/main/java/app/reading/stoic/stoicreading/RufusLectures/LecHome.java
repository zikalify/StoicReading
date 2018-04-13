package app.reading.stoic.stoicreading.RufusLectures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class LecHome extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_home);
        setTitle("Lectures");

        //Call each activity when click corresponding button
        button = (Button) findViewById(R.id.rufus_lec_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lec1();
            }
        });

       
    }

    //Activity call methods, called by buttons above
    public void Lec1() {
        Intent intent = new Intent(this, Lec1.class);
        startActivity(intent);
    }


}
