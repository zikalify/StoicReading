package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import app.reading.stoic.stoicreading.EpictetusDiscourses.DiscoursesHome;
import app.reading.stoic.stoicreading.EpictetusEnchiridion.TheEnchiridionHome;

public class EpictetusHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_epictetus_home);
        setTitle(this.getString(R.string.Epictetus));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.epictetus_enchiridion);
        button.setOnClickListener(v -> EpictetusEnchiridion());

        button = findViewById(R.id.epictetus_discourses);
        button.setOnClickListener(v -> EpictetusDiscourses());
    }

    //Activity call methods, called by buttons above
    public void EpictetusEnchiridion() {
        Intent intent = new Intent(this, TheEnchiridionHome.class);
        startActivity(intent);
    }

    public void EpictetusDiscourses() {
        Intent intent = new Intent(this, DiscoursesHome.class);
        startActivity(intent);
    }
}
