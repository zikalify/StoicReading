package app.reading.stoic.stoicreading.EpictetusDiscourses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.EpictetusDiscourses.BookFour.BookFour_Home;
import app.reading.stoic.stoicreading.EpictetusDiscourses.BookOne.BookOne_Home;
import app.reading.stoic.stoicreading.EpictetusDiscourses.BookThree.BookThree_Home;
import app.reading.stoic.stoicreading.EpictetusDiscourses.BookTwo.BookTwo_Home;
import app.reading.stoic.stoicreading.R;


public class DiscoursesHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_discourses_home);
        setTitle(this.getString(R.string.EpictetusDiscoursesTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.DiscoursesBookOne);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiscoursesBookOne();
            }
        });

        button = findViewById(R.id.DiscoursesBookTwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiscoursesBookTwo();
            }
        });

        button = findViewById(R.id.DiscoursesBookThree);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiscoursesBookThree();
            }
        });

        button = findViewById(R.id.DiscoursesBookFour);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiscoursesBookFour();
            }
        });

    }

    //Activity call methods, called by buttons above
    public void DiscoursesBookOne() {
        Intent intent = new Intent(this, BookOne_Home.class);
        startActivity(intent);
    }

    public void DiscoursesBookTwo() {
        Intent intent = new Intent(this, BookTwo_Home.class);
        startActivity(intent);
    }

    public void DiscoursesBookThree() {
        Intent intent = new Intent(this, BookThree_Home.class);
        startActivity(intent);
    }

    public void DiscoursesBookFour() {
        Intent intent = new Intent(this, BookFour_Home.class);
        startActivity(intent);
    }

}
