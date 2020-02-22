package app.reading.stoic.stoicreading.EpictetusEnchiridion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;


public class TheEnchiridionHome extends AppCompatActivity {
    private static final String PREFS_NAME = "prefs";
    private static final String PREF_DARK_THEME = "dark_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean useDarkTheme = preferences.getBoolean(PREF_DARK_THEME, false);

        if (useDarkTheme) {
            setTheme(R.style.AppThemeDark);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_enchiridion_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.EpictetusEnchiridionTitle));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.enchiridion_part_1);
        button.setOnClickListener(v -> TheEnchiridion_Part1());

        button = findViewById(R.id.enchiridion_part_2);
        button.setOnClickListener(v -> TheEnchiridion_Part2());

        button = findViewById(R.id.enchiridion_part_3);
        button.setOnClickListener(v -> TheEnchiridion_Part3());

        button = findViewById(R.id.enchiridion_part_4);
        button.setOnClickListener(v -> TheEnchiridion_Part4());

        button = findViewById(R.id.enchiridion_part_5);
        button.setOnClickListener(v -> TheEnchiridion_Part5());
    }

    //Activity call methods, called by buttons above
    public void TheEnchiridion_Part1() {
        Intent intent = new Intent(this, TheEnchiridion_Part1.class);
        startActivity(intent);
    }

    public void TheEnchiridion_Part2() {
        Intent intent = new Intent(this, TheEnchiridion_Part2.class);
        startActivity(intent);
    }

    public void TheEnchiridion_Part3() {
        Intent intent = new Intent(this, TheEnchiridion_Part3.class);
        startActivity(intent);
    }

    public void TheEnchiridion_Part4() {
        Intent intent = new Intent(this, TheEnchiridion_Part4.class);
        startActivity(intent);
    }

    public void TheEnchiridion_Part5() {
        Intent intent = new Intent(this, TheEnchiridion_Part5.class);
        startActivity(intent);
    }
}
