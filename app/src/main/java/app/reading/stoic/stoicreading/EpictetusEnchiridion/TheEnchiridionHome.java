package app.reading.stoic.stoicreading.EpictetusEnchiridion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;


public class TheEnchiridionHome extends AppCompatActivity {
    private Button button;
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
        setTitle(this.getString(R.string.EpictetusEnchiridionTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.enchiridion_part_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TheEnchiridion_Part1();
            }
        });

        button = findViewById(R.id.enchiridion_part_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TheEnchiridion_Part2();
            }
        });

        button = findViewById(R.id.enchiridion_part_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TheEnchiridion_Part3();
            }
        });

        button = findViewById(R.id.enchiridion_part_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TheEnchiridion_Part4();
            }
        });

        button = findViewById(R.id.enchiridion_part_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TheEnchiridion_Part5();
            }
        });
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
