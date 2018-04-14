package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.AureliusMeditations.AureliusMedBookHome;

public class AureliusHome extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aurelius_home);
        setTitle("Marcus Aurelius");

        //Call each activity when click corresponding button
        button = (Button) findViewById(R.id.aurelius_meditations);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AureliusMedHome();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void AureliusMedHome() {
        Intent intent = new Intent(this, AureliusMedBookHome.class);
        startActivity(intent);
    }
}
