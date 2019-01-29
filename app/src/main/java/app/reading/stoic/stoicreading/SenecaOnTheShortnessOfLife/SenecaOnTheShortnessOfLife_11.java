package app.reading.stoic.stoicreading.SenecaOnTheShortnessOfLife;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.reading.stoic.stoicreading.R;

public class SenecaOnTheShortnessOfLife_11 extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_on_the_shortness_of_life_11);
        setTitle(this.getString(R.string.SenecaOnTheShortnessOfLifeTitle11));
    }
}
