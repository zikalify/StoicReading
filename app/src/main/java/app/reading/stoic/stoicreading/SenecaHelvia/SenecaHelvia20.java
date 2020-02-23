package app.reading.stoic.stoicreading.SenecaHelvia;

import androidx.appcompat.app.AppCompatActivity;
import app.reading.stoic.stoicreading.R;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;

public class SenecaHelvia20 extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_helvia20);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.SenecaHelviaTitle20));
    }
}