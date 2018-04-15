package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.EpictetusEnchiridion.TheEnchiridion;

public class EpictetusHome extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epictetus_home);
        setTitle(this.getString(R.string.Epictetus));

        //Call each activity when click corresponding button
        button = (Button) findViewById(R.id.epictetus_enchiridion);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpictetusEnchiridion();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void EpictetusEnchiridion() {
        Intent intent = new Intent(this, TheEnchiridion.class);
        startActivity(intent);
    }
}
