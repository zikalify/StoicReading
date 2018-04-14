package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.RufusLectures.LecHome;

public class RufusHome extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rufus_home);
        setTitle(this.getString(R.string.Musonius_Rufus));

        //Call each activity when click corresponding button
        button = (Button) findViewById(R.id.rufus_lec_home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LecHome();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void LecHome() {
        Intent intent = new Intent(this, LecHome.class);
        startActivity(intent);
    }
}
