package app.reading.stoic.stoicreading.EpictetusEnchiridion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.reading.stoic.stoicreading.R;

public class TheEnchiridion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_enchiridion);
        setTitle(this.getString(R.string.EpictetusEnchiridionTitle));
    }
}
