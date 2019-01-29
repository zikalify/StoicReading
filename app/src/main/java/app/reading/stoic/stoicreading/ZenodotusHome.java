package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import app.reading.stoic.stoicreading.ZenodotusEpitaph.ZenodotusEpitaph;

public class ZenodotusHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_zenodotus_home);
        setTitle(this.getString(R.string.Zenodotus));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.zenodotus_epitaph);
        button.setOnClickListener(v -> ZenodotusEpitaph());
    }

    //Activity call methods, called by buttons above
    public void ZenodotusEpitaph() {
        Intent intent = new Intent(this, ZenodotusEpitaph.class);
        startActivity(intent);
    }
}